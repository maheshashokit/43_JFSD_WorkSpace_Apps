package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class DateAndTimeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		//1.setting contentType for response
		response.setContentType("text/html");
		
		//2.Getting Writer object to send some data as response
		PrintWriter pw = response.getWriter();
		
		//3.Preparing the Response
		pw.println("<div style='text-align:center;color:red;'>Welcome To AshokIT For WebApplication Development......</div>");
		
		//creating the object for date & time
		LocalDateTime currentDate = LocalDateTime.now();
		pw.println("<span style='text-align:center;color:blue;'>Current Date & Time is ::::"+currentDate.toString()+"</span>");
	}

}
