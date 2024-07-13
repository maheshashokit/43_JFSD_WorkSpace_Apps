package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// setting content type
		response.setContentType("text/html");

		// Getting Writer Object
		PrintWriter pw = response.getWriter();

		// Preparing the Response for Servlet1
		pw.println("<div style='text-align:center;color:red'>Hyderabad</div>");
		
		
		//Getting RequestDispatcher Object
		RequestDispatcher rd = request.getRequestDispatcher("/serv3");
		rd.include(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
