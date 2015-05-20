<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="css/" rel="stylesheet" type="text/css">
<!--                                                                                                    -->
<!--                                File Name   : cultivationViewList.jsp                                   -->
<!--                                Description : cultivationList 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.20 (홍수영)                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->

<!-- 본문 시작 -->

<h1 style="position: absolute; top: 70px; left: 750px;">현재 재배 정보
	List</h1>


<table class="type10">
	<p >
		<!-- <button type="submit">신규</button> -->
		<button onclick="window.location.href='/farmCultivateInfoAdd'">신규</button>
		<button onclick="window.location.href='/farmCultivateInfoHist'">과거재배정보</button>
	</p>
	<thead style="background: #d2f4ec;">
		<tr>
			<th width="55px">온실ID</th>
			<th width="60px">온실이름</th>
			<th width="55px">온실주</th>
			<th width="55px">구역 ID</th>
			<th width="70px">재배품종</th>
			<th width="140px">정식일</th>
			<th width="130px">예상출하일</th>
			<th width="130px">실제출하일</th>
			<th width="40px">편집</th>
			<th width="50px">종료</th>
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


					<td><form action="farmCultivateInfoModify">
							<input type="hidden" name="id"
								value="${farmCultivateInfo.farmId}"> <input
								type="submit" value="Edit">
						</form></td>
					<td input type="checkbox"></td>
					<!-- 종료???? -->

					<td><button
							onclick="window.location.href='/farmCultivateInfoRemove/${farmCultivateInfo.farmId}'">
							Delete</a></td>

				</tr>
			</c:if>
		</c:forEach>
	</tbody>
</table>
