<!--                                                                                           -->
<!--                                File Name   : farmInfoViewModify.jsp                       -->
<!--                                Description : farmInfoViewModify 수정페이지                                              -->
<!--                                Update      : 2015.05.20 (옥정윤)                            -->
<!--                                ETC         :                                              -->
<!--                                                                                           -->

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="jquery-1.9.1.js"></script>
<link href="css/farmInfoModify.css" rel="stylesheet" type="text/css">

<!-- 본문 시작 -->
<center>
	<h1>온실 정보 수정</h1>
</center>

<form id="farmInfoModifyForm" action="farmInfoModify" method="post" onsubmit="return check()">
	<table class="type02">
		<tr>
			<th scope="row">*온실 ID</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.farmId}" style="width: 50%;" /></td> 
			<th scope="row">온실명</th>
			<td style="width: 390px"><input type="text" name="farmName" value="${farmInfo.farmName}" style="width: 50%;" /></td>			
		</tr>
		<tr>
		<%-- 
			<th scope="row">*온실주 ID</th>
			<td style="width: 390px"><input type="text" name="farmId" value="${farmInfo.ownerId}" style="width: 50%;" /></td> 
			<th scope="row">온실주</th>
			<td style="width: 390px"><input type="text" name="farmName" value="${farmInfo.ownerName}" style="width: 50%;" /></td>			
		 --%>
		<th scope="row">*온실 주 ID</th>
			<td style="width: 390px">
			<select name="ownerId" value="${farmInfo.ownerId}" style="width: 50%;" onchange="ownerName(this.form)">
			<!-- 기본값으로 farmInfo.ownerId 가 들어가는지 확인해 보아야 한다 -->
			<c:forEach items="${userAll}" var="user"><!-- controller에 있는 #A의 farmInfoAll과 이름이 매칭되어야 한다. -->
			     <option value="${user.userId}, ${user.userName}">${user.userId}</option>			     
			</c:forEach>
			
			</select>
			</td> 
			<th scope="row">*온실 주</th>
			<td><input type="text" size=10 readonly="readonly" value="${user.userName}" /></td>
		</tr>
		<tr>
			<th scope="row">관리인 ID</th>
			<td style="width: 390px"><input type="text" name="employeeId" value="${farmInfo.employeeId}" style="width: 50%;" /></td> 
			<th scope="row">관리인</th>
			<td style="width: 390px"><input type="text" name="employeeName" value="${farmInfo.employeeName}" style="width: 50%;" /></td> 
			</tr>
		<tr>
			<th scope="row">*재배면적(평)</th>
			<td style="width: 390px"><input type="text" name="areaPyung" value="${farmInfo.areaPyung}" style="width: 50%;" /></td> 
			<th scope="row">*재배면적(제곱미터)</th>
			<td style="width: 390px"><input type="text" name="areaMsquare" value="${farmInfo.areaMsquare}" style="width: 50%;" /></td>			
		</tr>
		<tr>
			<th scope="row">하우스 폭(m)</th>
			<td style="width: 390px"><input type="text" name="width" value="${farmInfo.width}" style="width: 50%;" /></td>
			<th scope="row">하우스 길이(m)</th>
			<td style="width: 390px"><input type="text" name="length" value="${farmInfo.length}" style="width: 50%;" /></td>
		</tr>
		<tr>
			<th scope="row">온실 측고 (m)</th>
			<td style="width: 390px"><input type="text" name="heightMin" value="${farmInfo.heightMin}" style="width: 50%;" /></td>
			<th scope="row">온실 동고 (m)</th>
			<td style="width: 390px"><input type="text" name="heightMax" value="${farmInfo.heightMax}" style="width: 50%;" /></td>
		</tr>
		<tr>
			<th scope="row">온실 방향</th>
			<td style="width: 390px"><input type="text" name="direction" value="${farmInfo.direction}" style="width: 50%;" /></td>
			<th scope="row">비닐/유리 온실</th>			
			<td style="width: 390px"><input type="text" name="convertMaterialType" value="${farmInfo.convertMaterialType}" style="width: 50%;" /></td>
			<!-- 
			<td><select name="materialType">
					<option value="1">비닐</option>
					<option value="2">유리</option>
			</select></td> -->
		</tr>
		<tr> 
			<th scope="row">*연동/단동</th>			
			<td style="width: 390px"><input type="text" name="convertIfConnected" value="${farmInfo.convertIfConnected}" style="width: 50%;" /></td>
			<!-- 
			<td><select name="ifConnected">
					<option value="Y">연동</option>
					<option value="N">단동</option>
			</select></td> -->
			<th scope="row">*연동/단동 개수</th>			
			<td style="width: 390px"><input type="text" name="connectedNum" value="${farmInfo.connectedNum}" style="width: 50%;" /></td>
		</tr>
		<tr>
			<th scope="row">구역 개수</th>
			<td style="width: 390px"><input type="text" name="sectionNum" value="${farmInfo.sectionNum}" style="width: 50%;" /></td>
			<th scope="row">양액/토경재배</th>			
			<td style="width: 390px"><input type="text" name="convertCultivationType" value="${farmInfo.convertCultivationType}" style="width: 50%;" /></td>
			<!-- 
			<td><select name="cultivationType">
					<option value="1">양액재배</option>
					<option value="2">토경재배</option>
			</select></td> -->
		</tr>
		
		<!-- <tr>
			<th scope="row">제어기 정보</th>
			<td><select>
					<option>없음 / 회사이름</option>
			</select></td>
			<th scope="row">제어기 기종</th>
			<td><input type="text" size=10></td>
		</tr> -->
		
		<tr>
			<th scope="row">우편번호</th>
			<td style="width: 390px"><input type="text" name="farmZipcode" value="${farmInfo.farmZipcode}" style="width: 50%;" /></td>
			<th scope="row">농장 건립일</th>
			<td style="width: 390px"><input type="text" name="buildDate" value="${farmInfo.buildDate}" style="width: 50%;" /></td>
		</tr>
		<tr>
			<th scope="row">주소</th>
			<td style="width: 390px"><input type="text" name="farmAddr" value="${farmInfo.farmAddr}" style="width: 50%;" /></td>
		</tr>
	</table>

	<table>
		<tr>
			<center>
		<%-- 	 <c:if test="${!empty farmInfo.farmId}">
                <input type="submit" value="<spring:message text="확인"/>" />
            </c:if>
            <c:if test="${empty farmInfo.farmId}">
                <input type="submit" value="<spring:message text="Add"/>" />
            </c:if>
       --%>
			
			    <button type="submit">확인</button> 
				<button type="send">취소</button>
			</center>
		</tr>
	</table>

</form>
<!--  본문 끝 -->


