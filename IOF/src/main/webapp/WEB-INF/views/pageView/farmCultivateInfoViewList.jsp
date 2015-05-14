<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="css/cultivationList.css" rel="stylesheet" type="text/css">
<!--                                                                                                    -->
<!--                                File Name   : cultivationViewList.jsp                                   -->
<!--                                Description : cultivationList 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.13                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->

<!-- 본문 시작 -->
<center>
	<h1>현재 재배 정보 List</h1>
</center>



<table class="type10">
	<p align="right">
		<button type="submit">신규</button>
		<button type="submit">과거재배정보</button>
	</p>
	<thead>
		<tr>
			<th scope="cols">온실ID</th>
			<th scope="cols">온실이름</th>
			<th scope="cols">온실주</th>
			<th scope="cols">구역 ID</th>
			<th scope="cols">재배품종</th>
			<th scope="cols">정식일</th>
			<th scope="cols">예상종료일</th>
			<th scope="cols">상세종료일</th>
			<th scope="cols">편집</th>
			<th scope="cols">종료</th>
		</tr>
	</thead>
	<tbody>
		<tr>

	        <td>${farmCultivateInfo.farmId}</td>
            <td>온실이름</td> <!--  <td>${farmCultivateInfo.}</td>  // 온실이름-->
            <td>온실주</td> <!-- <td>${farmCultivateInfo.userId}</td> //온실주-->
            <td>${farmCultivateInfo.farmSectionId}</td>
            <td>${farmCultivateInfo.cropSpeciesId}</td>
            <td>${farmCultivateInfo.plantTime}</td>
            <td>${farmCultivateInfo.productTimePlan}</td>
            <td>${farmCultivateInfo.productTimeReal}</td>
            
            
            <td><form action="cultivationModify">
            <input type="hidden" name="id" value="${farmCultivateInfo.farmId}">
            <input type="submit" value="Edit">
            </form></td>
            <td> check box </td>
            
		</tr>

	</tbody>
</table>
