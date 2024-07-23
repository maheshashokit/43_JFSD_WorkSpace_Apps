<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>courses.jsp</title>
</head>
<body>
   <%
       //collecting the data from request scope
       List<String> courses = (List<String>) request.getAttribute("coursesList");
   	   out.println("courses Names::::" + courses+"<br/><br/>");
   	   for(String courseName : courses){
   %>
   CourseName ::::: <%= courseName %><br/>
   <% } %>
   <br/><br/>
   <select name="courses">
   	  <%
   			List<String> courseNames = (List<String>) request.getAttribute("coursesList");
   			for(String courseName : courses){
   	  %>
   	  <option value='<%= courseName %>'><%= courseName %></option>
   	  <% } %>
   </select>
</body>
</html>