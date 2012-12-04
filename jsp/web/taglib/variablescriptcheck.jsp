<%@ page errorPage="erreur.jsp" %>

<%@ taglib uri="monTag" prefix="montagamoi" %>

<montagamoi:variablescript name="<%= 'coucou' %>" >
<%= value %><br>
</montagamoi:variablescript>
