<%-- 
    Document   : speddUp
    Created on : Jul 1, 2011, 11:42:57 AM
    Author     : bailett
--%>


<jsp:useBean id="maVoiture" scope="session" class="com.oalam.bean.Voiture" />


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <jsp:getProperty name="maVoiture" property="<%  request. %>" />

<js
    </body>
</html>

