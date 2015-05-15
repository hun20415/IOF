<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="css/farmInfoList.css" rel="stylesheet" type="text/css">
<!--                                                                                                    -->
<!--                                File Name   : greenHouseViewList.jsp                                   -->
<!--                                Description : greenHouseList 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.14                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->

<!-- 본문 시작 -->
<center>
	<h1>전체 온실 List</h1>
</center>


<c:if test="${!empty listFarmInfo}">
    <table class="type10">
		<p>
			검색 <select name=sectionnum>
				<option>홍수영</option>
			</select>
			<button type="button">검색</button>

			<button type="submit">신규</button>
		</p>
	<thead>
		<tr>
			<th scope="cols">온실ID</th>
			<th scope="cols">온실명</th>
			<th scope="cols">온실주</th>
			<th scope="cols">관리자</th>
			<th scope="cols">비닐/유리</th>
			<th scope="cols">연동(Y)</th>
			<th scope="cols">건물수</th>
			<th scope="cols">구역수</th>
			<th scope="cols">양액/토경</th>
			<th scope="cols">농장주소</th>
			<th scope="cols">건립일</th>
			<th scope="cols">편집</th>
		</tr>
	</thead> 
    
     <!-- 리스트 객체를 받아서 출력(for문으로 출력) c:forEach 이러한 문법은 JSTL 문ㅂ-->
	<tbody>
    <c:forEach items="${listFarmInfo}" var="farmInfo">
        <tr>
            <td>${farmInfo.farmId}</td>
            <td>${farmInfo.farmName}</td>
            <td>${farmInfo.ownerId}</td>
            <td>${farmInfo.employeeId}</td>
            <td>${farmInfo.materialType}</td>
            <td>${farmInfo.ifConnected}</td>
            <td>${farmInfo.connectedNum}</td>
            <td>${farmInfo.sectionNum}</td>
            <td>${farmInfo.cultivationType}</td>
            <td>${farmInfo.farmAddr}</td>
            <td>${farmInfo.buildDate}</td>
            
            <td><form action="farmInfoModify">
            <input type="hidden" name="id" value="${farmInfo.farmId}">
            <input type="submit" value="Edit">
            </form></td>
            
            <td><button onclick="window.location.href='/farmInfoRemove/${farmInfo.farmId}'" >Delete</a></td>
        </tr>
    </c:forEach>
    <td><button onclick="window.location.href='/farmInfoAdd'" >add</a></td>
    
	</tbody>
    </table>
</c:if>