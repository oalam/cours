<%@ taglib uri="monTag" prefix="montagamoi"%>
<jsp:useBean id="mon_bean" class="java.util.ArrayList" scope="application" />


<% mon_bean.add(new java.util.Date()); %>

<montagamoi:hellotagarraylist name="mon_bean" />
