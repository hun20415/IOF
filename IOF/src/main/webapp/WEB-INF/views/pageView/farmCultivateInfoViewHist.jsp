<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="css/" rel="stylesheet" type="text/css">
<!--                                                                                                    -->
<!--                                File Name   : cultivationViewHist.jsp                                   -->
<!--                                Description : cultivationHist 과거재배정보                                                                                                        -->
<!--                                Update      : 2015.05.18 (옥정윤)                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->

<!-- 본문 시작 -->
<h1 style="position: absolute; top: 70px; left: 650px;">과거 재배 정보 List</h1>

<p></p>

<table class="type10">
	<!-- <p align="right">
		<button type="submit">신규</button>
		<button onclick="window.location.href='/farmCultivateInfoAdd'" >신규</button>
		<button onclick="window.location.href='/farmCultivateInfoHist'" >과거재배정보</button>
	</p> -->
	<thead style="background: #d2f4ec;">
		<tr>
			<th width="50px">온실ID</th>
			<th width="60px">온실이름</th>
			<th width="50px">온실주</th>
			<th width="50px">구역 ID</th>
			<th width="60px">재배품종</th>
			<th width="130px">정식일</th>			
			<th width="130px">실제 수확 시작일</th>
			<th width="130px">수확 종료일</th>
			<th width="45px">편집</th>
			<th width="50px">Delete</th>
			<!-- <th width="60">Delete</th> -->
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listFarmCultivateInfo}" var="farmCultivateInfo">
			<c:if test="${farmCultivateInfo.activeYn == 'N'}">
				<tr>


					<td>${farmCultivateInfo.farmId}</td>
					<td>${farmCultivateInfo.farmName}</td>
					<td>${farmCultivateInfo.userName}</td>
					<td>${farmCultivateInfo.farmSectionId}</td>
					<td>${farmCultivateInfo.cropSpeciesName}</td>
					<td>${farmCultivateInfo.plantTime}</td>
					<td>${farmCultivateInfo.productTimeReal}</td>
					<td>${farmCultivateInfo.endTime}</td>
					
					
					<td><form action="farmCultivateInfoModify">
							<input type="hidden" name="id" value="${farmCultivateInfo.tno}"> 
							<input type="submit" value="Edit">
						</form></td>
					<td><button onclick="window.location.href='/farmCultivateInfoRemove/${farmCultivateInfo.tno}'"> <%-- farmId}'"> --%> 
						Delete</a></td>

				</tr>
			</c:if>
		</c:forEach>
	</tbody>
</table>
