package com.ashokit.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementFunctionCustomerDetailsDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			
			Scanner sc = new Scanner(System.in);
				
			CallableStatement cstmt = con.prepareCall("{? = call calculate_total_price(?,?)}");
				
		   ){
			
			System.out.println("Enter UnitPrice To Fetch Details....");
			int unitPrice = sc.nextInt();
			System.out.println("Enter Quantity To Fetch Details....");
			int quantity = sc.nextInt();
			
			//Registering the output parameter
			cstmt.registerOutParameter(1, Types.INTEGER);
			
			//Registering the input parameters
			cstmt.setInt(2,unitPrice);
			cstmt.setInt(3,quantity);
			
			//executing the stored procedure 
			boolean procedureFlag = cstmt.execute();
			
			if(!procedureFlag) {
				System.out.println("Stored Function Executed Successfully");
				
				//collect output variable values
				String totalSales = cstmt.getString(1);
				System.out.println("Total Sales :::" + totalSales);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
