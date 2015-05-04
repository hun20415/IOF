
<%
	String memid = (String) request.getSession().getAttribute("id");
%>
<div id=main>
	<!-- 본문 시작 -->
	<h1>전체 사용자 정보</h1>
	<%=memid%>

	<table width="100%" cellpadding="0" cellspacing="0" border="0">
		<tr height="5">
			<td width="5"></td>
		</tr>
		<tr
			style="background: url('images/table_mid.gif') repeat-x; text-align: center;">
			<td width="5"><img src="images/table_left.gif" width="5"
				height="30" /></td>
			<td width="73">이름</td>
			<td width="80">ID</td>
			<td width="73">PW</td>
			<td width="164">권한</td>
			<td width="58">email</td>
			<td width="100">연락처</td>
			<td width="100">휴대폰</td>
			<td width="200">집주소</td>
			<td width="120">등록날짜</td>
			<td width="58">편집</td>
			<td width="7"><img src="images/table_right.gif" width="5"
				height="30" /></td>
		</tr>
		<tr height="25" align="center">
		</tr>
		<tr height="1" bgcolor="#D2D2D2">
			<td colspan="6"></td>
		</tr>

		<tr height="1" bgcolor="#82B5DF">
			<td colspan="6" width="1200"></td>
		</tr>
	</table>
	<!--  본문 끝 -->
</div>