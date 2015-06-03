<!--                                                                                                    -->
<!--                                File Name   : farmEquipListViewList.jsp                                   -->
<!--                                Description : farmEquipList                                                                                                         -->
<!--                                Update      : 2015.05.20 (홍수영) /06. 01(옥정윤)
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="../js/newWindow.js" type="text/javascript" charset="utf-8"></script>



<!-- 본문 시작 -->
<h1 style="position: absolute; top: 70px; left: 550px;">온실 구역별 장비
	List</h1>

<table>
	<p>
		<!--버튼위치지정 -->
		<!-- <button onclick="window.location.href='/farmEquipListAdd'"
			style="position: relative; left: 520px;">신규</button> -->

		<a href="javascript:farmEquipListAddPop()"> <input type="button"
			class="button" value="신규" style="position: relative; left: 520px;" />
		</a>
	</p>
	<thead style="background: #d2f4ec;">
		<tr>
			<th width="50px">번호</th>
			<th width="50px">온실</th>
			<th width="60px">온실ID</th>
			<th width="60px">구역ID</th>
			<th width="70px">센서 종류</th>
			<th width="100px">컨트롤러 종류</th>
			<th width="40px">조회</th>
			<th width="40px">수정</th>
			<th width="50px">Delete</th>
		</tr>
	</thead>
	<tbody>
		<!-- 		<tr>
			<td>1</td>
			<td>딸기네</td>
			<td>0001</td>
			<td>1</td>
			<td>15</td>
			<td>21</td> -->			

		<c:forEach items="${listFarmEquipList}" var="farmEquipList" >		
			<tr>
				<td> 1 </td>
				<td>${farmEquipList.farmName}</td>
				<td>${farmEquipList.farmId}</td>
				<td>${farmEquipList.farmSectionId}</td>
				
				<td>센서 수 계산</td>
				<td>컨트롤러 수 계산</td>
				<td>
					<form name="farmEquipListInfoForm">
						<input type="hidden" name="farmId"
							value="${farmEquipList.farmId}"> <input type="hidden"
							name="farmSectionId" value="${farmEquipList.farmSectionId}">

						<input type="submit" value="조회"
							onclick="javascript:farmEquipListInfoPop(this.form)">
					</form>
				<td>
					<form action="farmEquipListModifyForm">
						<input type="hidden" name="farmId" value="${farmEquipList.farmId}">
						<input type="hidden" name="farmSectionId"
							value="${farmEquipList.farmSectionId}"> <input
							type="submit" value="수정"
							onclick="farmEquipListModifyPop(this.form)">
					</form>
				</td>
				<td>
					<button
						onclick="window.location.href='/farmEquipListRemove/${farmEquipList.farmId}'">Delete</button>
				</td>
			</tr>
			
		</c:forEach>
	</tbody>
</table>


<!--  본문 끝 -->


