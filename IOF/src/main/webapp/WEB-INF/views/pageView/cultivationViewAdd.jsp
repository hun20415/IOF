<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/greenhouseAdd.css" rel="stylesheet" type="text/css">
<!--                                                                                                    -->
<!--                                File Name   : cultivationViewAdd.jsp                                   -->
<!--                                Description : cultivationAdd 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.13                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<!-- 본문 시작 -->
<center>
	<h1>재배 정보 신규 입력</h1>
</center>
<table class="type02">
	<tr>
		<th scope="row">*온실 ID</th>
		<td><select name="">
				<option>0005</option>
				</td>
		<th scope="row">*구역 ID</th>
		<td><select name="">
				<option>전체/1/2...</option>
				</td>
	</tr>
	<tr>
		<th scope="row">온실명</th>
		<td><input type="text" size=10 name="farmid">우듬지2</td>
		<th scope="row">온실주명</th>
		<td><input type="text" size=10 name="ownner">한태군</td>
	</tr>
	<tr>
		<th scope="row">*재배품종 ID</th>
		<td><input type="text" size=10 name="croptypeid">
		<button type="submit">검색</button>
		</td>
		
	</tr>
	<tr>
		<th scope="row">정식일</th>
		<td><input type="date" id="calendar" name=""></td>
		<th scope="row">수확 종료일</th>
		<td><input type="date" id="calendar" name=""></td>
	</tr>
	<tr>
		<th scope="row">실제 출하일</th>
		<td><input type="date" id="calendar" name=""></td>
		<th scope="row">예상 출하일</th>
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


