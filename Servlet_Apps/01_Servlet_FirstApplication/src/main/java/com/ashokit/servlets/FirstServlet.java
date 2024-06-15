package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/demo")
public class FirstServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		//1.We need to inform to browser for rendering HTML Code
		response.setContentType("text/html"); //application/json, application/xml,
		
		//2.Writing the data into response object
		PrintWriter pw = response.getWriter();
		
		//3.Now Writing the data
		pw.println("<div style='text-align:center;color:blue;'>Welcome To AshokIT For First Servlet........</div>");
	}
}