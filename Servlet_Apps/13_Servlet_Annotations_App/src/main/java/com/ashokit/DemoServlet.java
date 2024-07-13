package com.ashokit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "demo",urlPatterns = {"/demoServ","/demoservlet"})
public class DemoServlet extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<div>Welcome To Servlet Annotation Programming......</div>");
	}
}
