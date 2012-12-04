<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : newjsp
    Created on : Oct 25, 2012, 8:57:31 PM
    Author     : tom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
	
    <c:if test="${a<1}" var="x">
    </c:if>
    
    <c:choose>
	<c:when test="">
	</c:when>
	<c:otherwise>
	</c:otherwise>
    </c:choose>

    </body>
</html>
