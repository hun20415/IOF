﻿<!-- 본문 시작 -->
<h1>로그인</h1>
<form id="loginForm" action="login" method="post" onsubmit="return login()">
<table>
<tr>
	<td style="width: 200px;">Email</td>
	<td style="width: 390px"><input type="text" name="email" style="width: 99%;" /></td>
</tr>
<tr>
	<td>비밀번호(Password)</td>
	<td><input type="password" name="passwd" style="width: 99%;" /></td>
</tr>
</table>
<div style="text-align: center;padding-bottom: 15px;">
	<input type="submit" value="확인" />
	<input type="button" value="회원가입" onclick="location.href='signUp'" />
</div>
</form>
<!--  본문 끝 -->