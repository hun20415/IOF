<!--                                                                                                    -->
<!--                                File Name   : farmInfoViewList.jsp                                   -->
<!--                                Description : farmInfoViewList 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.20(홍수영)                                          -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<link href="css/" rel="stylesheet" type="text/css">
<script src="../js/newWindow.js" type="text/javascript" , charset="utf-8"></script>


<!-- 본문 시작 -->
<h1 style="position: absolute; top: 70px; left: 800px;">온실 정보 관리</h1>


<c:if test="${!empty listFarmInfo}">
	<table class="type10">
		<p>
			<!-- 검색 시작 -->
		<form name="selectForm">

			<select name="ownerId">
				<c:forEach items="${ownerList}" var="owner">
					<option value="${owner.userId}">${owner.userName}</option>
				</c:forEach>
			</select> <input type="submit" value="검색" onclick="farmInfoList">

		</form>
		<!-- 검색 끝 -->

		<a href="javascript:FarmInfoAddPop()"> 
		<input type="button" class="button" value="신규" style="position: relative; left: 830px;" /></a>
		<!-- <button onclick="window.location.href='/farmInfoAdd'" >신규</button> -->
		</p>
		<thead style="background: #d2f4ec;">
			<tr>
				<th width="55px">온실ID</th>
				<th width="60px">온실명</th>
				<th width="60px">온실주</th>
				<th width="60px">관리자</th>
				<th width="65px">비닐/유리</th>
				<th width="55px">연동(Y)</th>
				<th width="60px">건물수</th>
				<th width="60px">구역수</th>
				<th width="60px">양액/토경</th>
				<th width="200px">농장주소</th>
				<th width="90px">건립일</th>
				<th width="40px">조회</th>
				<th width="40px">수정</th>
				<th width="50px">Delete</th>
			</tr>
		</thead>

		<!-- 리스트 객체를 받아서 출력(for문으로 출력) c:forEach 이러한 문법은 JSTL 문ㅂ-->
		<tbody>
			<c:forEach items="${listFarmInfo}" var="farmInfo">
				<tr>
					<td>${farmInfo.farmId}</td>
					<td>${farmInfo.farmName}</td>
					<td>${farmInfo.ownerName}</td>
					<%-- farmInfo.ownerId}</td> --%>
					<td>${farmInfo.employeeName}</td>
					<!-- farmInfo.employeeId}</td> -->
					<td>${farmInfo.convertMaterialType}</td>
					<td>${farmInfo.convertIfConnected}</td>
					<td>${farmInfo.connectedNum}</td>
					<td>${farmInfo.sectionNum}</td>
					<td>${farmInfo.convertCultivationType}</td>
					<td>${farmInfo.farmAddr}</td>
					<td>${farmInfo.buildDate}</td>

					<td>
						<form name="farmInfoInfoForm">
							<input type="hidden" name="farmId" value="${farmInfo.farmId}">
							<input type="button" value="조회"
								onclick="javascript:farmInfoInfoPop(this.form);">
						</form>
					</td>
					<td>
						<form name="farmInfoModifyForm">

							
							<input type="hidden" name="farmId" value="${farmInfo.farmId}">
							<input type="hidden" name="m_owner" value="${farmInfo.owner}">
							<input type="hidden" name="m_employee"
								value="${farmInfo.employee}"> <input type="submit"
								value="수정" onclick="javascript:farmInfoModifyPop(this.form);">
						</form>
						
						
					</td>
					<td>
						<button
							onclick="window.location.href='/farmInfoRemove/${farmInfo.farmId}'">Delete</button>
					</td>
					<!--</form> -->
				</tr>
			</c:forEach>
			<!--   <td><button onclick="window.location.href='/farmInfoAdd'" >add</a></td> -->

		</tbody>
	</table>
</c:if>
