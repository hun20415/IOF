<!-- 본문 시작 -->
<h1>회원가입</h1>
<form id="signUpForm" action="signUp" method="post"
	onsubmit="return check()">
	<table>
		<tr>
			<td style="width: 200px;">아이디(ID)</td>
			<td style="width: 390px"><input type="text" name="name"
				style="width: 99%;" /></td>
		</tr>
		<tr>
			<td>이름(Full Name)</td>
			<td><input type="text" name="name" style="width: 99%;" /></td>
		</tr>
		<tr>
			<td>비밀번호(Password)</td>
			<td><input type="password" name="passwd" style="width: 99%;" /></td>
		</tr>
		<tr>
			<td>비밀번호 확인(Confirm)</td>
			<td><input type="password" name="confirm" style="width: 99%;" /></td>
		</tr>
		<tr>
			<td>권한(Permissions)</td>
			<td><select name="groupList" style="width: 99%;">
					<option value="0"></option>
					<option value="1">시스템관리자</option>
					<option value="2">관리자</option>
					<option value="3">농장주</option>
				</select></td>

		</tr>
		<tr>
			<td>이메일(Email)</td>
			<td><input type="email" name="email" style="width: 99%;" /></td>
		</tr>
		<tr>
			<td>핸드폰(Mobile)</td>
			<td><input type="tel" name="mobile" style="width: 99%;" /></td>
		</tr>
		<tr>
			<td>집전화(Phone)</td>
			<td><input type="tel" name="mobile" style="width: 99%;" /></td>
		</tr>
		<tr>
            <td>우편번호(zip code)</td>
            <td><input type="text" name="zip" style="width: 99%;" /></td>
        </tr>
        <tr>
            <td>주소(address)</td>
            <td><input type="text" name="address" style="width: 99%;" /></td>
        </tr>
        
	</table>

	<div style="text-align: center; padding-bottom: 15px;">
		<input type="submit" value="확인" />
	</div>
</form>


<!--  본문 끝 -->
