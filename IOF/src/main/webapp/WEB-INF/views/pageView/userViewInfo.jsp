<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/userInfoViewList.css" rel="stylesheet" type="text/css">

<!-- 본문 시작 -->
<center><h1>사용자 상세 정보</h1></center>
<left><h2># 개인정보</h2></left>
<table class="userInfo">
	<tr>
		<th scope="row">사용자 이름  </th>
		<td>${user.userName}</td>
		<th scope="row">사용자 ID</th>
		<td>${user.userId}</td>
	</tr>
	<tr><!-- 
		<th scope="row">비밀번호</th>
		<td></td> -->
		<th scope="row">그룹ID</th>
		<td>${user.userGroupName}</td>
	</tr>
	<tr>
		<th scope="row">이메일</th>	
		<td clospan="4">${user.email}</td>			
	</tr>
	<tr>
		<th scope="row">휴대폰</th>
		<td>${user.mobilePhone}</td>
		<th scope="row">연락처</th>
		<td>${user.phone}</td>
	</tr>
	<tr>
		<th scope="row">우편번호</th>
		<td>${user.homeZipcode}</td>
		<th scope="row">등록날짜</th>
		<td>${user.sysDataTime}</td>
	</tr>
	<tr>
		<th scope="row">집주소  </th>
		<td clospan="3">${user.homeAddr}</td>			
	</tr>
</table>

<left><h2># 온실정보</h2></left>
<table class="userInfo">
	<tr>
		<th scope="row">온실 ID  </th>
		<td>${farmInfo.farmId}</td>
		<th scope="row">온실주 ID</th>
		<td>${farmInfo.ownerId}</td>
	</tr>
	<tr>
		<th scope="row">온실명</th>
		<td>${farmInfo.farmName}</td>
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
		<td clospan="3"></td>	
	</tr>	
</table>


<left><h2># 재배정보</h2></left>
<table class="userInfo">
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

<!--  본문 끝 -->


