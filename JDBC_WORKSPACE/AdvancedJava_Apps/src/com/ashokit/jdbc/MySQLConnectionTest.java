package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/43_advancedjava", "root", "root");
		
		if(con != null) {
			System.out.println("Database Connected....");
		}else {
			System.out.println("Database Not Connected....");
		}
	}

}
