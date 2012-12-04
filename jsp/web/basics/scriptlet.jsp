<%-- 
    Document   : scriptlet
    Created on : Jun 28, 2011, 4:04:47 PM
    Author     : bailett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
            <%
                // This is a scriptlet.  Notice that the "date"
                // variable we declare here is available in the
                // embedded expression later on.    
                System.out.println("Evaluating date now");
                java.util.Date date = new java.util.Date();
            %>
            Hello!  The time is now <%= date%></P>
        <p>
            No really, the time is now
            <%
                // This scriptlet generates HTML output
                out.println(String.valueOf(date));
                out.println(request.getRemoteHost());
            %>
        </p>
        <p>
        <TABLE BORDER=2>
            <%
                for (int i = 0; i < 10; i++) {
            %>
            <TR>
                <TD>Number</TD>
                <TD><%= i + 1%></TD>
            </TR>
            <%
                }
            %>
        </TABLE>
    </p>
</body
</html >
