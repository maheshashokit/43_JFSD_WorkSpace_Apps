<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" 
			isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>test.jsp</title>
</head>
<body>
	${requestScope.Username}<br/>
	${sessionScope.loginMessage}<br/>
	${applicationScope.databaseName}   
</body>
</html>