package com.ashokit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value="/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		List<String> coursesList = new ArrayList<>();
		coursesList.add("CoreJava");
		coursesList.add("AdvancedJava");
		coursesList.add("Spring Framework");
		coursesList.add("Spring Boot Framework");
		coursesList.add("AWS");
		coursesList.add("Devops");
		
		//sharing data to jsp page using request object
		request.setAttribute("coursesList", coursesList);
		
		//redirecting the request
		RequestDispatcher rd = request.getRequestDispatcher("courses.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
