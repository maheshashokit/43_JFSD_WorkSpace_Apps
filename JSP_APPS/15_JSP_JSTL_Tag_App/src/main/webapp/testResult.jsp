<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<body bgcolor="#3cb371">
   <h3 style='text-align:center;color:yellow;"'>Welcome To AshokIT JSTL Tag Library!!!</h3>
   <div style='text-align:center;'>
   <c:forEach var="courseName" items="${requestScope.courses}" varStatus="indexStatus">
       <c:if test="${fn:containsIgnoreCase(courseName,'Spring')}">
           <c:set var="fontColor" value="pink"/>
       </c:if>
       <c:if test="${fn:containsIgnoreCase(courseName,'Spring')}">
           <c:set var="fontColor" value="blue"/>
       </c:if>
       <span style="text-align:left;color:${fontColor}"> 
        <c:out value=" ${indexStatus.index +1}.${courseName}"/>
       </span><br/>
   </c:forEach>
   <br/><br/>
   
    <c:forEach var="courseName" items="${requestScope.courses}" varStatus="indexStatus">
       <c:choose>
            <c:when test="${fn:containsIgnoreCase(courseName,'Spring')}">
                <c:set var="fontColor" value="pink"/>
            </c:when>
            <c:when test="${fn:containsIgnoreCase(courseName,'React')}">
                 <c:set var="fontColor" value="red"/>
            </c:when>
            <c:otherwise>
                <c:set var="fontColor" value="blue"/>
            </c:otherwise>
       </c:choose>
       <span style="text-align:left;color:${fontColor}"> 
         <c:out value=" ${indexStatus.index +1}.${courseName}"/>
       </span><br/>
   </c:forEach>
   </div>
   
</body>