package com.ashokit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

import com.ashokit.dao.SignUpDao;
import com.ashokit.model.SignUp;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditSignUpDetailsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private ServletConfig config = null;
	
	public void init() throws ServletException {
		this.config = config;
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Inside EditSignUpDetailsServlet.....");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		//Read the requestParameter
		String signUpId = request.getParameter("signUpId");
		System.out.println("SignUpId::::::" + signUpId);
		
		//creating signupDao object
		SignUpDao signUpDao = new SignUpDao();
		
		//Getting all signup Information 
		List<SignUp> allSignUp = signUpDao.getAllSignUp();
		
		//convert into stream object
		Optional<SignUp> signUpInfo = allSignUp.stream().filter(eachSignup -> signUpId.equals(eachSignup.getSignUpId())).findAny();
		
		ServletConfig config = getServletConfig();
		System.out.println("Config Object From Edit :::" + config);
		System.out.println("Implementation Class :::" + config.getClass().getName());		
		System.out.println("Username :::::" + config.getServletContext().getInitParameter("Username")); 
		System.out.println("Password :::::" + config.getServletContext().getInitParameter("Password")); 
		
		if(signUpInfo.isPresent()) {
			//getting particular SignUp record.
			SignUp signUp = signUpInfo.get();
			
			//prepare the Edit Form
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<div style='text-align:center;color:red;'>Welcome To AshokIT For Signup Detail.....</div>");
			pw.println("<form action='signup' method='post'>");
			pw.println("<table align='center'>");
			pw.println("<tr><td>Username</td><td><input type='text' name='fullname' value="+signUp.getFullName()+" readonly /></td></tr>");
			pw.println("<tr><td>Email</td><td><input type='text' name='userEmail' value='"+signUp.getUserEmail()+"'/> </td></tr>");
			pw.println("<tr><td>ContactNo</td><td><input type='text' name='contactNo' value='"+signUp.getContactNo()+"'/></td></tr>");
			pw.println("<tr><td>Course</td><td><input type='text' name='courses' value="+signUp.getCourses()+" readonly /></td></tr>");
			pw.println("<input type='hidden' name='signUpId' value='"+signUp.getSignUpId()+"'/>");
			pw.println("<input type='hidden' name='action' value='edit'/>");
			pw.println("</table>");
			pw.println("<div style='text-align:center'>");
			pw.println("<input type='submit' value='UpdateDetails'/>");
			pw.println("</div>");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");
			
		}
	   
		
		
		
		
	}

	

}
