<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/farmInfoAdd.css" rel="stylesheet" type="text/css">

<!-- 본문 시작 -->
<center>
	<h1>온실 정보 신규 입력</h1>
</center>
<form id="farmInfoAddForm" action="farmInfoAdd" method="post"
	onsubmit="return check()">
	<table class="type02">
		<tr>
			<th scope="row">* 온실 ID</th>
			<td><input type="text" size=10 name="farmId"></td>
			<th scope="row">* 온실명</th>
			<td><input type="text" size=10 name="farmName"></td>
		</tr>
		<tr>
		<th scope="row">* 온실 주 ID</th>
			<td style="width: 390px"> 
			<select name=ownerId> 
				   <c:forEach items="${farmAllId}" var="farmInfo"> 			        
						 <option value= ${farmInfo.ownerId}"></option>	 				    
				   </c:forEach> 
			 </select>
			
			<%-- <select name="farmId" value="${farmInfo.owner}" style="width: 50%;">
				<c:forEach items="${farmAllId}" var="owner">
					<option value="${farmInfo.owner}"></option>
				</c:forEach>
			</select> by oak--%>
			</td> 
			<th scope="row">* 온실 주</th>
			<td><input type="text" size=10 name="userName"></td>
		
		<!-- 
			<th scope="row">*온실 주 ID</th>
			<td><input type="text" size=10 name="ownerId"></td>
			<th scope="row">*온실 주</th>
			<td><input type="text" size=10 name="userName"></td> 
		-->
		
		</tr>
		<tr>
			<th scope="row">관리인 ID</th>
			<!-- <td><input type="text" size=10 name="employeeId"></td> -->
			
			<td style="width: 390px">
			<select name="farmId" value="${farmInfo.owner}" style="width: 50%;">
				<c:forEach items="${farmAllId}" var="owner">
					<option value="${farmInfo.owner}"></option>
				</c:forEach>
			</select>
			</td> 
			
			<th scope="row">관리인</th>
			<td><input type="text" size=10 name=""></td>
		</tr>
		<tr>
			<th scope="row">* 재배면적(평)</th>
			<td><input type="text" size=10 name="areaPyung"></td>
			<th scope="row">* 재배면적(제곱미터)</th>
			<td><input type="text" size=10 name="areaMsquare"></td>
		</tr>
		<tr>
			<th scope="row">하우스 폭(m)</th>
			<td><input type="text" size=10 name="width"></td>
			<th scope="row">하우스 길이(m)</th>
			<td><input type="text" size=10 name="length"></td>
		</tr>
		<tr>
			<th scope="row">온실 측고 (m)</th>
			<td><input type="text" size=10 name="heightMin"></td>
			<th scope="row">온실 동고 (m)</th>
			<td><input type="text" size=10 name="heightMax"></td>
		</tr>
		<tr>
			<th scope="row">온실 방향</th>
			<td><input type="text" size=10 name="direction"></td>
			<th scope="row">* 비닐/유리 온실</th>
			<td><select name="materialType">
					<option value="1">비닐</option>
					<option value="2">유리</option>
			</select></td>
		</tr>
		<tr>
			<th scope="row">* 연동/단동</th>
			<td><select name="ifConnected">
					<option value="Y">연동</option>
					<option value="N">단동</option>
			</select></td>
			<th scope="row">* 연동/단동 개수</th>
			<td><input type="text" size=10 name="connectedNum"></td>
		</tr>
		<tr>
			<th scope="row">구역 개수</th>
			<td><input type="text" size=10 name="sectionNum"></td>
			<th scope="row">양액/토경재배</th>
			<td><select name="cultivationType">
					<option value="1">양액재배</option>
					<option value="2">토경재배</option>
			</select></td>
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
			<td><input type="text" size=10 name="farmZipcode"></td>
			<th scope="row">농장 건립일</th>
			<td><input type="date" id="calendar" name="buildDate"></td>
		</tr>
		<tr>
			<th scope="row">주소</th>
			<td><input type="text" size=10 name="farmAddr"></td>
		</tr>
	</table>

	<table>
		<tr>
			<center>
				<button type="submit">확인</button>
				<button type="send">취소</button>
			</center>
		</tr>
	</table>

</form>
<!--  본문 끝 -->


