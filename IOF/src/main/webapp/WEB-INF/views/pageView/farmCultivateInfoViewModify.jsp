﻿<!--                                                                                                    -->

<!--                                File Name   : farmCultivateInfoViewModify.jsp                                   -->
<!--                                Description : farmCultivateInfoViewModify 수정페이지                                                                                                        -->
<!--                                Update      : 2015.05.18(옥정윤)                                      -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="css/farmCultivateInfoModify.css" rel="stylesheet" type="text/css">

<!-- 본문 시작 -->
<center>
	<h1>재배 정보 수정</h1>
</center>

<form id="farmCultivateInfoModifyForm" action="farmCultivateInfoModify"><!-- onsubmit="return check()"> -->
	<table class="type02 ">
		<tr>
			<th scope="row">*온실 ID</th>
			<td style="width: 390px">${farmCultivateInfo.farmId}</td>
			<th scope="row">온실명</th>
			<td style="width: 390px">${farmCultivateInfo.farmName}</td>
			
			<!-- <td><select name="">
					<option>전체/1/2...</option></td> -->
		</tr>
		<tr>
			<th scope="row">*구역 ID</th>
			<td style="width: 390px">${farmCultivateInfo.farmSectionId}</td>	
			<th scope="row">온실주명</th>
			<td style="width: 390px">${farmCultivateInfo.userName}</td>		
			
		</tr>
		<tr>
			<th scope="row">*재배작물</th>
			<td style="width: 390px"><input type="hidden" name="m_cropId" value = "${farmCultivateInfo.cropId}"/><input type="text" name="tno" value="${farmCultivateInfo.cropName}" style="width: 50%;" />
				<button type="submit">검색</button></td>
			<th scope="row">*재배품종</th>
			<td style="width: 390px"><input type="hidden" name="m_cropSpeciesId" value = "${farmCultivateInfo.cropSpeciesId}"/><input type="text" name="tno" value="${farmCultivateInfo.cropSpeciesName}" style="width: 50%;" />
				<button type="submit">검색</button></td>

		</tr>
		<tr>
			<th scope="row">정식일</th>
			<td style="width: 390px"><input type="text" name="plantTime" value="${farmCultivateInfo.plantTime}" style="width: 50%;" /></td>
			<!-- <td><input type="date" id="calendar" name=""></td> -->
			<th scope="row">수확 종료일</th>
			<td style="width: 390px"><input type="text" name="endTime" value="${farmCultivateInfo.endTime}" style="width: 50%;" /></td>
			<!-- <td><input type="date" id="calendar" name=""></td> -->
		</tr>
		<tr>
			<th scope="row">실제 수확 시작일</th>
			<td style="width: 390px"><input type="text" name="productTimeReal" value="${farmCultivateInfo.productTimeReal}" style="width: 50%;" /></td>
			<!-- <td><input type="date" id="calendar" name=""></td> -->
			<th scope="row">예상 수확 시작일</th>
			<td style="width: 390px"><input type="text" name="productTimePlan" value="${farmCultivateInfo.productTimePlan}" style="width: 50%;" /></td>
			<!-- <td><input type="date" id="calendar" name=""></td> -->
		</tr>

	</table>

	<tr>
		<center>
			<input type="submit" value="확인">			
			<button type="send">취소</button>
			</center>
	</tr>
	
</form>
	<!--  본문 끝 -->
