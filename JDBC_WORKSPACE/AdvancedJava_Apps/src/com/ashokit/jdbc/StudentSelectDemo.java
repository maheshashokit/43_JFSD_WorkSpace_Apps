package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentSelectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
				
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			ResultSet rs = st.executeQuery("select student_id,student_name,student_location,contact_no from ashokit_students");
		   ){
			
			//processing the resultSet
			System.out.println("Processing the ResultSet From Top To Bottom");
			while(rs.next()) {
				System.out.println(rs.getRow()+"---"+rs.getString(1)+"---"+rs.getString(2)+"---"+rs.getString(3)+"---"+ rs.getString(4));
			}
			
			System.out.println("************************************************");
			//processing the resultSet
			System.out.println("Processing the ResultSet From Bottom To Top");
			while(rs.previous()) {
				System.out.println(rs.getRow()+"---"+rs.getString(1)+"---"+rs.getString(2)+"---"+rs.getString(3)+"---"+ rs.getString(4));
			}
			System.out.println("Working with Absolute()......");
			if(rs.absolute(4)) {
				System.out.println(rs.getRow()+"---"+rs.getString(1)+"---"+rs.getString(2)+"---"+rs.getString(3)+"---"+ rs.getString(4));
			}
			System.out.println("Working with Absolute()......");
			if(rs.absolute(-6)) {
				System.out.println(rs.getRow()+"---"+rs.getString(1)+"---"+rs.getString(2)+"---"+rs.getString(3)+"---"+ rs.getString(4));
			}
			System.out.println("Working with relative()......");
			if(rs.relative(3)) {
				System.out.println(rs.getRow()+"---"+rs.getString(1)+"---"+rs.getString(2)+"---"+rs.getString(3)+"---"+ rs.getString(4));
			}
			System.out.println("Working with relative()......");
			if(rs.relative(-2)) {
				System.out.println(rs.getRow()+"---"+rs.getString(1)+"---"+rs.getString(2)+"---"+rs.getString(3)+"---"+ rs.getString(4));
			}
			
			System.out.println("Checking ResultSet Pointer::::" + rs.isBeforeFirst());
			System.out.println("Checking ResultSet Pointer::::" + rs.isAfterLast());
			rs.beforeFirst();
			System.out.println("Checking ResultSet Pointer::::" + rs.isBeforeFirst());
			rs.afterLast();
			System.out.println("Checking ResultSet Pointer::::" + rs.isAfterLast());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
