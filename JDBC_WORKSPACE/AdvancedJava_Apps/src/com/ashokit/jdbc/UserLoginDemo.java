package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserLoginDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
	   //registering the jdbc driver
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   
	   try(
			//getting the connection object
		    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "manager");
			//Creating the Scanner object   
			Scanner sc = new Scanner(System.in);
			//Creating the statement object
			Statement st = con.createStatement();
		  ){
		   //collecting inputs from keyboard
		   System.out.println("Enter Username");
		   String username = sc.next();
		   System.out.println("Enter Password");
		   String password= sc.next();
		   
		   String login_query="select count(*) from ashokit_logins where username='"+username+"' and user_password='"+ password+"'";
		   System.out.println(login_query);
		  
		   //executing the query
		   ResultSet rs  = st.executeQuery(login_query);
		   
		   //moving ResultSet from BFR to FirstRecord only
		   rs.next();
		   
		   //checking the ResultSet countValue
		   int countValue = rs.getInt(1);
		   
		   if(countValue != 0) {
			   System.out.println("Login Sucess");
		   }else {
			   System.out.println("Login Failure Check Username (or) password");
		   }		   
		   
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
		
	}
}
