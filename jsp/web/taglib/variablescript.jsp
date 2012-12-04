<%@ page errorPage="erreur.jsp" %>

<%@ taglib uri="monTag" prefix="montagamoi" %>

<montagamoi:variablescript name="value" >
<%= pageContext.getAttribute("value") %><br>
</montagamoi:variablescript>
<%= pageContext.getAttribute("value") %><br>