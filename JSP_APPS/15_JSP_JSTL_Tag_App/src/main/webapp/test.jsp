<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
  <c:set var="loginStatus"  value="Login Success"/> 

  <c:if test="${loginStatus eq 'Login Failure'}">
     <c:set var="statusFlag" value="false"/>  
  </c:if>
  
  <c:if test="${loginStatus eq 'Login Success' }">
      <c:set var="statusFlag" value="true"/>
  </c:if>
  
  Status Flag Value :::: <c:out value="${statusFlag}"/><br/>
  Login Status Value ::::: <c:out value="${loginStatus}"/>
  
  <br/>
  <c:choose>
       <c:when test="${statusFlag eq false}">
          <c:out value="Login Credentials are not working"/>
       </c:when>
       <c:when test="${statusFlag eq true}">
          <c:out value="Login Credentials are working"/>
       </c:when>
       <c:otherwise>
           <c:out value="Values are not getting expected"/>
       </c:otherwise>
  </c:choose>

  <c:forEach var="courseName" items="${requestScope.courses}">    
      <c:out value="${courseName}"/><br/>
  </c:forEach>
  
  <c:forTokens items="${Names}" delims="," var="currentName">
     <c:out value="${currentName}"/><br/>
  </c:forTokens>
  
   <select>
      <c:forEach var="courseName" items="${requestScope.courses}">      
            <option value="${courseName}">${courseName}</option>
      </c:forEach>
   </select>
  
  
   <select>
      <c:forTokens items="${requestScope.Names}" delims="," var="currentName">      
            <option value="${currentName}">${currentName}</option>
      </c:forTokens>
   </select>
  
  
   <c:out value="${fn:toUpperCase(loginStatus)}"/>

</body>
</html>