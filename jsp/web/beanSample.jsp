<%-- 
    Document   : beanSample
    Created on : Jul 1, 2011, 11:37:29 AM
    Author     : bailett
--%>


<jsp:useBean id="maVoiture" scope="session" class="com.oalam.bean.Voiture" />
<jsp:setProperty name="maVoiture" property="started" value="true" />
<jsp:setProperty name="maVoiture" property="speed" value="34.5" />

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
        
        <%= maVoiture.getSpeed() %> 
        
        
    </body>
</html>
