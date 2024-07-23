<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <jsp:include page="header.jsp"/>
   <%
   	 if("Mahesh".equals("Mahesh") && "Mahesh".equals("Mahesh111111111")){
   %>
   <jsp:forward page="status.jsp">
      <jsp:param name="message" value="Login Success"/>
   </jsp:forward>
  
   <% }else { %>
  	<jsp:forward page="status.jsp">
      <jsp:param name="message" value="Login Credentials are Invalid...."/>
   </jsp:forward>
   <% } %>
</body>
</html>