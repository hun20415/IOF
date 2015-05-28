
<!--                                                                                                    -->
<!--                                File Name   : cultivationViewList.jsp                                   -->
<!--                                Description : cultivationList 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.20 (홍수영)                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- <link href="css/" rel="stylesheet" type="text/css"> -->

<script src="../js/newWindow.js" type="text/javascript" charset="utf-8"></script>

<!-- 본문 시작 -->

<h1 style="position: absolute; top: 70px; left: 750px;">현재 재배 정보 List</h1>


<table class="type10">
<p>	

		
	<a href="javascript:farmCultivateInfoAddPop()"><input type="button" class="button" value="신규" /></a>
	<a href="javascript:farmCultivateInfoHistPop()"><input type="button" class="button" value="과거재배정보" /></a>
		<!-- <button type="submit">신규</button> -->
		<!-- <button onclick="window.location.href='/farmCultivateInfoAdd'">신규</button>  //farmCultivateInfoAdd
		<button onclick="window.location.href='/farmCultivateInfoHist'">과거재배정보</button> -->
	</p>
	<thead style="background: #d2f4ec;">
		<tr>
			<th width="55px">온실ID</th>
			<th width="60px">온실이름</th>
			<th width="55px">온실주</th>
			<th width="55px">구역 ID</th>
			<th width="70px">재배품종</th>
			<th width="140px">정식일</th>
			<th width="130px">예상 수확 시작일</th>
			<th width="130px">실제 수확 시작일</th>
			<th width="90px">편집</th>
			<th width="10px">종료</th>
			<th width="50px">Delete</th>

		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listFarmCultivateInfo}" var="farmCultivateInfo">
			<c:if test="${farmCultivateInfo.activeYn == 'Y'}">
				<tr>
					<td>${farmCultivateInfo.farmId}</td>
					<td>${farmCultivateInfo.farmName}</td>
					<td>${farmCultivateInfo.userName}</td>
					<td>${farmCultivateInfo.farmSectionId}</td>
					<td>${farmCultivateInfo.cropSpeciesName}</td>
					<td>${farmCultivateInfo.plantTime}</td>
					<td>${farmCultivateInfo.productTimePlan}</td>
					<td>${farmCultivateInfo.productTimeReal}</td>
					
					<th>	
					<form name="farmCultivateInfoInfoForm"> <!-- action="farmCultivateInfoInfo"> -->
					<input type="hidden" name="tno" value="${farmCultivateInfo.tno}">
					<input type="button" value="조회" onclick="javascript:farmCultivateInfoInfoPop(this.form);">
					</form>
					 </th>
					 <th>
					<form name="farmCultivateInfoModifyForm"> <!-- action="farmCultivateInfoModify"> -->
					<input type="hidden" name="tno" value="${farmCultivateInfo.tno}">
					<input type="submit" value="수정" onclick="javascript:farmCultivateInfoModifyPop(this.form);">
					</form>
					</th>
          
           		<td><input type="checkbox"></td>
				<td><button onclick="window.location.href='/farmCultivateInfoRemove/${farmCultivateInfo.tno}'">
							Delete</a></td>

				</tr>
			</c:if>
		</c:forEach>
	</tbody>
</table>
