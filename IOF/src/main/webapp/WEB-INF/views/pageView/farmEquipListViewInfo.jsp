<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/farmEquipList.css" rel="stylesheet" type="text/css">

<!-- 본문 시작 -->
<h1 style="position: absolute; top: 70px; left: 230px;">장비 상세 정보</h1>
<br><br><br>
<table class="type02" style="width: 546px; ">
	<tr>
		<th scope="row" style="width: 80px; ">온실 명</th>
		<td style="width: 157px; ">${farmInfo.farmName}</td>
		<th scope="row" style="width: 107px; ">구역 ID</th>
		<td style="width: 157px; ">${farmSectionId}</td>
	</tr>
</table>

<table class="type02" style="width: 546px; ">
	<tr>
		<th scope="row">No  </th>
		<th scope="row">센서/컨트롤러  </th>
		<th scope="row">장비 타입 </th>
		<th scope="row">회사명</th>
		<th scope="row">모델명</th>
		<th scope="row">S/W version  </th>
		<th scope="row">설명</th> 
		<th scope="row">수정</th>
		<th scope="row">삭제</th>
	</tr>
	<!-- songlock 2015-06-03 -->
	<c:forEach items="${listFarmEquipListInfo}" var="farmEquipListInfo" >
		<tr> 
			<!-- songlock 2015-06-03 -->
			<td scope="row">${farmEquipListInfo.eqId}</td>
			<td scope="row">${farmEquipListInfo.controlSensor}</td>
			<td scope="row">${farmEquipListInfo.farmEquipTypeName}</td>
			<td scope="row">${farmEquipListInfo.eqCompany}</td>
			<td scope="row">${farmEquipListInfo.eqModel}</td>		
			<td scope="row">${farmEquipListInfo.eqSwVersion}</td>
			<td scope="row">${farmEquipListInfo.eqDiscription}</td>
			<td>
				<form action="farmEquipListModify">
					<input type="hidden" name="m_farmId" value="${farmInfo.farmId}">
					<input type="hidden" name="farmSectionId" value="${farmSectionId}">
					<input type="hidden" name="eqId" value="${farmEquipListInfo.eqId}">
					<input type="hidden" name="eqTypeId" value="${farmEquipListInfo.eqTypeId}"> <%-- oak --%>
					
					<input type="submit" value="수정" onclick="farmEquipListModify(this.form)">
				</form>
			</td>
			<td>
				<%-- <button onclick="window.location.href='/farmEquipListRemove/${farmEquipList.farmId}'">Delete</button>oak , ${farmEquipListInfo.eqId}'">Delete</button> --%>
				<button onclick="window.location.href='/farmEquipListRemove/${farmEquipListInfo.eqId}'">Delete</button>
				
			</td>
		</tr>
	</c:forEach>
	
	
</table>


<button type="submit" style="position:relative;left:220px;">확인</button>
<button type="send" style="position:relative;left:220px;">취소</button>

<!--  본문 끝 -->


