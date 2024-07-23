<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" info="This is First JSP Page"
    errorPage="error.jsp" isErrorPage="false" session="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome.jsp</title>
</head>
<body>
	<jsp:directive.include file="header.jsp"/>
	<br/>
	<div style="text-align:center;color:blue;">
		<%
			Date currentDate =  new Date();
		    out.println("Current Date And Time......." + currentDate);
		    session.setAttribute("username", "Mahesh");
		%>
	</div>
	<hr/>
	<%@ include file= "footer.jsp" %>
</body>
</html>