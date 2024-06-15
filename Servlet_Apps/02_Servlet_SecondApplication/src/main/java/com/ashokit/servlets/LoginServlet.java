package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class LoginServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		//1.setting contentType 
		response.setContentType("text/html");
		
		//2.getting writer object
		PrintWriter pw = response.getWriter();
		
		//3.preparing the response
		pw.println("<div style='text-align:center;color:red;'>Welcome To AshokIT For WebApplication Development.....</div>");
		
		//4.Reading the Request parameters using first approach
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		pw.println("<div style='text-align:center;border:1px solid'>");
		pw.println("<span style='color:blue;'>Username :::"+username+"</span>");
		pw.println("<span style='color:blue;'>Password :::"+password+"</span>");
		pw.println("</div>");
		
		//5.reading the request Parameters using Second Approach
		Map<String,String[]> requestParams = request.getParameterMap();
		//Processing the map object using java8 streams
		pw.println("<hr/>");
		pw.println("<div style='text-align:center;color:red;'>");
		requestParams.entrySet().stream().forEach((entry) ->{
			pw.println("<span>"+entry.getKey() +"------->"+ Arrays.toString(entry.getValue())+"</span>");
		});
		pw.println("</div>");
		
		//6.Reading the request parameters using third approach
		pw.println("<hr/>");
		pw.println("<div style='text-align:center;color:blue'>");
		Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			
			//getting the current parameter name
			String parameterName = parameterNames.nextElement();
			
			//getting the request parameter value
			String parameterValue = request.getParameter(parameterName);
			
			pw.println("<span>"+parameterName+"===============" +parameterValue+"</span><br/>");
		}
		pw.println("<div>");
		
		
	}

}
