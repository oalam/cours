<jsp:useBean id="mon_bean" class="java.util.ArrayList" scope="application" />
<%@ taglib uri="monTag" prefix="montagamoi" %>

<% mon_bean.add(new java.util.Date()); %>

<montagamoi:hellotagarraylistbis bean="${requestScope["id"]}" />