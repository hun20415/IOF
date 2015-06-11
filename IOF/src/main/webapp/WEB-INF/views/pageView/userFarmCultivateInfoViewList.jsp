<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="../css/" rel="stylesheet" type="text/css">
<script src="../js/newWindow.js" type="text/javascript"
	, charset="utf-8"></script>
<!--                                                                                                    -->
<!--                                File Name   : userFarmCultivateInfoList.jsp                                   -->
<!--                                Description : userList 페이지   새창으로 출력                                                                                              -->
<!--                                Update      : 2015.06.03                                           -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->

<!-- 본문 시작 -->
<link href="css/farmInfo.css" rel="stylesheet" type="text/css">

<!-- 본문 시작 -->
<center>
	<h1>재배 정보 조회</h1>
</center>


<table class="type02">
	<tr>
		<th scope="row">*온실 ID</th>
		<td>001</td>

		<th scope="row">*구역 ID</th>
		<td>1</td>

	</tr>
	<tr>
		<th scope="row">*온실명</th>
		<td>딸기네</td>

		<th scope="row">온실주 명</th>
		<td>홍수영</td>
	</tr>
	<tr>
		<th scope="row">*재배품종 ID</th>
		<td>딸기</td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<th scope="row">*정식일</th>
		<td>2015.02.01</td>
		<th scope="row">수확종료일</th>
		<td></td>
	</tr>
	<tr>
		<th scope="row">실제 출하일</th>
		<td></td>
		<th scope="row">예상 출하일</th>
		<td>2015.06.30</td>
	</tr>

</table>

 <input type="button" class="button" value="확인 " style="position: relative; left: 450px;" />
	 <input type="button" class="button" value="취소" style="position: relative; left: 450px;" />
</a>