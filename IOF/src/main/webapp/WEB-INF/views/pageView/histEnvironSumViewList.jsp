<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="css/greenHouseEnviInfo.css" rel="stylesheet" type="text/css">
<!--                                                                                                    -->
<!--                                File Name   : histEnvironSumViewList.jsp                                   -->
<!--                                Description : histEnvironSumViewList 전체 정보페이지                                                   -->
<!--                                Update      : 2015.05.13                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->

<!-- 본문 시작 -->
<center>
	<h1>온실 환경 정보</h1>
</center>

<p>
	온실별 조회
	<td><select name=>
			<option>딸기네</option>  <!-- 온실 이름으로 리스트 보여주기 -->
	</select> <br>측정 시간: 2015년 xx월 xx일 xx시 xx분</br></td>
</p>

<table class="type10">
    <p align="right">
		<button type="submit">신규</button>
		<button type="submit">과거재배정보</button>
	</p> 
	<thead>
		<tr>
			<th scope="cols">온실ID</th>
			<th scope="cols">온실명</th>
			<th scope="cols">외부온도</th>
			<th scope="cols">외부습도</th>
			<th scope="cols">풍향</th>
			<th scope="cols">풍속</th>
			<th scope="cols">강우</th>
			<th scope="cols">내부온도</th>
			<th scope="cols">내부습도</th>
			<th scope="cols">배지온도</th>
			<th scope="cols">배지수분</th>
			<th scope="cols">급액량</th>
			<th scope="cols">급액EC</th>
			<th scope="cols">급액pH</th>
			<th scope="cols">배지배액량</th>
			<th scope="cols">배지배액EC</th>
			<th scope="cols">배지배액pH</th>
			<th scope="cols">CO2농도</th>
			<th scope="cols">순간광량</th>
			<th scope="cols">누적광량</th>
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
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>
			<td>내용</td>


		</tr>

	</tbody>
</table>
