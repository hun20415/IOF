<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="css/" rel="stylesheet" type="text/css">
<!--                                                                                                    -->
<!--                                File Name   : farmInfoViewList.jsp                                   -->
<!--                                Description : farmInfoViewList 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.20(홍수영)                                          -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->

<!-- 본문 시작 -->
<h1 style="position:absolute; top:70px ; left:800px;" > 온실 정보 관리</h1>


<c:if test="${!empty listFarmInfo}">
    <table class="type10">
		<p>
			검색 <select name=sectionnum>
				<option>홍수영</option>
			</select>
			<button type="button">검색</button>

			<button onclick="window.location.href='/farmInfoAdd'" >신규</button>
		</p>
	<thead style=" background: #d2f4ec; ">
		<tr >
			<th width="55px">온실ID</th>
			<th width="60px">온실명</th>
			<th width="60px">온실주</th>
			<th width="60px">관리자</th>
			<th width="65px">비닐/유리</th>
			<th width="55px">연동(Y)</th>
			<th width="60px">건물수</th>
			<th width="60px">구역수</th>
			<th width="60px">양액/토경</th>
			<th width="200px">농장주소</th>
			<th width="90px">건립일</th>
			<th width="95px">편집</th>
		</tr>
	</thead> 
    
     <!-- 리스트 객체를 받아서 출력(for문으로 출력) c:forEach 이러한 문법은 JSTL 문ㅂ-->
	<tbody >
    <c:forEach items="${listFarmInfo}" var="farmInfo">
        <tr >
            <td>${farmInfo.farmId}</td>
            <td>${farmInfo.farmName}</td>
            <td>${farmInfo.ownerName}</td>      <%-- farmInfo.ownerId}</td> --%>
            <td>${farmInfo.employeeName}</td>   <!-- farmInfo.employeeId}</td> -->
            <td>${farmInfo.materialType}</td>
            <td>${farmInfo.ifConnected}</td>
            <td>${farmInfo.connectedNum}</td>
            <td>${farmInfo.sectionNum}</td>
            <td>${farmInfo.cultivationType}</td>
            <td>${farmInfo.farmAddr}</td>
            <td>${farmInfo.buildDate}</td>
            
            <td>
            <form action="farmInfoInfo">
            <input type="hidden" name="id" value="${farmInfo.farmId}">
            <input type="submit" value="조회">
            </form>  
            <form action="farmInfoModify">
            <input type="hidden" name="id" value="${farmInfo.farmId}">
            <input type="submit" value="수정">
            </form>  
            
            <%-- 
             <input type="hidden" name="id" value="${farmInfo.farmId}">
            <input type="submit" value="Edit">        
             --%> 
				   <%--  <form action="farmInfoInfo">
					<input type="hidden" name="id" value="${{farmInfo.farmId}"> 
					<input type="submit" value="조회">
					</form>
					<form action="farmInfoModify">
					<input type="hidden" name="id" value="${farmInfo.farmId}">  
					<input type="submit" value="수정">
					</form> --%>
           <button onclick="window.location.href='/farmInfoRemove/${farmInfo.farmId}'" >Delete</a></td> </form> 
        </tr>
    </c:forEach>
  <!--   <td><button onclick="window.location.href='/farmInfoAdd'" >add</a></td> -->
    
	</tbody>
    </table>
</c:if>