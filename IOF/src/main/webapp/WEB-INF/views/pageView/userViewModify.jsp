<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!--                                                                                                    -->
<!--                                File Name   : userViewModify.jsp                                   -->
<!--                                Description : userModify 페이지   새창으로 출력                                                                                              -->
<!--                                Update      : 2015.05.27(박정훈)                                           -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<div id=userM>
	<!-- 본문 시작 -->
	<h1>회원 정보 수정</h1>

	<form id="userModifyForm" action="userModify" method="post"
		onsubmit="return check()">
		<table>
			<tr>
				<td style="width: 130px;background: #d2f4ec;">아이디(ID)</td>
				<td style="width: 390px"><input type="text" name="userId"
					value="${user.userId}" readonly="readonly" style="width: 50%;" /></td>
			</tr>

			<tr>
				<td style="background: #d2f4ec;">비밀번호(Password)</td>
				<td><input type="password" name="userPasswd"
					style="width: 50%;" /></td>
			
				<td colspan="2" style="text-align: center; font-weight: bold;">
				</td>
			</tr>
			<tr>
				<td style="background: #d2f4ec;">비밀번호 확인(Confirm)</td>
				<td><input type="password" name="confirm" style="width: 50%;" /></td>
			</tr>
			<tr>
				<td style="background: #d2f4ec;">이름(Full Name)</td>
				<td><input type="text" name="userName" style="width: 50%;"
					value="${user.userName}" /></td>
			</tr>
			<tr>
				<td style="background: #d2f4ec;">* 권한(authorization)</td>
				<td><select name="m_userGroupId">
						<c:forEach items="${userGroupList}" var="userGroupP">
							<c:if test="${userGroupP.userGroup != 1}">
								<option value="${userGroupP.userGroup}">${userGroupP.userGroupName}
								</option>
							</c:if>
						</c:forEach>
				</select></td>

			</tr>
			<tr>
				<td style="background: #d2f4ec;">Email</td>
				<td><input type="email" name="email" style="width: 80%;"
					value="${user.email}" /></td>
			</tr>
			<tr>
				<td style="background: #d2f4ec;">휴대폰(Mobile)</td>
				<td><input type="tel" name="mobilePhone" style="width: 80%;"
					value="${user.mobilePhone}" /></td>
			</tr>
			<tr>
				<td style="background: #d2f4ec;">집전화(tel)</td>
				<td><input type="tel" name="phone" style="width: 80%;"
					value="${user.phone}" /></td>
			</tr>
			<tr>
				<td style="background: #d2f4ec;">우편번호</td>
				<td><input type="text" name="homeZipcode" style="width: 30%;"
					value="${user.homeZipcode}" /></td>
			</tr>
			<tr>
				<td style="background: #d2f4ec;">주소(address)</td>
				<td><input type="text" name="homeAddr" style="width: 99%;"
					value="${user.homeAddr}" /></td>
			</tr>
			<tr>
				<td><input type="hidden" name="sysDataTime"
					value="${user.sysDataTime}" /></td>
			</tr>

		</table>

		<div style="text-align: center; padding-bottom: 15px;">
			<input type="submit" value="확인" />
		</div>
	</form>
	<!--  본문 끝 -->
</div>
