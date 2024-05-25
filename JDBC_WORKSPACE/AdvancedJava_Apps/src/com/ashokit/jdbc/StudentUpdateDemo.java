package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentUpdateDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1.Registering the JDBC Driver with DriverManager Class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		try(
		     //2.Getting connection object using DriverManager Service
		      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			 
		     //3 creating statement object to execute SQL Queries
			 Statement st = con.createStatement();
				
			 //4 Scanner resource
			 Scanner sc = new Scanner(System.in);
		   ){
			
			System.out.println("Enter Student-ID to Update Record");
			int studentId = sc.nextInt();
		
			System.out.println("Enter Student Locationt to Update");
			String studentLocation = sc.next();
			
			//5.Preparing Update SQL Query
			String update_Query = 
				"update ashokit_students set student_location='"+studentLocation+"' where student_id="+ studentId;
			
			//6 executing the sql query
			int rowAffectedCount = st.executeUpdate(update_Query);
			
			//7.processing the rowCount
			if(rowAffectedCount != 0) {
				System.out.println(studentId +" is Updated with Location "+ studentLocation);
			}else {
				System.out.println("Given StudentId is not available in Database....");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
