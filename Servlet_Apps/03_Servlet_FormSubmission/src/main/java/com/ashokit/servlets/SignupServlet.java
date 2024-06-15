package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class SignupServlet extends GenericServlet {
	
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		//1.setting contenttype 
		response.setContentType("text/html");
		
		//2.Getting Writer object
		PrintWriter pw = response.getWriter();
		
		//3.capturing the form data via request parameters
		Map<String, String[]> requestParams = request.getParameterMap();
		
		//4.Displaying the requestParameters in table format
		pw.println("<div style='text-align:center;color:blue;'>Welcome To AshokIT Form Data Submitted...</div>");
		pw.println("<div style='text-align:center;'>");
		requestParams.entrySet().stream().forEach(entry ->{
			pw.println("<span style='color:red;'>"+ entry.getKey()+"</span><span style='color:green'>"+Arrays.toString(entry.getValue())+"</span>");
		});
		pw.println("</div>");
	}
}
