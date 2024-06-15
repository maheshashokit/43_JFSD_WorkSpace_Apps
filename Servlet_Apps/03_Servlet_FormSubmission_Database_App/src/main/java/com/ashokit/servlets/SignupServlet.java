package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.ashokit.dao.SignUpDao;
import com.ashokit.model.SignUp;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class SignupServlet extends GenericServlet {
	
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		//1.setting contentType 
		response.setContentType("text/html");
		
		//2.Getting Writer object
		PrintWriter pw = response.getWriter();
		
		//3.capturing the form data via request parameters
		String name = request.getParameter("fullname");
		String userEmail = request.getParameter("userEmail");
		String contactNo = request.getParameter("contactNo");
		String courses = request.getParameter("courses");
		
		//4.creating signup object to set form data
		SignUp signUp = new SignUp(name, userEmail, contactNo, courses);
		
		//5.Creating the SignupDao Object
		SignUpDao signUpDao = new SignUpDao();
		
		//6. calling DAO method
		boolean signupStatus = signUpDao.createSignUpUser(signUp);
		
		//7.Prearing response sent back to client
		if(signupStatus) {
			pw.println("<div style='text-align:center;color:red;'>Record Saved Into Database Successfully</div>");
			
			//To get All records information from database
			List<SignUp> allUsersData = signUpDao.getAllSignUp();
			
			//preparing the response for all users
			pw.println("<table border='2' align='center'>");
			pw.println("<thead><tr><th>Username</th><th>EmailID</th><th>ContactNo</th><th>Courses</th></tr></thead>");
			pw.println("<tbody>");
			allUsersData.forEach((eachUser) ->{
			    pw.println("<tr><td>"+eachUser.getFullName()+"</td><td>"+eachUser.getUserEmail()+"</td><td>"+eachUser.getContactNo()+"</td><td>"+eachUser.getCourses()+"</td></tr>");
			});
			pw.println("</tbody>");
		}
	}
}
