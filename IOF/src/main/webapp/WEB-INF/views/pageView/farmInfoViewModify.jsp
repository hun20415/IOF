﻿<!--                                                                                           -->
<!--                                File Name   : farmInfoViewModify.jsp                       -->
<!--                                Description : farmInfoViewModify 수정페이지                                              -->
<!--                                Update      : 2015.05.20 (옥정윤)                            -->
<!--                                ETC         :                                              -->
<!--                                                                                           -->

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/farmInfoModify.css" rel="stylesheet" type="text/css">

<!-- 본문 시작 -->
<center>
	<h1>온실 정보 수정</h1>
</center>
<form id="farmInfoModifyForm" action="farmInfoModify" method="post"
	onsubmit="return check()">
	<table class="type02">
		<tr>
			<th scope="row">*온실 ID</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.farmId}" style="width: 50%;" /></td> 
			<th scope="row">온실명</th>
			<td style="width: 390px"><input type="text" name="farmName" value="${farmInfo.farmName}" style="width: 50%;" /></td>			
		</tr>
		<tr>
			<th scope="row">*온실주 ID</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.ownerId}" style="width: 50%;" /></td> 
			<th scope="row">온실주</th>
			<td style="width: 390px"><input type="text" name="farmName" value="${farmInfo.ownerName}" style="width: 50%;" /></td>			
		
		<%-- <th scope="row">*온실 주 ID</th>
			<td style="width: 390px">
			<select name="farmId" value="${farmInfo.owner}" style="width: 50%;">
			<c:forEach items="${farmAllId}" var="cropCate">
			<option value="${farmInfo.owner}">Volvo</option>
			</c:forEach>
			</select>
			</td> 
			<th scope="row">*온실 주</th>
			<td><input type="text" size=10 name="userName"></td> --%>
		</tr>
		<tr>
			<th scope="row">관리인 ID</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.employeeId}" style="width: 50%;" /></td> 
			<th scope="row">관리인</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.employeeName}" style="width: 50%;" /></td> 
			</tr>
		<tr>
			<th scope="row">*재배면적(평)</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.areaPyung}" style="width: 50%;" /></td> 
			<th scope="row">*재배면적(제곱미터)</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.areaMsquare}" style="width: 50%;" /></td>			
		</tr>
		<tr>
			<th scope="row">하우스 폭(m)</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.width}" style="width: 50%;" /></td>
			<th scope="row">하우스 길이(m)</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.length}" style="width: 50%;" /></td>
		</tr>
		<tr>
			<th scope="row">온실 측고 (m)</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.heightMin}" style="width: 50%;" /></td>
			<th scope="row">온실 동고 (m)</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.heightMax}" style="width: 50%;" /></td>
		</tr>
		<tr>
			<th scope="row">온실 방향</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.direction}" style="width: 50%;" /></td>
			<th scope="row">비닐/유리 온실</th>			
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.materialType}" style="width: 50%;" /></td>
			<!-- 
			<td><select name="materialType">
					<option value="1">비닐</option>
					<option value="2">유리</option>
			</select></td> -->
		</tr>
		<tr>
			<th scope="row">*연동/단동</th>			
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.ifConnected}" style="width: 50%;" /></td>
			<!-- 
			<td><select name="ifConnected">
					<option value="Y">연동</option>
					<option value="N">단동</option>
			</select></td> -->
			<th scope="row">*연동/단동 개수</th>			
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.connectedNum}" style="width: 50%;" /></td>
		</tr>
		<tr>
			<th scope="row">구역 개수</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.sectionNum}" style="width: 50%;" /></td>
			<th scope="row">양액/토경재배</th>			
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.cultivationType}" style="width: 50%;" /></td>
			<!-- 
			<td><select name="cultivationType">
					<option value="1">양액재배</option>
					<option value="2">토경재배</option>
			</select></td> -->
		</tr>
		
		<!-- <tr>
			<th scope="row">제어기 정보</th>
			<td><select>
					<option>없음 / 회사이름</option>
			</select></td>
			<th scope="row">제어기 기종</th>
			<td><input type="text" size=10></td>
		</tr> -->
		
		<tr>
			<th scope="row">우편번호</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.farmZipcode}" style="width: 50%;" /></td>
			<th scope="row">농장 건립일</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.buildDate}" style="width: 50%;" /></td>
		</tr>
		<tr>
			<th scope="row">주소</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.farmAddr}" style="width: 50%;" /></td>
		</tr>
	</table>

	<table>
		<tr>
			<center>
				<button type="submit">확인</button>
				<button type="send">취소</button>
			</center>
		</tr>
	</table>

</form>
<!--  본문 끝 -->

