package com.ashokit.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementStudentsCSVInsertDemo {
	
	public static void main(String[] args)throws ClassNotFoundException {
		
		//Registering the Jdbc Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		try( 
			 // Connecting the Database 
			 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "manager");
			
			 //locating the csv File to read the data
			 FileReader fr = new FileReader("src\\students.csv");
			
			 //Connecting to BufferedReader to read the data as line by line
			 BufferedReader br = new BufferedReader(fr);
				
			 //Statement object
			 PreparedStatement pstmt = con.prepareStatement("insert into ashokit_students values(ashokit_students_seq.nextval,?,?,?)");
			){
			
			   //Reading the currentLine from CSV File
			   String currentLine = br.readLine();
			   
			   int totalRowCount = 0;
			   int noOfRows=0;
			   
			   while(currentLine != null) {
				 
				   //Indicator to know about how many rows are available in CSV File
				   noOfRows ++;
				   
				   String[] values = currentLine.split(",");
				   
				   //setting the values for placeHolders
				   pstmt.setString(1, values[0]); //StudentName
				   pstmt.setString(2, values[1]);
				   pstmt.setString(3, values[2]);
				   
				   int rowCount = pstmt.executeUpdate();
				   
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
