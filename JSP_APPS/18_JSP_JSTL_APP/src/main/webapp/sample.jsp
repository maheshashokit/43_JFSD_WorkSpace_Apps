<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Core Tags</title>
</head>
<body>
      <!-- Declaring Variable in JSP Page -->
	<c:set var="Message" value="Welcome To AshokIT" scope="request"/>
	<c:set var="Message1" value="Welcome To AshokIT1" scope="session"/>
	<c:set var="Message2" value="Welcome To AshokIT2" scope="application"/>
	<c:set var="Message3" value="Welcome To AshokIT3"/>
	<c:set var="userName" value="Mahesh1"/>
	<c:set var="amount" value="15000"/>
	
	  <!--  Displaying data from Requestscope -->
    Request Scope ::::: ${requestScope.Message}<br/>
    Session Scope ::::: ${sessionScope.Message1}<br/>
    Application Scope ::::: ${applicationScope.Message2}<br/>
    No Scope ::::: ${Message3}<br/><br/><br/>
    
      <!-- Displaying Data using JSTL Tag -->
     <c:out value="${requestScope.Message}"/><br/>
     <c:out value="${sessionScope.Message1}"/><br/>
     <c:out value="${applicationScope.Message2}"/><br/>
     <c:out value="${Message3}"/><br/><br/>
     
       <!-- Writing If Condition using JSTL Core Tags -->
      <c:if test="${fn:contains(userName,'Mahesh')}">
          Welco2323232me To AshokIT UserName ::::<c:out value="${userName}"/>
      </c:if>
       
        <!-- Writing the switch statements using JSTL Core Tags -->
      <c:choose>
    		<c:when test="${amount gt 1000 and amount le 5000}">   
    			First When Block <c:out value="${1*amount}"/>		
    		</c:when>
    		
    		<c:when test="${amount gt 5000}">   
    			Second when Block <c:out value="${2*amount}"/>		
    		</c:when>
    		
    		<c:otherwise>
    		     Can't be calculated Inside otherwise 
    		</c:otherwise>
      </c:choose><br/>
      
      UpperCase<c:out value ="${fn:toUpperCase(userName)}"/><br/>
      LowerCase<c:out value ="${fn:toLowerCase(userName)}"/>
      
        
</body>
</html>