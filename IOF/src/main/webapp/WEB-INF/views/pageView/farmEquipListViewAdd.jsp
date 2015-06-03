﻿<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/farmEquipListAdd.css" rel="stylesheet" type="text/css">

<!-- 본문 시작 -->
<h1 style="position: absolute; top: 70px; left: 300px;">장비 신규 정보</h1>
<br><br><br>
<table class="type02" style="width: 720px;">
	<tr>
		<th scope="row" style="width: 80px;">온실 명</th>
<!-- 		<td><select name="">
				<option>딸기세상</option>
		</select></td> -->
		<td>
	 	<select name="farmId">
						<c:forEach items="${farmInfoList}" var="farmInfo">
							<option value="${farmInfo.farmId}">${farmInfo.farmName}</option>							
						</c:forEach>
		</select> 
		</td>	
		<%-- <c:forEach items="${listUser}" var="user"> --%>
		<th scope="row" style="width: 107px;">구역</th>
		<td><select name="farmSectionId">
					<%-- <c:forEach items="${listFarmEquipList}" var="farmSectionId">
						<option value="${farmEquipList.farmSectionId}">${farmEquipList.farmSectionId}</option>							
					</c:forEach> --%>
					<c:forEach items="${farmInfoList}" var="farmSectionId">
						<option value="${farmInfo.farmSectionId}">${farmInfo.farmSectionId}</option>							
					</c:forEach> 
		</select></td>
	</tr>
</table>

<table class="type02" style="width: 700px;">
	<tr>
		<th scope="row">No</th>
		<th scope="row">장비</th>
		<th scope="row">회사명</th>
		<th scope="row">모델명</th>
		<th scope="row">S/Wversion</th>
		<th scope="row">설명</th>
		<th scope="row">장비추가</th>
	</tr>
	<tr>
		<td scope="row">1</td>
		<td><select name="">
				<option>내부 습도 센서</option>
		</select></td>
		<td><input type="text" name="eqCompany" style="width: 50%;" /></td>
		<td><input type="text" name="eqModel" style="width: 50%;" /></td>
		<td><input type="text" name="eqSwVersion" style="width: 50%;" /></td>
		<td><input type="text" name="eqDiscription" style="width: 50%;" /></td>
		<td><button >추가</button></td>
	</tr>



</table>

<!-- by oak 
<button type="submit" style="position: relative; left: 320px;">확인</button>
<button type="send" style="position: relative; left: 320px;">취소</button>
 -->
 		<div style="text-align: center; padding-bottom: 15px;">
			<input type="submit" value="확인" />
		</div>
