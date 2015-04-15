<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%
	String content = request.getParameter("CONTENT");
	String pagename = request.getParameter("PAGENAME");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title><%=pagename%></title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="css/index_page_temp.css" rel="stylesheet" type="text/css">
</head>
<body>
	<jsp:include page="template/header.jsp" />
	<center>
		<jsp:include page="template/navigationbar.jsp" flush="false"/>
	</center>
	<div id="container">

		<jsp:include page="template/sidebar.jsp" flush="false"/>
		<br><br><br><br>
		<jsp:include page="<%=content%>" flush="false"/>
		<div id="content">
			<!-- 본문 content 입력 -->			
		</div>


	</div>
	<center>
		<jsp:include page="template/footer.jsp" flush="false"/>
	</center>
</body>
</html>
