
<%@page import="java.util.Date"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


        <h1>Hello World!lll</h1>
        
    
Protocol : <%=request.getProtocol() %><br> 
Scheme : <%=request.getScheme() %><br> 
ServerName : <%= request.getServerName() %><br> 
ServerPort : <% out.println(request.getServerPort()); %><br> 
RemoteAddr : <% out.println(request.getRemoteAddr()); %><br> 



  
    </body>
</html>
