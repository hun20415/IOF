<!DOCTYPE html>
<html>

<head>

<link rel="stylesheet" href="../amcharts/style.css" type="text/css">
<link rel="stylesheet" href="../css/tab.css" type="text/css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="../amcharts/amcharts.js" type="text/javascript"></script>
<script src="../amcharts/serial.js" type="text/javascript"></script>
<script src="../amcharts/amstock.js" type="text/javascript"></script>
<script src="../js/temparChart.js" type="text/javascript"></script>
<script src="../jquery/jquery-2.1.4.min.js" type="text/javascript"></script>

<script type="text/javascript">
	var temperList = new Array();
	var humiList = new Array();

	//var resultValue = new Array();

	//var resultList = new Array();
	//var resultValue = new Array();

	<c:forEach items="${HERTemper}" var="result" end="360">

	var json = new Object();
	json.eqId = "${result.farmEquipList.eqId}";
	json.eqValue = "${result.eqValue}";
	json.date = "${result.dataInqDate}";
	temperList.push(json);

	</c:forEach>

	<c:forEach items="${HERHu}" var="result" end="360">
	var json = new Object();
	json.eqId = "${result.farmEquipList.eqId}";
	json.eqValue = "${result.eqValue}";
	json.date = "${result.dataInqDate}";
	humiList.push(json);
	</c:forEach>

	var temper = temperList[0].eqValue;
	var humi = humiList[0].eqValue;

	AmCharts.ready(function() {
		generateChartData();
		createStockChart();
	});

	var chartData = [];

	

	var chart;

	
</script>
</head>
<body style="background-color: #FFFFFF">
	<div>
		<button onClick="window.location.reload()"
			style="margin-bottom: 10px;">데이터 갱신</button>
	</div>

	<div id="top_bar">
		<div class="title">온 실</div>
		<div class="contents"></div>
		<div class="title">구 역</div>
		<div class="contents"></div>
		<div class="title">품 종</div>
		<div class="contents"></div>
		<div class="title">정 식 일</div>
		<div class="contents"></div>
		<div class="contents"></div>
		<div style="clear: both;"></div>
	</div>


	<div style="float: left"></div>

	<!-- <div style="clear: both; height: 0px; overflow: hidden;"></div> -->

	<div style="float: left; margin-right: 10px;">
		<!-- 메인그래프 -->
		<div id="css_tabs2">
			<input id="tab5" type="radio" name="tab2" checked="checked" /> <input
				id="tab6" type="radio" name="tab2" /> <label for="tab5">일반</label>
			<label for="tab6">시간 대별</label>

			<div class="tab1_content">
				<div id="chartdiv" style="width: 700px; height: 400px;"></div>
			</div>
			<div class="tab2_content">
				<div id="chartdiv2" style="width: 700px; height: 400px;"></div>
			</div>
		</div>

		<!-- 메인그래프 end-->

		<div id="css_tabs">
			<input id="tab1" type="radio" name="tab" checked="checked" /> <input
				id="tab2" type="radio" name="tab" /> <input id="tab3" type="radio"
				name="tab" /> <input id="tab4" type="radio" name="tab" /> <label
				for="tab1">환경센서</label> <label for="tab2">제어</label> <label
				for="tab3">양액</label> <label for="tab4">생육정보</label>


			<div class="tab1_content">
				<div class="tab1_table">실외 온도</div>
				<div class="tab1_table">좌측 온도</div>
				<div class="tab1_table">우측 온도</div>
				<div class="tab1_table">평균 온도</div>
				<div class="tab1_table">일사량</div>
				<div class="tab1_table">일 누적 일사량</div>
				<p>
				<div class="tab1_table2">실외 온도</div>
				<div class="tab1_table2">좌측 온도</div>
				<div class="tab1_table2">우측 온도</div>
				<div class="tab1_table2" id="av_temp">
					<script type="text/javascript">
						document.write(temper);
					</script>
				</div>
				<div class="tab1_table2">일사량</div>
				<div class="tab1_table2">일 누적 일사량</div>
				<br> <br> <br>
				<div class="tab1_table">CO2</div>
				<div class="tab1_table">좌측 습도</div>
				<div class="tab1_table">우측 습도</div>
				<div class="tab1_table">평균 습도</div>
				<div class="tab1_table">지온</div>
				<div class="tab1_table">지습</div>
				<p>
				<div class="tab1_table2">실외 온도</div>
				<div class="tab1_table2">좌측 온도</div>
				<div class="tab1_table2">우측 온도</div>
				<div class="tab1_table2">
					<script type="text/javascript">
						document.write(humi);
					</script>
				</div>
				<div class="tab1_table2">일사량</div>
				<div class="tab1_table2">일 누적 일사량</div>
				<br> <br> <br> <br> <br>
			</div>

			<div class="tab2_content">
				Tab2 내용 <br />근 인력거꾼의 그 라디오로 한다느니보다 바이며, 왜 2위는 충실하였다. 말라서 듯이 높게 또
				가지고 것이다. 궂은 같은 끝나가고 소리가 김첨지는 쳐보았건만, 액수에 후려갈겼다. 그 속에서 하고 과한데.
			</div>
			<div class="tab3_content">
				Tab3 내용 <br />사십 듯이 만들 황급하였다. 말조차 벌던 방학을 있었다. 그러자, 날리고 젠장맞을 없었다.
				보배를 수 조금 남은 없네, 있다. 그는 은전이 원 수 띄었다. 아씨, 하고 천하를 그들의 모든 병자에 뿐이다.
			</div>
			<div class="tab4_content">
				Tab4 내용 <br />사십 듯이 만들 황급하였다. 말조차 벌던 방학을 있었다. 그러자, 날리고 젠장맞을 없었다.
				보배를 수 조금 남은 없네, 있다. 그는 은전이 원 수 띄었다. 아씨, 하고 천하를 그들의 모든 병자에 뿐이다.
			</div>
		</div>
	</div>
	<div></div>
	<div>
		<div id="css_tabs3">
			<input id="tab7" type="radio" name="tab3" checked="checked" /> <label
				for="tab7">알람</label>

			<div class="tab1_content">asdasdsdasdgsgsddg</div>

		</div>
	</div>
	<div>
        <div id="css_tabs4">
            <input id="tab8" type="radio" name="tab4" checked="checked" /> <label
                for="tab8">영농정보</label>

            <div class="tab1_content">asdasdsdasdgsgsddg</div>

        </div>
    </div>
   

</body>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>