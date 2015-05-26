<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/.css" rel="stylesheet" type="text/css">
<!--                                                                                                    -->

<!--                                File Name   : farmCultivateInfoViewModify.jsp                                   -->
<!--                                Description : farmCultivateInfoViewModify 수정페이지                                                                                                        -->
<!--                                Update      : 2015.05.18(옥정윤)                                      -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<!-- 본문 시작 -->
<center>
	<h1>재배 정보 수정</h1>
</center>
<form id="signUpForm" action="farmCultivateModify" method="post" 
	onsubmit="return check()">
	<table class="type02 ">
	            
	
		<tr>
			<th scope="row">*온실 ID</th>
			<td style="width: 390px"><input type="text" name="tno" value="${farmCultivateInfo.farmId}" style="width: 50%;" /></td>
			<th scope="row">*구역 ID</th>
			<td style="width: 390px"><input type="text" name="tno" value="${farmCultivateInfo.farmSectionId}" style="width: 50%;" /></td>
			<!-- <td><select name="">
					<option>전체/1/2...</option></td> -->
		</tr>
		<tr>
			<th scope="row">온실명</th>
			<td style="width: 390px"><input type="text" name="tno" value="${farmCultivateInfo.farmName}" style="width: 50%;" /></td>	
			
			<th scope="row">온실주명</th>
			<td style="width: 390px"><input type="text" name="tno" value="${farmCultivateInfo.userName}" style="width: 50%;" /></td>		
			
		</tr>
		<tr>
			<th scope="row">*재배품종 ID</th>
			<td style="width: 390px"><input type="text" name="tno" value="${farmCultivateInfo.cropSpeciesName}" style="width: 50%;" />
				<button type="submit">검색</button></td>

		</tr>
		<tr>
			<th scope="row">정식일</th>
			<td style="width: 390px"><input type="text" name="tno"
				value="${farmCultivateInfo.plantTime}" style="width: 50%;" /></td>
			<!-- <td><input type="date" id="calendar" name=""></td> -->
			<th scope="row">수확 종료일</th>
			<td style="width: 390px"><input type="text" name="tno"
				value="${farmCultivateInfo.endTime}" style="width: 50%;" /></td>
			<!-- <td><input type="date" id="calendar" name=""></td> -->
		</tr>
		<tr>
			<th scope="row">실제 수확 시작일</th>
			<td style="width: 390px"><input type="text" name="tno"
				value="${farmCultivateInfo.productTimeReal}" style="width: 50%;" /></td>
			<!-- <td><input type="date" id="calendar" name=""></td> -->
			<th scope="row">예상 수확 시작일</th>
			<td style="width: 390px"><input type="text" name="tno"
				value="${farmCultivateInfo.productTimePlan}" style="width: 50%;" /></td>
			<!-- <td><input type="date" id="calendar" name=""></td> -->
		</tr>

	</table>

	<tr>
		<center>
			<button type="submit">확인</button> <!-- 확인 단추 누르면 디비 수정되야 함  -->			
			<button type="send">취소</button>
	</tr>
	</center>

	<!--  본문 끝 -->