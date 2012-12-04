<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head><title>Localized Dates</title></head>
    <body bgcolor="white">
	<form action="/tirage" method="post">
	    <%
		for (int i = 1; i < 3; i++) {
		    out.println("Numéro " + i + ": <select name=\"number" + i + "\">");
		    for (int j = 1; j <= 10; j++) {
			out.println("<option value=\"" + j + "\">" + j + "</option>");
		    }
		    out.println("</select><br />");
		}
	    %>
	    <br />
	    <input type="submit" value="Valider" />
	</form>
    </body>
</html>