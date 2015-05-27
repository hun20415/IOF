<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!-- 본문 시작 -->
<h1 style="position: absolute; top: 70px; left: 550px;">온실 구역별 장비 	List</h1>

<table>
	<p>
		<!--버튼위치지정 -->
		<button onclick="window.location.href='/farmEquipListAdd'">신규</button>
	</p>
	<thead style="background: #d2f4ec;">
		<tr>
			<th width="50px">번호</th>
			<th width="50px">온실</th>
			<th width="60px">온실ID</th>
			<th width="60px">구역ID</th>
			<th width="70px">센서 종류</th>
			<th width="100px">컨트롤러 종류</th>
			<th width="90px">편집</th>
		</tr>
	</thead>
	<tbody>  
			<tr>
				<td>1</td>
				<td>딸기네</td>
				<td>0001</td>
				<td>1</td>
				<td>15</td>
				<td>21</td>
				<td>
				    <form action="farmEquipListInfo">
					<input type="hidden" name="id" value="${farmEquipList.farmId}"> <!-- & farmEquipList.farmSectionIdfid, eid  --> 
					<input type="submit" value="조회">
					</form>
					<form action="farmEquipListModify">
					<input type="hidden" name="id" value="${farmEquipList.farmId}"> <!--  & farmEquipList.farmSectionId}"> --> 
					<input type="submit" value="수정">
					</form>					
					<button onclick="window.location.href='/farmEquipListRemove/${farmEquipList.farmId}'" >Delete</a>
				</td>
						
				<!-- <button >조회</button> -->
				<!-- <button>수정</button> -->
				</td>



			</tr>
		 


	</tbody>
</table>


<!--  본문 끝 -->


