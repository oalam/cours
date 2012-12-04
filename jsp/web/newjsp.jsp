<%-- 
    Document   : newjsp
    Created on : 24 août 2011, 10:38:36
    Author     : Administrateur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="maVoiture" scope="session" class="beans.Voiture" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           Ma voiture s'apelle : <jsp:getProperty name="maVoiture" property="speed" />
    </body>
</html>
