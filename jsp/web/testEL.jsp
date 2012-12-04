<%-- 
    Document   : testEL
    Created on : Jul 1, 2011, 3:32:47 PM
    Author     : bailett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="maVoiture" scope="session" class="beans.Voiture" />
<jsp:setProperty name="maVoiture" property="speed" value="13.9" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%@ page isELIgnored="false" %> 
<% pageContext.setAttribute("mot1", "BONJOUR", PageContext.SESSION_SCOPE); %> 
<% pageContext.setAttribute("mot2", "AuRevoir", PageContext.APPLICATION_SCOPE); %> 
PageScope : ${pageScope["mot1"]} <br> 

Voiture : ${sessionScope["maVoiture"].speed} <br> 
Voiture : ${maVoiture.speed} <br> 


???Scope : ${mot2} <br> 
${pageContext.response.contentType} <br> 

Paramètre "toto" : ${param["toto"]} <br> 
Paramètre "tutu" : ${param["tutu"]} <br> 



<c:out value="${header['user-agent']}" default="Inconnu" />

    </body>
</html>
