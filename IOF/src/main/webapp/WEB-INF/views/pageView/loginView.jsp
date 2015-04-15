
<h1>로그인</h1>
<center>
<form id="loginForm" action="login" method="post" onsubmit="return login()">
<table>
<tr>
	<td style="width: 50px;">아이디</td>
	<td style="width: 80px"><input type="text" name="id" style="width: 99%;" /></td>
</tr>
<tr>
	<td style="width: 50px;">비밀번호</td>
	<td><input type="password" name="passwd" style="width: 99%;" /></td>
</tr>

</table>
<br>
<div style="text-align: center;padding-bottom: 15px;">
	<input type="submit" value="확인" />
	<input type="button" value="회원가입" onclick="location.href='signUp'" />
</div>
</form>
</center>