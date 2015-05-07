<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/greenhouseInfo.css" rel="stylesheet" type="text/css">

<!-- 본문 시작 -->
<center><h1>온실 상세 정보</h1></center>

<left><h2># 온실정보</h2></left>
<table class="type02">
	<tr>
		<th scope="row">온실 ID  </th>
		<td></td>
		<th scope="row">온실주 ID</th>
		<td></td>
	</tr>
	<tr>
		<th scope="row">온실명</th>
		<td></td>
		<th scope="row">관리자ID</th>
		<td></td>
	</tr>
	<tr>
		<th scope="row">재배면적(평)</th>
		<td></td>
		<th scope="row">재배면적(제곱미터)</th>
		<td></td>
	</tr>
	<tr>
		<th scope="row">하우스 폭(m)</th>
		<td></td>
		<th scope="row">하우스 길이(m)</th>
		<td></td>
	</tr>
	<tr>
		<th scope="row">온실 측고 (m)</th>
		<td></td>
		<th scope="row">온실 동고 (m)</th>
		<td></td>
	</tr>
	<tr>
		<th scope="row">온실 방향</th>
		<td></td>
		<th scope="row">비닐/유리 온실</th>
		<td></td>
	</tr>
	<tr>
		<th scope="row">연동/단동</th>
		<td></td>
		<th scope="row">연동/단동 개수</th>
		<td></td>
	</tr>
	<tr>
		<th scope="row">구역 개수</th>
		<td></td>
		<th scope="row">양액/토경재배</th>
		<td></td>
	</tr>
	<tr>
		<th scope="row">우편번호</th>
		<td></td>
		<th scope="row">온실건립일</th>
		<td></td>
	</tr>	
	<tr>
		<th scope="row">주소</th>
		<td></td>
	</tr>	
</table>


<left><h2># 재배정보</h2></left>
<table class="type02">
	<tr>
		<th scope="row">재배현황 기록 ID</th>
		<td></td>
		<th scope="row">온실주</th>
		<td></td>
	</tr>
	<tr>
		<th scope="row">온실명</th>
		<td></td>
		<th scope="row">온실ID</th>
		<td></td>
	</tr>
	<tr>
		<th scope="row">구역ID</th>
		<td></td>
		<th scope="row">재배품종</th>
		<td></td>
	</tr>
	<tr>
		<th scope="row">정식일</th>
		<td></td>
		<th scope="row">재배상태</th>
		<td></td>
	</tr>
	<tr>
		<th scope="row">실제 출하일</th>
		<td></td>
		<th scope="row">예상 출하일</th>
		<td></td>
	</tr>
</table>

<left><h2># 장비정보</h2></left>
<table class="type02" style="width: 546px; ">
	<tr>
		<th scope="row">No  </th>
		<th scope="row">센서  </th>
		<th scope="row">개수  </th>
		<th scope="row">  </th>
		<th scope="row">No  </th>
		<th scope="row">컨트롤러  </th>
		<th scope="row">개수  </th> 
	</tr>
	<tr> 
		<td scope="row">1  </td>
		<td scope="row">외부 온도 센서</td>
		<td scope="row">1</td>
		<td scope="row">  </td>
		<td scope="row">1</td>
		<td scope="row">복합제어기</td>
		<td scope="row">1</td>
	</tr>
	<tr>
		<td scope="row">2  </td>
		<td scope="row" style="width: 117px; ">외부 습도 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">2</td>
		<td scope="row" style="width: 137px; ">단일 천창</td>
		<td scope="row" style="width: 73px; ">0</td>
	</tr>
	<tr>
		<td scope="row">3  </td>
		<td scope="row" style="width: 117px; ">외부 풍향 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">3</td>
		<td scope="row" style="width: 137px; ">이중 천창</td>
		<td scope="row" style="width: 73px; ">4</td>
	</tr>
	<tr>
		<td scope="row">4  </td>
		<td scope="row" style="width: 117px; ">외부 풍속 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">4</td>
		<td scope="row" style="width: 137px; ">단일 측창</td>
		<td scope="row" style="width: 73px; ">0</td>
	</tr>
	<tr>
		<td scope="row">5  </td>
		<td scope="row" style="width: 117px; ">외부 강우 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">5</td>
		<td scope="row" style="width: 137px; ">이중 측창</td>
		<td scope="row" style="width: 73px; ">4</td>
	</tr>
	<tr>
		<td scope="row">6  </td>
		<td scope="row" style="width: 117px; ">내부 온도 센서</td>
		<td scope="row" style="width: 35px; ">2</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">6</td>
		<td scope="row" style="width: 137px; ">차광막</td>
		<td scope="row" style="width: 73px; ">1</td>
	</tr>
	<tr>
		<td scope="row">7  </td>
		<td scope="row" style="width: 117px; ">내부 습도 센서</td>
		<td scope="row" style="width: 35px; ">2</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">7</td>
		<td scope="row" style="width: 137px; ">보온막</td>
		<td scope="row" style="width: 73px; ">1</td>
	</tr>
	<tr>
		<td scope="row">8  </td>
		<td scope="row" style="width: 117px; ">광 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">8</td>
		<td scope="row" style="width: 137px; ">양액기</td>
		<td scope="row" style="width: 73px; ">1</td>
	</tr>
	<tr>
		<td scope="row">9  </td>
		<td scope="row" style="width: 117px; ">급액 량 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">9</td>
		<td scope="row" style="width: 137px; ">난방기</td>
		<td scope="row" style="width: 73px; ">1</td>
	</tr>
	<tr>
		<td scope="row">10  </td>
		<td scope="row" style="width: 117px; ">급액 EC 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">10</td>
		<td scope="row" style="width: 137px; ">유동팬</td>
		<td scope="row" style="width: 73px; ">10</td>
	</tr>
	<tr>
		<td scope="row">11  </td>
		<td scope="row" style="width: 117px; ">급액 pH 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">11</td>
		<td scope="row" style="width: 137px; ">배기팬</td>
		<td scope="row" style="width: 73px; ">4</td>
	</tr>
	<tr>
		<td scope="row">12  </td>
		<td scope="row" style="width: 117px; ">배지 수분 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">12</td>
		<td scope="row" style="width: 137px; ">환풍기</td>
		<td scope="row" style="width: 73px; ">4</td>
	</tr>
	<tr>
		<td scope="row">13  </td>
		<td scope="row" style="width: 117px; ">배지 무게 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">13</td>
		<td scope="row" style="width: 137px; ">훈증기</td>
		<td scope="row" style="width: 73px; ">1</td>
	</tr>
	<tr>
		<td scope="row">14  </td>
		<td scope="row" style="width: 117px; ">배지 EC 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">14</td>
		<td scope="row" style="width: 137px; ">분무기</td>
		<td scope="row" style="width: 73px; ">1</td>
	</tr>
	<tr>
		<td scope="row">15  </td>
		<td scope="row" style="width: 117px; ">배지 pH 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">15</td>
		<td scope="row" style="width: 137px; ">스프링쿨러</td>
		<td scope="row" style="width: 73px; ">12</td>
	</tr>
	<tr>
		<td scope="row">16  </td>
		<td scope="row" style="width: 117px; ">폐액 량 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">16</td>
		<td scope="row" style="width: 137px; ">2 Way 밸브</td>
		<td scope="row" style="width: 73px; ">0</td>
	</tr>
	<tr>
		<td scope="row">17  </td>
		<td scope="row" style="width: 117px; ">폐액 EC 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">17</td>
		<td scope="row" style="width: 137px; ">3 Way 밸브</td>
		<td scope="row" style="width: 73px; ">1</td>
	</tr>
	<tr>
		<td scope="row">  18</td>
		<td scope="row" style="width: 117px;">폐액 pH 센서</td>
		<td scope="row" style="width: 35px;">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">18</td>
		<td scope="row" style="width: 137px; ">보광등</td>
		<td scope="row" style="width: 73px; ">10</td>
	</tr>
	<tr>
		<td scope="row">  19</td>
		<td scope="row" style="width: 117px; ">CO2 센서</td>
		<td scope="row" style="width: 35px; ">1</td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">19</td>
		<td scope="row" style="width: 137px; ">차광커튼</td>
		<td scope="row" style="width: 73px; ">  1</td>
	</tr>
	<tr>
		<td scope="row">  </td>
		<td scope="row" style="width: 117px; "></td>
		<td scope="row" style="width: 35px; "></td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">20</td>
		<td scope="row" style="width: 137px; ">보온커튼</td>
		<td scope="row" style="width: 73px; ">  1</td>
	</tr>
	<tr>
		<td scope="row">  </td>
		<td scope="row" style="width: 117px; "></td>
		<td scope="row" style="width: 35px; "></td>
		<td scope="row" style="width: 1px; ">  </td>
		<td scope="row" style="width: 2px; ">21</td>
		<td scope="row" style="width: 137px; ">냉방기</td>
		<td scope="row" style="width: 73px; ">0</td>
	</tr>
	
</table>

<!--  본문 끝 -->


