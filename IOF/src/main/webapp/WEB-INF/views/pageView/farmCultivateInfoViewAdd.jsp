<!--                                                                                             -->
<!--                                File Name   : farmCultivateInfoViewAdd.jsp                   -->
<!--                                Description : farmCultivateInfoViewAdd 입력페이지                                     -->
<!--                                Update      : 2015.05.20(홍수영)                                      -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/farmCultivateInfoAdd.css" rel="stylesheet" type="text/css">


<!-- 본문 시작 -->
<center>
	<h1>재배 정보 신규 입력</h1>
</center>
<form id="farmCultivateInfoAddForm" action="farmCultivateInfoAdd" method="post"	onsubmit="return check()">
<table class="type02">
	<tr>
		<th scope="row">* 온실 ID</th>
		<td>
		<select name="m_farmId">
						<c:forEach items="${farmInfoList}" var="farmInfo">
							<option value="${farmInfo.farmId}">${farmInfo.farmId}</option>							
						</c:forEach>
		</select>		
		<!-- <select name="farmCultivateInfo.farmId">
				<option> DB에서 온실전체 뽑아와야 함 </option>  DB에서 온실전체 뽑아와야 함 -->
		</td>
		
		<th scope="row">* 구역 ID</th>   <!-- DB에서 구역수 뽑아와야 함 -->
		<td>
		<select name="farmSectionId">
						<c:forEach items="${farmSectionIdList}" var="farmSectionIdP">
							<option value="${farmSectionIdP.farmSectionId}"> ${farmSectionIdP.farmSectionId} </option>							
						</c:forEach>
		</select>
		</td>
	</tr>
	<tr>
		 <th scope="row">온실명</th>
		 <td scope="row">${farmId.farmName}</td> 		
		
		<th scope="row">* 온실주명</th>
		<td scope="row">${farmId.userName}</td> <!-- DB에서 이름 가져와야 함 -->
	</tr>
	<tr>
		<th scope="row">* 재배품종 ID</th>
		<td>
		<!-- <input type="text" size=10 name="croptypeid"> -->
		
		<select name="m_cropSpeciesId">
						<c:forEach items="${cropSpeciesIdList}" var="cropSpeciesIdP">
							<option value="${cropSpeciesIdP.cropSpeciesId}"> ${cropSpeciesIdP.cropSpeciesName} </option>							
						</c:forEach>
		</select>
		
		<button type="submit">검색</button>
		</td>
		
	</tr>
	<tr>
		<th scope="row">* 정식일</th>
		<td><input type="date" id="calendar" name=""></td>
		<th scope="row">수확 종료일</th>
		<td><input type="date" id="calendar" name=""></td>
	</tr>
	<tr>
		<th scope="row">실제 수확 시작일</th>
		<td><input type="date" id="calendar" name=""></td>
		<th scope="row">예상 수확 시작일</th>
		<td><input type="date" id="calendar" name=""></td>
	</tr>
	
</table>

<tr>
	<center>
		<button type="submit">확인</button>
		<button type="send">취소</button>
</tr>
</center>
</form>

<!--  본문 끝 -->


