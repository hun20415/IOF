<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="css/cultivationList.css" rel="stylesheet" type="text/css">
<!--                                                                                                    -->
<!--                                File Name   : cultivationViewHist.jsp                                   -->
<!--                                Description : cultivationHist 과거재배정보                                                                                                        -->
<!--                                Update      : 2015.05.18 (옥정윤)                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->

<!-- 본문 시작 -->
<center>
	<h1>과거 재배 정보 List</h1> <!-- ACTIVE_YN = N  있을 경우  -->
</center>



<table class="type10">
	<!-- <p align="right">
		<button type="submit">신규</button>
		<button onclick="window.location.href='/farmCultivateInfoAdd'" >신규</button>
		<button onclick="window.location.href='/farmCultivateInfoHist'" >과거재배정보</button>
	</p> -->
	<thead>
		<tr>
			<th scope="cols">온실ID</th>
			<th scope="cols">온실이름</th>
			<th scope="cols">온실주</th>
			<th scope="cols">구역 ID</th>
			<th scope="cols">재배품종</th>
			<th scope="cols">정식일</th>
			<th scope="cols">실제출하일</th>
			<th scope="cols">편집</th>	
	 		<th scope="cols">Delete</th>	 	
        <!-- <th width="60">Delete</th> -->
		</tr>
	</thead>
	<tbody>
	 <c:forEach items="${listFarmCultivateInfo}" var="farmCultivateInfo">
	  <c:if test = "${farmCultivateInfo.activeYn == 'N'}">
        <tr>
       
        
	        <td>${farmCultivateInfo.farmId}</td>
            <td>온실이름</td>
            <td>온실주</td>
            <td>${farmCultivateInfo.farmSectionId}</td>
            <td>${farmCultivateInfo.cropSpeciesId}</td> 
            <td>${farmCultivateInfo.plantTime}</td>
            <td>${farmCultivateInfo.productTimeReal}</td>            
            
            <td><form action="farmCultivateInfoModify">
            <input type="hidden" name="id" value="${farmCultivateInfo.farmId}">
            <input type="submit" value="Edit">
            </form></td>
            
            <td><button onclick="window.location.href='/farmCultivateInfoRemove/${farmCultivateInfo.farmId}'" >Delete</a></td>
        
		</tr>
		 </c:if>
</c:forEach>
	</tbody>
</table>
