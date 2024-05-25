package com.ashokit.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PreparedStatementStudentsDateDemo {
	
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
			 PreparedStatement pstmt = con.prepareStatement("insert into ashokit_students values(ashokit_students_seq.nextval,?,?,?,?,?,?,?)");
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
				   pstmt.setString(2, values[1]); //location
				   pstmt.setString(3, values[2]); //contactno
 				   pstmt.setDate(4, new java.sql.Date(new java.util.Date().getTime())); // created Date
 				   pstmt.setString(5, values[0]); // created by
 				   pstmt.setTimestamp(6, new Timestamp(new java.util.Date().getTime()));
 				   
 				   //logic for adding date of joining
 				   String joiningDateValue = values[3];
 				   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
 				   //converting string type of date values into java.util.Date Object
 				   Date dateOfJoining = sdf.parse(joiningDateValue);
 				   pstmt.setDate(7, new java.sql.Date(dateOfJoining.getTime()));
				   
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
