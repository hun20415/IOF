<%@page import="java.net.URLDecoder"%>
<%@page import="java.awt.print.Printable"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String content = request.getParameter("CONTENT");
	String pagename = request.getParameter("PAGENAME");
%>
<!DOCTYPE html>
<html>
<head>
<link href="../css/index_page_temp.css" rel="stylesheet" type="text/css">
<title><%=pagename%></title>
</head>
<body style="background: #FAFAFA">

	<jsp:include page="template/header.jsp" />
	<%-- <center> --%>
		<jsp:include page="template/navigationbar.jsp" flush="false"/>
	<%-- </center> --%>

	<div id="container">

		<%-- <jsp:include page="template/sidebar.jsp" flush="false" /> --%>

		<%-- <center> --%>
			<div id="content" style="/* text-align: center;  */margin:auto; width: 1000px">
				<!-- 본문 content 입력 -->
				<jsp:include page="<%=content%>" flush="false" />
			</div>
		<%-- </center> --%>
    <jsp:include page="template/sidebar.jsp" flush="false" />
	</div>
	<%-- <center> --%>
		<jsp:include page="template/footer.jsp" flush="false" />
	<%-- </center> --%>
</body>
</html>
