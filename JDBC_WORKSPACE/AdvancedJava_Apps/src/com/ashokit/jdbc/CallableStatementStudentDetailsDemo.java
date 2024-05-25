package com.ashokit.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementStudentDetailsDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			
			Scanner sc = new Scanner(System.in);
				
			CallableStatement cstmt = con.prepareCall("{call Get_StudentDetails_ById(?,?,?,?)}");
				
		   ){
			
			System.out.println("Enter StudentID To Fetch Details....");
			int customerId = sc.nextInt();
			
			//Registering the output parameter
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.VARCHAR);
			cstmt.registerOutParameter(4, Types.VARCHAR);
			
			//Registering the input parameters
			cstmt.setInt(1,customerId);
			
			//executing the stored procedure 
			boolean procedureFlag = cstmt.execute();
			
			if(!procedureFlag) {
				System.out.println("Procedure Executed Successfully");
				
				//collect output variable values
				String studentName = cstmt.getString(2);
				String location = cstmt.getString(3);
				String contactNo = cstmt.getString(4);
				System.out.println(customerId+"======"+studentName +"==========" + location+"============="+contactNo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
