<!--                                                                                             -->
<!--                                File Name   : farmInfoViewModify.jsp                   -->
<!--                                Description : farmInfoViewModify 수정                                     -->
<!--                                Update      : 2015.05.20(옥정윤)                                      -->
<!--                                ETC         :                                                       -->

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/farmEquipList.css" rel="stylesheet" type="text/css">

<!-- 본문 시작 -->
<h1 style="position: absolute; top: 70px; left: 546px;">장비 정보 수정</h1>
<br><br><br>
온실정보
<table class="type02" style="width: 650px; ">
	<tr>
		<th scope="row" style="width: 80px; ">온실 명</th>
		 
		<td>${farmInfo.farmName}</td>		
		<th scope="row" style="width: 107px; ">구역 ID</th>
		<td>${farmSectionId}</td>
		
	</tr>
	
</table>
<br>
장비정보
<!-- <form id="farmEquipListModifyForm" action="farmEquipListModify" method="post" onsubmit="return check()"> -->
<form method="post" onsubmit="return check()">
<table class="type02" style="width: 546px; ">
	<tr>
		<th scope="row">No  </th>
		<th scope="row">장비타입  </th>
		<th scope="row">회사명 </th>
		<th scope="row">모델명</th>
		<th scope="row">S/W version </th>
		<th scope="row">설명</th>
	</tr>
	<tr>
	
		<th scope="row" >
		<input type="text" name="eqId" readonly="readonly" value="${farmEquipList.eqId}" style="width: 50px">
		</th>
		<th scope="row" >
			<select name="m_eqTypeId" style="width: 120px"  >
					<c:forEach items="${listFarmEquipType}" var="farmEquipType">
						<%-- <c:out value="asdfasdf~~~~~~~~~~~~~~ ${farmEquipList.farmEquipTypeName}"/>   <!--  eqTypeName}"/> --> --%>
						
						  <option value="${farmEquipType.eqTypeId}" 
						${eqTypeId == farmEquipType.eqTypeId ? 'selected' : ''}>${farmEquipType.eqTypeName}</option> 
						
						
						<%-- <c:if test='${farmEquipType.eqTypeId == eqTypeId}'>
							<option value="${farmEquipType.eqTypeId}" selected>${farmEquipType.eqTypeId}</option>
						</c:if>
						<option value="${farmEquipType.eqTypeId}">${farmEquipType.eqTypeName}</option> --%>
					</c:forEach>
			</select>
		</th>
		<th scope="row" >
		<input type="text" name="eqCompany" value="${farmEquipList.eqCompany}" style="width: 80px">
		</th>
		<th scope="row">
		<input type="text" name="eqModel" value="${farmEquipList.eqModel}" style="width: 80px">
		</th>
		<th scope="row">
		<input type="text" name="eqSwVersion" value="${farmEquipList.eqSwVersion}" style="width: 80px">
		</th>
		<th scope="row">
		<input type="text" name="eqDiscription" value="${farmEquipList.eqDiscription}" style="width: 100px">
		</th>
	
	</tr>

</table>

	<tr>
		<center>
			<input type="submit" value="확인">
			<button onclick="window.close()">취소</button>
		</center>
	</tr>
</form>
<!--  본문 끝 -->


