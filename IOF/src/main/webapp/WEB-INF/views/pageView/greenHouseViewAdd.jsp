<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/greenhouseAdd.css" rel="stylesheet" type="text/css">

<!-- 본문 시작 -->
<center><h1>온실 정보 신규 입력</h1></center>
<table class="type02">
	<tr>
		<th scope="row">온실 ID</th>
		<td><input type="text" size=10 name="farmid"></td>
		<th scope="row">온실 주</th>
		<td><input type="text" size=10 name=""></td>
	</tr>
	<tr>
		<th scope="row">온실명</th>
		<td><input type="text" size=10 name="farmname"></td>
		<th scope="row">관리자</th>
		<td><input type="text" size=10 name=""></td>
	</tr>
	<tr>
		<th scope="row">재배면적(평)</th>
		<td><input type="text" size=10 name="area_pyung"></td>
		<th scope="row">재배면적(제곱미터)</th>
		<td><input type="text" size=10 name="area_msquare"></td>
	</tr>
	<tr>
		<th scope="row">하우스 폭(m)</th>
		<td><input type="text" size=10 name="width"></td>
		<th scope="row">하우스 길이(m)</th>
		<td><input type="text" size=10 name="length"></td>
	</tr>
	<tr>
		<th scope="row">온실 측고 (m)</th>
		<td><input type="text" size=10 name="heigthmin"></td>
		<th scope="row">온실 동고 (m)</th>
		<td><input type="text" size=10 name="heightmax"></td>
	</tr>
	<tr>
		<th scope="row">온실 방향</th>
		<td><input type="text" size=10 name="direction"></td>
		<th scope="row">비닐/유리 온실</th>
		<td><select name="materialtype">
				<option>유리</option>
				<option>비닐</option></td>
	</tr>
	<tr>
		<th scope="row">연동/단동</th>
		<td><select>
				<option>test</option></td>
		<th scope="row">연동/단동 개수</th>
		<td><select name="connected_num">
				<option>3</option></td>
	</tr>
	<tr>
		<th scope="row">구역 개수</th>
		<td><select name=sectionnum>
				<option>1</option>
				<option>2</option>
				<option>3</option></td>
		<th scope="row">양액/토경재배</th>
		<td><select name="cultibationtype">
				<option>양액</option>
				<option>토경</option></td>
	</tr>
	<tr>
		<th scope="row">제어기 정보</th>
		<td><select>
				<option>없음 / 회사이름</option></td>
		<th scope="row">제어기 기종</th>
		<td><input type="text" size=10></td>
	</tr>
	<tr>
		<th scope="row">우편번호</th>
		<td><input type="text" size=8 name="farmzipcode">
			<button type="send">검색</button></td>
		<th scope="row">농장 건립일</th>
		<td><input type="date" id="calendar" name="builddate"></td>
	</tr>
	<tr>
		<th scope="row">주소</th>
		<td><input type="text" size=10 name="farm_addr"></td>
	</tr>
</table>

<tr>
	<center>
		<button type="submit">확인</button>
		<button type="send">취소</button>
</tr>
</center>

<!--  본문 끝 -->


