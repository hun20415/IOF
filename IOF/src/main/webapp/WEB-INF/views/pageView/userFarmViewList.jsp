<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="../css/" rel="stylesheet" type="text/css">
<script src="../js/newWindow.js" type="text/javascript"
	, charset="utf-8"></script>
<!--                                                                                                    -->
<!--                                File Name   : userFarmViewList.jsp                                   -->
<!--                                Description : userList 페이지   새창으로 출력                                                                                              -->
<!--                                Update      : 2015.06.03                                          -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->

<!-- 본문 시작 -->

<h1 style="position: absolute; top: 70px; left: 700px;">O O O 온실주 온실 정보</h1>

<br><br>
<table>

	<thead style="background: #d2f4ec;">
		<tr>
			<th width="50px">온실ID</th>
			<th width="50px">온실명</th>
			<th width="50px">온실주</th>
			<th width="50px">관리자</th>
			<th width="60px">비닐/유리</th>
			<th width="50px">연동(Y)</th>
			<th width="50px">건물수</th>
			<th width="50px">구역수</th>
			<th width="60px">양액/토경</th>
			<th width="100px">농장주소</th>
			<th width="50px">건립일</th>
			<th width="45px">조회</th>
			<th width="45px">수정</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listUser}" var="user">
			<tr>
				<td>${user.userId}</td>
				<td>${user.userName}</td>
				<td>${user.userGroupName}</td>
				<td>${user.mobilePhone}</td>
				<td>${user.homeAddr}</td>
				<td>${user.sysDataTime}</td>
				<td>
					<form name="userInfoForm">
						<input type="hidden" name="id" value="${user.userId}"> <input
							type="button" value="조회"
							onclick="javascript:userInfoPop(this.form);">
					</form>
				</td>
				<td>
					<form name="userModifyForm">
						<input type="hidden" name="id" value="${user.userId}"> 
						<input type="hidden" name="m_userGroupId" value="${user.userGroupId}">
						<input type="submit" value="수정" onclick="javascript:userModifyPop(this.form);">
					</form>
				</td>


				<td><button
						onclick="window.location.href='/userRemove/${user.userId}'">
						탈퇴</a></td>

			</tr>
		</c:forEach>


	</tbody>
</table>
