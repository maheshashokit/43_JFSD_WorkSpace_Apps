package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementUserLoginDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
	   //registering the jdbc driver
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   
	   try(
			//getting the connection object
		    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "manager");
			//Creating the Scanner object   
			Scanner sc = new Scanner(System.in);
			//Creating the statement object
			PreparedStatement st = con.prepareStatement("select count(*) from ashokit_logins where username=? and user_password=?");
		  ){
		   
			System.out.println("Connecton Interface Implementation Class :::::" + con.getClass().getName());
			System.out.println("PreparedStatement Interface Implementation Class:::::" + st.getClass().getName());
		   //collecting inputs from keyboard
		   System.out.println("Enter Username");
		   String username = sc.next();
		   System.out.println("Enter Password");
		   String password= sc.next();
		   
		   //Setting the values for PreparedStatement
		   st.setString(1, username);
		   st.setString(2, password);
		  
		   //executing the query
		   ResultSet rs  = st.executeQuery();
		   System.out.println("ResultSet interface Implemenatation Class::::"+ rs.getClass().getName());
		   
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
