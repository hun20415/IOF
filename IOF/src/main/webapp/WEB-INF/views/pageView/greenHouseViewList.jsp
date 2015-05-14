<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="css/greenHouseList.css" rel="stylesheet" type="text/css">
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
	<tbody>
		<tr>

			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>조회/수정</td>

		</tr>

	</tbody>
</table>
