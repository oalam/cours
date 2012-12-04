<%-- 
    Document   : Basic
    Created on : 24 août 2011, 09:19:25
    Author     : Administrateur
--%>

<%@page import="java.util.Date"%>
<%@page errorPage="error.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/steria.tld" prefix="st" %>


<jsp:useBean id="maVoiture" scope="session" class="beans.Voiture" />

<jsp:setProperty name="maVoiture" property="sampleProperty" value="tom" />


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <st:SuperTag  nom="iopipo" />

        <form>
            <input type="text" name="count" value="3" />
            <input type="password" name="pwd" value="tompwd" />
            <input type="submit" value="" />
        </form>
        
        
        <b>Ma voiture s'apelle : <jsp:getProperty name="maVoiture" property="sampleProperty" />
            </b>
        
        
        
        Le pwd est : <%= request.getParameter("pwd")%>
        <%
  
            
            String strCount = request.getParameter("count");
            
          
            if (strCount != null)
                {
                int count = Integer.parseInt(strCount);
                  maVoiture.setSpeed(count);

                for (int i = 0; i < count; i++) {
                    out.print("<p>plik " + i + "</p>");
                }
            }
        %>

    </body>
</html> 


