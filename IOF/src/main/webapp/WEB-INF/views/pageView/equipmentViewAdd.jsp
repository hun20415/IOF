<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/equipmentAdd.css" rel="stylesheet" type="text/css">
<!--                                                                                                    -->
<!--                                File Name   : equipmentViewAdd.jsp                                   -->
<!--                                Description : equipementAdd 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.14                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<!-- 본문 시작 -->
<center>
	<h1>장비 정보 신규입력</h1>
</center>
<table class="type10">
	<thead>
		<tr>
			<th scope="row">*온실명</th>
			<td><select name="">
					<option>딸기세상</option></td>
			<th scope="row">*구역</th>
			<td><select name="">
					<option>2</option></td>
		</tr>
	</thead>



</table>
<table class="type10">
	<thead>
		<tr>
			<th scope="row">No</th>
			<th scope="row">센서</th>
			<th scope="row">개수</th>
			<th scope="row">No</th>
			<th scope="row">컨트롤러</th>
			<th scope="row">개수</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th scope="row">1</th>
			<th scope="row">내부 습도 센서</th>
			<th><select name="">
					<option>0</option></th>
			<th scope="row">1</th>
			<th scope="row">복합 제어기</th>
			<th><select name="">
					<option>0</option></th>
		</tr>
		<tr>
			<th scope="row">2</th>
			<th scope="row"></th>
			<th><select name="">
					<option>0</option></th>
			<th scope="row">2</th>
			<th scope="row"></th>
			<th><select name="">
					<option>0</option></th>
		</tr>
		<tr>
			<th scope="row">3</th>
			<th scope="row"></th>
			<th><select name="">
					<option>0</option></th>
			<th scope="row">3</th>
			<th scope="row"></th>
			<th><select name="">
					<option>0</option></th>
		</tr>
 
	</tbody>
</table>
<tr>
	<center>
		<button type="submit">
			확인
			</button>
			<button type="send">취소</button>
</tr>
</center>

<!--  본문 끝 -->


