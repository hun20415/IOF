<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/farmEquipList.css" rel="stylesheet" type="text/css">

<!-- 본문 시작 -->
<h1 style="position: absolute; top: 70px; left: 230px;">장비 상세 정보</h1>
<br><br><br>
<table class="type02" style="width: 546px; ">
	<tr>
		<th scope="row" style="width: 80px; ">온실 명</th>
		<td style="width: 120px; ">${farmCultivateInfo.farmSectionId}</td>
		<th scope="row" style="width: 107px; ">구역 ID</th>
		<td style="width: 157px; ">${farmCultivateInfo.farmSectionId}</td>
	</tr>
</table>

<table class="type02" style="width: 546px; ">
	<tr>
		<th scope="row">No  </th>
		<th scope="row">센서/컨트롤러  </th>
		<th scope="row">장비  </th>
		<th scope="row">회사명</th>
		<th scope="row">모델명</th>
		<th scope="row">S/W version  </th>
		<th scope="row">설명</th> 
	</tr>
	<tr> 
		<td scope="row">1  </td>
		<td scope="row">외부 온도 센서</td>
		<td>${farmEquipList.farmId}</td>
		<td scope="row"></td>
		<td scope="row">1  </td>		
		<td scope="row">복합제어기</td>
		<td scope="row">1</td>
	</tr>
	
	
	
</table>


<button type="submit" style="position:relative;left:220px;">확인</button>
<button type="send" style="position:relative;left:220px;">취소</button>

<!--  본문 끝 -->


