<%@ page import="java.util.*, java.text.*"%>
<div id=signup>
	<!-- 본문 시작 -->
	<h1>회원가입</h1>
	<form id="signUpForm" action="signUp" method="post"
		onsubmit="return check()">
		<table>
			<tr>
				<td style="width: 200px;">아이디(ID)</td>
				<td style="width: 390px"><input type="text" name="userid"
					style="width: 50%;" /></td>
			</tr>

			<tr>
				<td>비밀번호(Password)</td>
				<td><input type="password" name="userpasswd"
					style="width: 50%;" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center; font-weight: bold;">
				</td>
			</tr>
			<tr>
				<td>비밀번호 확인(Confirm)</td>
				<td><input type="password" name="confirm" style="width: 50%;" /></td>
			</tr>
			<tr>
				<td>이름(Full Name)</td>
				<td><input type="text" name="username" style="width: 50%;" /></td>
			</tr>
			<tr>
				<td>권한(authorization)</td>
				<td><select name="usergroup">
						<!-- <option value="1">시스템관리자</option> -->
						<option value="2">관리자</option>
						<option value="3">농장주</option>

				</select></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" style="width: 80%;" /></td>
			</tr>
			<tr>
				<td>휴대폰(Mobile)</td>
				<td><input type="tel" name="mobilephone" style="width: 80%;" /></td>
			</tr>
			<tr>
				<td>집전화(tel)</td>
				<td><input type="tel" name="phone" style="width: 80%;" /></td>
			</tr>
			<tr>
				<td>우편번호</td>
				<td><input type="text" name="homeZipcode" style="width: 30%;" /></td>
			</tr>
			<tr>
				<td>주소(address)</td>
				<td><input type="text" name="homeAddr" style="width: 99%;" /></td>
			</tr>
			<%
				java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
						"yyyyMMddHHmmss");
				String today = formatter.format(new java.util.Date());
			%>
			<tr>
				<td><input type="hidden" name="sysDataTime" value="<%=today%>"/></td>
			</tr>

		</table>
		<div style="text-align: center; padding-bottom: 15px;">
			<input type="submit" value="확인" />
		</div>
	</form>
	<!--  본문 끝 -->
</div>