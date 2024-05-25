package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeSelectDemo {

	public static void main(String[] args)throws ClassNotFoundException{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
	        
			Scanner sc = new Scanner(System.in);
			
			Statement st = con.createStatement();	
		   ){
			
			//Reading input from User
			System.out.println("Enter Department Name..");
			String deptName = sc.next();
			
			//Preparing the query
			String select_query ="select e.empno,e.ename,e.sal,d.dname from emp e "
					+ "join dept d on e.deptno = d.deptno where d.dname='"+deptName.toUpperCase()+"'";
			System.out.println(select_query);

			//executing the sql query
			ResultSet rs = st.executeQuery(select_query);
			
			//processing the ResultSet
			while(rs.next()) {
				//getting the data from selected data
				//System.out.println(rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3)+"-"+ rs.getString(4));
				System.out.println(rs.getString("empno")+"-"+rs.getString("ename")+"-"+rs.getString("sal")+"-"+ rs.getString("dname"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
