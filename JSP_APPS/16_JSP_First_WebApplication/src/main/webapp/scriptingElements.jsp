<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" 
errorPage="error.jsp" isErrorPage="false" import="java.util.*, java.sql.*,java.text.*"%>
<%@ page import="java.awt.*"%>
<%@ page import="javax.swing.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>scriptingElements.jsp</title>
</head>
<body>

  <jsp:declaration>
     String applicationName ="Welcome To Ashok IT";
     public String validateLogin(String username,String password){
	      if(username.equals("Mahesh")){
	    	  return "Login Success";
	      } else{
	    	  return "Login Failure";
	      }
     }
  </jsp:declaration>
  
  <jsp:scriptlet>
     String applicationName ="Welcome To Mahesh IT.....";
  	 String login_status = validateLogin("Mahesh", "Mahesh");
     out.println("Login Status::::" + login_status);
     out.println("ApplicatioName:::::" + applicationName);
     out.println("ApplicatioName:::::" + this.applicationName);
 </jsp:scriptlet>
  <hr/>
  
  <%= applicationName %><br/>
  <%= this.applicationName %><br/>
  <%= validateLogin("Ashok", "Ashok") %>

</body>
</html>