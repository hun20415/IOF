<!--                                File Name   : farmCultivateInfoViewInfo.jsp                                   -->
<!--                                Description : farmCultivateInfoViewInfo 상세정보페이지                                                                                                        -->
<!--                                Update      : 2015.05.27(옥정윤)                                      -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<!-- 본문 시작 -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="css/farmCultivationInfoInfo.css" rel="stylesheet" type="text/css">

<center>
	<h1>재배 상세 정보</h1>
</center>

	<table class="type02 ">            
	
		<tr>
			<th scope="row">*온실 ID</th> 
			<td>${farmCultivateInfo.farmId}</td> 
			
			 <th scope="row">*구역 ID</th>
			 <td>${farmCultivateInfo.farmSectionId}</td>
		</tr> 
		<tr>
			<th scope="row">온실명</th>
			<td>${farmCultivateInfo.farmName}</td> 
			
			<th scope="row">온실주명 </th>
			<td>${farmCultivateInfo.farmName}</td> 			
		</tr>
		<tr>
			<th scope="row">*재배품종 ID</th>
			<td>${farmCultivateInfo.farmName}</td>	
			
			<td></td>
			<td></td>			
		</tr>
		<tr>
			<th scope="row">정식일</th>
			<td>${farmCultivateInfo.plantTime}</td> 
			
			<th scope="row">수확 종료일</th>
			<td> ${farmCultivateInfo.endTime}</td>			
		</tr>
		<tr>
			<th scope="row">실제 수확 시작일</th>
			<td> ${farmCultivateInfo.productTimeReal}</td>
			<th scope="row">예상 수확 시작일</th>
			<td> ${farmCultivateInfo.productTimePlan}</td>
		</tr>

	</table>
<%-- 
	<tr>
		<center>
			<button type="submit">확인</button>
			<button type="send">취소</button>
		</center>
	</tr> --%>

	
	<!--  본문 끝 -->
