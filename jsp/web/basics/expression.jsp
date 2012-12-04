<%-- 
    Document   : expression
    Created on : Jun 28, 2011, 4:02:35 PM
    Author     : bailett


Notice that each time you reload the page in the browser, it comes up 
with the current time. The character sequences <%= and %> enclose Java 
expressions, which are evaluated at run time.

This is what makes it possible to use JSP to generate dyamic HTML pages 
that change in response to user actions or vary from user to user.

Exercise:  Write a JSP to output the values returned by System.getProperty
for various system properties such as java.version, java.home, os.name, 
user.name, user.home, user.dir etc. 

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <HTML>
        <BODY>
            Hello!  The time is now <%= new java.util.Date()%>
        </BODY>
    </HTML>
</body>
</html>
