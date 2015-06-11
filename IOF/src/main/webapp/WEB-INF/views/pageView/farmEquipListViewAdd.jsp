<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/farmEquipListAdd.css" rel="stylesheet" type="text/css">
<script src="../js/newWindow.js" type="text/javascript" charset="utf-8"></script>
<!-- 본문 시작 -->
<h1 style="position: absolute; top: 70px; left: 300px;">장비 신규 정보</h1>
<br>
<br>
<br>
<form name="farmNameAndSectionId">
<table class="type02" style="width: 720px;">
	<tr>
		<th scope="row" style="width: 80px;">온실 명</th>		
		<td>
			<select name="m_farmId" onchange="this.form.submit()">
				<option value=""></option>
				<c:forEach items="${farmInfoList}" var="farmInfo">
					<option value="${farmInfo.farmId}"${m_farmId == farmInfo.farmId ? 'selected' :''}>${farmInfo.farmName}</option>
				</c:forEach>
			</select>
		</td>
		<%-- <c:forEach items="${listUser}" var="user"> --%>
		<th scope="row" style="width: 107px;">구역</th>
		
		<td><select name="farmSectionId" onchange="this.form.submit()">
				
				<option value=""></option>
				<c:forEach items="${farmSectionList}" var="farmSection">					
					<c:if test='${m_farmId == farmSection.farmId}'>								
				       <option value="${farmSection.farmSectionId}" 
						${farmSectionId == farmSection.farmSectionId ? 'selected' : ''}>${farmSection.farmSectionId}</option> 
					</c:if>
				</c:forEach>
		</select>
		
		</td>
	</tr>
</table>
</form>
<form method="post">
	<table class="type02" style="width: 700px;">
		<tr>
			<!--  <th scope="row">No</th> songlock-->
			<th scope="row">장비</th>
			<th scope="row">회사명</th>
			<th scope="row">모델명</th>
			<th scope="row">S/Wversion</th>
			<th scope="row">설명</th>
			<th scope="row">장비추가</th>
		</tr>
		<tr>
			<!--  <td><input type="text" name="eqId" style="width: 100%;" /></td> songlock-->
			<td><select name="m_eqTypeId">
					<c:forEach items="${listFarmEquipType}" var="farmEquipType">
						<option value="${farmEquipType.eqTypeId}">${farmEquipType.eqTypeName}</option>
					</c:forEach>
			</select></td>

			<td><input type="text" name="eqCompany" style="width: 100%;" /></td>
			<td><input type="text" name="eqModel" style="width: 100%;" /></td>
			<td><input type="text" name="eqSwVersion" style="width: 100%;" /></td>
			<td><input type="text" name="eqDiscription" style="width: 100%;" /></td>
			
						
			
			
			<td>
			<input type="hidden" name="farmSectionId" value="${farmSectionId}"/>
			<input type="submit" value="추가" />
			</td>
		</tr>



	</table>
</form>
	
	<table class="type02" style="width: 700px; ">
	<tr>		
		<!-- <th scope="row">센서/컨트롤러  </th> -->
		<th scope="row">No</th>
			<th scope="row">장비</th>
			<th scope="row">회사명</th>
			<th scope="row">모델명</th>
			<th scope="row">S/Wversion</th>
			<th scope="row">설명</th> 
	</tr>
	<!-- songlock 2015-06-03 -->
	<c:forEach items="${listFarmEquipListInfo}" var="farmEquipListInfo" >
		<tr> 
			<!-- songlock 2015-06-03 -->
			<td scope="row">${farmEquipListInfo.eqId}</td>
			<td scope="row">${farmEquipListInfo.eqTypeName}</td>
			<td scope="row">${farmEquipListInfo.eqCompany}</td>
			<td scope="row">${farmEquipListInfo.eqModel}</td>		
			<td scope="row">${farmEquipListInfo.eqSwVersion}</td>
			<td scope="row">${farmEquipListInfo.eqDiscription}</td>
		</tr>
	</c:forEach>
	</table>
	
	
	<!-- by oak 
<button type="submit" style="position: relative; left: 320px;">확인</button>
<button type="send" style="position: relative; left: 320px;">취소</button>
 -->
 <form> 
	<div style="text-align: center; padding-bottom: 15px;">
		<button onclick="window.close()">확인</button>
		
		<!-- <input type="send" value="취소" /> -->
	</div>
</form>
 