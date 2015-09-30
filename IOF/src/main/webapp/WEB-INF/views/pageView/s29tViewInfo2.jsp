<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/farmEquipList.css" rel="stylesheet" type="text/css">
<div id=testT>
<!-- 본문 시작 -->

	<p align = "center">
		온도 기준표 설정<br>
	</p>
	<form id="cropForm" action="cropCateAdd" method="post"
        onsubmit="return check()">
	
	<p align = "center">
	<input type = radio name = "group1" value = "cherry tomato">방울토마토
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type = radio name = "group1" value = "tomato">일반토마토
	</p>
	<p align = "center">
	<button type="set1" style="width:210px;height:30px;">상한값 기준표 온도 설정</button><br><br>
	<button type="set2" style="width:210px;height:30px;">하한값 기준표 온도 설정</button><br><br>
	<button type="set3" style="width:210px;height:30px;">영양생장 기준표 온도 설정</button><br><br>
	<button type="set4" style="width:210px;height:30px;">생식생장 기준표 온도 설정</button><br><br>
	<button type="set5" style="width:210px;height:30px;">사용자 정의 기준표 온도 설정1</button><br><br>
	<button type="set6" style="width:210px;height:30px;">사용자 정의 기준표 온도 설정2</button><br><br>
	<button type="set7" style="width:210px;height:30px;">사용자 정의 기준표 온도 설정3</button><br><br>
	<button type="set8" style="width:210px;height:30px;">사용자 정의 기준표 온도 설정4</button><br><br>
	<button type="set9" style="width:210px;height:30px;">사용자 정의 기준표 온도 설정5</button><br><br>
	<button type="submit" style="width:70px;height:30px;">확인</button>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<button type="send" style="width:70px;height:30px;">취소</button>
	</p>
<!--  본문 끝 -->


