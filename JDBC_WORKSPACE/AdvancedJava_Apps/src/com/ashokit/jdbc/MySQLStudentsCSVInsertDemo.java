package com.ashokit.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLStudentsCSVInsertDemo {
	
	public static void main(String[] args)throws ClassNotFoundException {
		
		//Registering the Jdbc Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try( 
			 // Connecting the Database 
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/43_advancedjava","root", "root");
			
			 //locating the csv File to read the data
			 FileReader fr = new FileReader("src\\students.csv");
			
			 //Connecting to BufferedReader to read the data as line by line
			 BufferedReader br = new BufferedReader(fr);
				
			 //Statement object
			 Statement st = con.createStatement();
			){
			
			   //Reading the currentLine from CSV File
			   String currentLine = br.readLine();
			   
			   int totalRowCount = 0;
			   int noOfRows=0;
			   
			   while(currentLine != null) {
				 
				   //Indicator to know about how many rows are available in CSV File
				   noOfRows ++;
				   
				   String[] values = currentLine.split(",");
				   
				   //String insert_query ="insert into ashokit_students values(ashokit_students_seq.nextval,'"+values[0]+"','"+values[1]+"','"+values[2]+"'"+")";
				   String insert_query ="insert into ashokit_students(student_name,student_location,contact_no) values('"+values[0]+"','"+values[1]+"','"+values[2]+"'"+")";
				   System.out.println(insert_query);
				   
				   int rowCount = st.executeUpdate(insert_query);
				   
				   //Just wanted to know no of rows inserted into Database
				   totalRowCount +=rowCount;
				   
				   //Updating subsequent lines to read
				   currentLine = br.readLine();
			   }
			   
			   if(noOfRows == totalRowCount) {
				   System.out.println("All Rows are Inserted with out missing" + totalRowCount);
			   }else {
				   System.out.println("Some of Rows are missing while inserting...");
			   }
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
