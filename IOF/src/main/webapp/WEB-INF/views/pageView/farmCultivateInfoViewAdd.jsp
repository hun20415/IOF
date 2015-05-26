<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/farmCultivateInfoAdd.css" rel="stylesheet" type="text/css">
<!--                                                                                             -->
<!--                                File Name   : farmCultivateInfoViewAdd.jsp                   -->
<!--                                Description : farmCultivateInfoViewAdd 입력페이지                                     -->
<!--                                Update      : 2015.05.20(홍수영)                                      -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<!-- 본문 시작 -->
<center>
	<h1>재배 정보 신규 입력</h1>
</center>

<table class="type02">
	<tr>
		<th scope="row">* 온실 ID</th>
		<td><select name="">
				<option> DB에서 온실전체 뽑아와야 함 </option>  <!-- DB에서 온실전체 뽑아와야 함 -->
				</td>
		<th scope="row">* 구역 ID</th>   <!-- DB에서 구역수 뽑아와야 함 -->
		<td><select name="">
				<option>DB에서 구역수 뽑아와야 함</option>
				</td>
	</tr>
	<tr>
		 <th scope="row">온실명</th>
		 <td scope="row">온실 ID에서 가져오기</td> <-- DB에서 이름 가져와야 함 -->
		
		<%-- <td><select name="farmName">
						 <c:forEach items="${farmNameList}" var="userGroupP">
						 <c:if test="${userGroupP.userGroup != 1}">
						<option value="${userGroupP.userGroup}">${userGroupP.userGroupName}
						</option>
						</c:if>
						</c:forEach>

				
				</select></td>
		 --%>
		
		
		<th scope="row">* 온실주명</th>
		<td scope="row">온실 ID에서 가져오기</td> <!-- DB에서 이름 가져와야 함 -->
	</tr>
	<tr>
		<th scope="row">* 재배품종 ID</th>
		<td><input type="text" size=10 name="croptypeid">
		<button type="submit">검색</button>
		</td>
		
	</tr>
	<tr>
		<th scope="row">* 정식일</th>
		<td><input type="date" id="calendar" name=""></td>
		<th scope="row">수확 종료일</th>
		<td><input type="date" id="calendar" name=""></td>
	</tr>
	<tr>
		<th scope="row">실제 수확 시작일</th>
		<td><input type="date" id="calendar" name=""></td>
		<th scope="row">예상 수확 시작일</th>
		<td><input type="date" id="calendar" name=""></td>
	</tr>
	
</table>

<tr>
	<center>
		<button type="submit">확인</button>
		<button type="send">취소</button>
</tr>
</center>

<!--  본문 끝 -->


