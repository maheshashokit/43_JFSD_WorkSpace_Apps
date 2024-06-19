package com.ashokit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.ashokit.model.SignUp;

public class SignUpDao {
	
	private static Connection con = null;
	private PreparedStatement pstmt = null;
	private Statement stmt = null;
	
	//One-time activity logic for obtaining connection object
	static {
		try {
		//Registering the Jdbc Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Getting Connection object
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		}catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException .....");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("SQLException........");
			e.printStackTrace();
		}
	}
	
	//Creating DAO Method to insert data into database
	public boolean createSignUpUser(SignUp signUp) {
		try {
			 //checking con object
			 if(Objects.nonNull(con)) {
				 //creating the PreparedStatement object
				 pstmt = con.prepareStatement("insert into ashokit_signup values(signup_seq.nextval,?,?,?,?,?,?)");
				 
				 //setting the values for PlaceHolders
				 pstmt.setString(1, signUp.getFullName());
				 pstmt.setString(2, signUp.getUserEmail());
				 pstmt.setString(3, signUp.getContactNo());
				 pstmt.setString(4, signUp.getCourses());
				 pstmt.setTimestamp(5, new java.sql.Timestamp(new java.util.Date().getTime()));
				 pstmt.setString(6, signUp.getFullName());
				 
				 //executing the PreparedStatement
				 int rowCount = pstmt.executeUpdate();
				 
				 //returning boolean value based on rowCount;
				 return rowCount > 0;
			 }
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
	//Creating DAO Method to insert data into database
		public boolean updateSignUpUser(SignUp signUp) {
			try {
				 //checking con object
				 if(Objects.nonNull(con)) {
					 //creating the PreparedStatement object
					 pstmt = con.prepareStatement("update ashokit_signup set emailId=?,contactno=? where signup_id=?");
					 
					 //setting the values for PlaceHolders
					 pstmt.setString(1, signUp.getUserEmail());
					 pstmt.setString(2, signUp.getContactNo());
					 pstmt.setString(3, signUp.getSignUpId());
					 
					 //executing the PreparedStatement
					 int rowCount = pstmt.executeUpdate();
					 
					 //returning boolean value based on rowCount;
					 return rowCount > 0;
				 }
				
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
			return false;
		}
	
	public List<SignUp> getAllSignUp(){
		List<SignUp> signUpList = new ArrayList<>();
		try {
			
			if(Objects.nonNull(con)) {
				//created statement object
				stmt = con.createStatement();
				
				//executing the select Query
				ResultSet rs = stmt.executeQuery("select username,emailId,contactno,courses,signup_id from ashokit_signup");
				
				//processing the ResultSet object and preparing signup for each record
				while(rs.next()) {
					
					//Collecting Each row values
					String uname = rs.getString(1);
					String emailId = rs.getString(2);
					String contactNo = rs.getString(3);
					String courses = rs.getString(4);
					String signUpId = rs.getString(5);

					//Preparing SignUp Object
					SignUp signUp = new SignUp(uname, emailId, contactNo, courses,signUpId);
					
					//adding SignUp object to list object
					signUpList.add(signUp);					
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return signUpList;
	}
}
