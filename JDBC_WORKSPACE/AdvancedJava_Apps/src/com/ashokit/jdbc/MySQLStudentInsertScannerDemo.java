package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySQLStudentInsertScannerDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1.Registering the Jdbc Driver with DriverManager Service
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try(
			//2.Getting Connection object through DriverManager Service	
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/43_advancedjava", "root", "root");
				
			//3.Creating the Statement Object to execute the queries
			Statement st  = con.createStatement();
				
			//Creating Scanner Class object
			Scanner sc = new Scanner(System.in);
		   ){
			 
			System.out.println("Enter Student-ID");
			int studentId = sc.nextInt();
			System.out.println("Enter Student Name");
			String studentName = sc.next();
			System.out.println("Enter Student Location");
			String location = sc.next();
			System.out.println("Enter Student ContactNo");
			String contactNo = sc.next();
			
			//4.Executing the SQL Query i.e.,Inside the try block
			//insert into ashokit_students values(2,'Ashok','Hyderabad','12323');
			String insert_query = "insert into ashokit_students values("+studentId+",'"+studentName+"','"+location+"','"+contactNo+"')";
			System.out.println(insert_query);
			int rowAffected = st.executeUpdate(insert_query);
			
			//5.Processing the Business logic
			if(rowAffected != 0) {
				System.out.println("Row Inserted Database Successfully......");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}

}