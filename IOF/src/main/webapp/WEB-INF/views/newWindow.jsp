﻿<%@page import="java.net.URLDecoder"%>
<%@page import="java.awt.print.Printable"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String content = request.getParameter("CONTENT");
	String pagename = request.getParameter("PAGENAME");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<link href="../css/newWindow.css" rel="stylesheet" type="text/css">
<title><%=pagename%></title>
</head>
<body>
	<div id="container">
		<div id="content">
			<!-- 본문 content 입력 -->
			<jsp:include page="<%=content%>" flush="false" />
		</div>
	</div>

</body>
</html>
