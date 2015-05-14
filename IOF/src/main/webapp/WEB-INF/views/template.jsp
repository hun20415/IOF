<%@page import="java.net.URLDecoder"%>
<%@page import="java.awt.print.Printable"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String content = request.getParameter("CONTENT");
	String pagename = request.getParameter("PAGENAME");
	
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../css/index_page_temp.css" rel="stylesheet" type="text/css">
<title><%=pagename%></title>
</head>
<body>

	<jsp:include page="template/header.jsp"  />
<%-- 	<center>
		<jsp:include page="template/navigationbar.jsp" flush="false"/>
	</center> --%>
	
	<div id="container">

		<jsp:include page="template/sidebar.jsp" flush="false"/>
		
		
		<div id="content">
			<!-- 본문 content 입력 -->			
			<jsp:include page="<%=content%>" flush="false"/>
		</div>


	</div>
	<center>
		<jsp:include page="template/footer.jsp" flush="false"/>
	</center>
</body>
</html>
