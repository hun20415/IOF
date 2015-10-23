<!DOCTYPE html>
<html>

<head>

<link rel="stylesheet" href="../amcharts/style.css" type="text/css">
<link rel="stylesheet" href="../css/tab.css" type="text/css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="../amcharts/amcharts.js" type="text/javascript"></script>
<script src="../amcharts/serial.js" type="text/javascript"></script>
<script src="../amcharts/amstock.js" type="text/javascript"></script>
<!-- <script src="../js/temparChart.js" type="text/javascript"></script> -->
<!-- <script src="../js/temparTimeChart.js" type="text/javascript"></script> -->
<script src="../jquery/jquery-2.1.4.min.js" type="text/javascript"></script>
<script src="http://www.amcharts.com/lib/3/amcharts.js"></script>
<script src="http://www.amcharts.com/lib/3/serial.js"></script>
<script src="http://www.amcharts.com/lib/3/themes/light.js"></script>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>

<script type="text/javascript">
	var sensor = new Array(14);
	sensor[0] = new Array();
	sensor[1] = new Array();
	sensor[2] = new Array();
	sensor[3] = new Array();
	sensor[4] = new Array();
	sensor[5] = new Array();
	sensor[6] = new Array();
	sensor[7] = new Array();
	sensor[8] = new Array();
	sensor[9] = new Array();
	sensor[10] = new Array();
	sensor[11] = new Array();
	sensor[12] = new Array();
	sensor[13] = new Array();
	sensor[14] = new Array();
	var sensorF = new Array();

	function dataReadWeb() {

		<c:forEach items="${sensor1}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[1].push(json);
		</c:forEach>

		<c:forEach items="${sensor2}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[2].push(json);
		</c:forEach>

		<c:forEach items="${sensor3}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[3].push(json);
		</c:forEach>

		<c:forEach items="${sensor4}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[4].push(json);
		</c:forEach>

		<c:forEach items="${sensor5}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[5].push(json);
		</c:forEach>

		<c:forEach items="${sensor6}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[6].push(json);
		</c:forEach>

		<c:forEach items="${sensor7}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[7].push(json);
		</c:forEach>

		<c:forEach items="${sensor8}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[8].push(json);
		</c:forEach>

		<c:forEach items="${sensor9}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[9].push(json);
		</c:forEach>

		<c:forEach items="${sensor10}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[10].push(json);
		</c:forEach>

		<c:forEach items="${sensor11}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[11].push(json);
		</c:forEach>

		<c:forEach items="${sensor12}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[12].push(json);
		</c:forEach>

		<c:forEach items="${sensor13}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[13].push(json);
		</c:forEach>

		<c:forEach items="${sensor14}" var="result" end="1440">
		var json = new Object();
		json.eqId = "${result.farmEquipList.eqId}";
		json.eqValue = "${result.eqValue}";
		json.date = "${result.dataInqDate}";
		sensor[14].push(json);
		</c:forEach>

		sensorF[1] = sensor[1][0].eqValue;
		sensorF[2] = sensor[2][0].eqValue;
		sensorF[3] = sensor[3][0].eqValue;
		sensorF[4] = sensor[4][0].eqValue;
		sensorF[5] = sensor[5][0].eqValue;
		sensorF[6] = sensor[6][0].eqValue;
		sensorF[7] = sensor[7][0].eqValue;
		sensorF[8] = sensor[8][0].eqValue;
		sensorF[9] = sensor[9][0].eqValue;
		sensorF[10] = sensor[10][0].eqValue;
		sensorF[11] = sensor[11][0].eqValue;
		sensorF[12] = sensor[12][0].eqValue;
		sensorF[13] = sensor[13][0].eqValue;
		sensorF[14] = sensor[14][0].eqValue;
	}

	dataReadWeb();

	function windDirection(windD) {

		if (windD == 0) {
			return "0";
		} else if (windD == 1) {
			return "북";
		} else if (windD == 2) {
			return "북동";
		} else if (windD == 3) {
			return "동";
		} else if (windD == 4) {
			return "남동";
		} else if (windD == 5) {
			return "남";
		} else if (windD == 6) {
			return "남서";
		} else if (windD == 7) {
			return "서";
		} else if (windD == 8) {
			return "북서";
		} else {
			return "에러";
		}
	}

	var dataRoad = function(url) {

		$.ajax({
			url : url,
			type : 'GET',
			data : "",
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			dataType : "json",
			success : function(data) {

				var wind = windDirection(data[10][0].eqValue);
				$('#data1').html(data[0][0].eqValue);
				$('#data2').html(data[1][0].eqValue);
				$('#data3').html(data[2][0].eqValue);
				$('#data4').html(data[3][0].eqValue);
				$('#data5').html(data[4][0].eqValue);
				$('#data6').html(data[5][0].eqValue);
				$('#data7').html(data[6][0].eqValue);
				$('#data8').html(data[7][0].eqValue);
				$('#data9').html(data[8][0].eqValue);
				$('#data10').html(data[9][0].eqValue);
				$('#data11').html(wind);
				$('#data12').html(data[11][0].eqValue);
				$('#data13').html(data[12][0].eqValue);
				$('#data14').html(data[13][0].eqValue);

				//var newD = new Date(sensor[4][sensor[1].length -1].date);
				//$('#updateTime').html("데이터 갱신 : "+newD.getUTCFullYear()+"년 "+newD.getUTCMonth()+"월 "+newD.getUTCDay()+"일 "+newD.getUTCHours()+"시 "+newD.getUTCMinutes() +"분");
				var val = data[13][0].dataInqDate;
				var date = new Date(val);

				$('#updateTime').html("데이터 갱신 : " + getTimeStamp(date) + "");
			},
			error : function(request, status, error) {
				alert(error);
			}
		});
	};
	dataRoad('/loadSensor');

	function getTimeStamp(date) {
		var d = date;

		var s = leadingZeros(d.getFullYear(), 4) + '-'
				+ leadingZeros(d.getMonth() + 1, 2) + '-'
				+ leadingZeros(d.getDate(), 2) + ' '
				+ leadingZeros(d.getHours(), 2) + ':'
				+ leadingZeros(d.getMinutes(), 2);

		return s;
	};

	function leadingZeros(n, digits) {
		var zero = '';
		n = n.toString();

		if (n.length < digits) {
			for (i = 0; i < digits - n.length; i++)
				zero += '0';
		}
		return zero + n;
	};

	/************************************** 첫 번째 그래프 일반 그래프 start *********************************/

	var chartData = generateChartData();

	var chart = AmCharts.makeChart("chartdiv", {
		"type" : "serial",
		"theme" : "light",
		"legend" : {
			"useGraphSettings" : true
		},
		"legend" : {
			"position" : "right"
		},
		"dataProvider" : chartData,
		"valueAxes" : [ {
			"id" : "v1",
			"axisColor" : "#FF6600",
			"axisThickness" : 2,
			"gridAlpha" : 0,
			"axisAlpha" : 1,
			"position" : "left"
		}, {
			"id" : "v2",
			"axisColor" : "#0000FF",
			"axisThickness" : 2,
			"gridAlpha" : 0,
			"axisAlpha" : 1,
			"position" : "right",
			"offset" : 0,
			"tickLength" : 0

		}, {
			"id" : "v3",
			"axisColor" : "#FCD202",
			"axisThickness" : 2,
			"gridAlpha" : 0,
			"axisAlpha" : 1,
			"position" : "right",
			"tickLength" : 0,
			"offset" : 30
		}, {
			"id" : "v4",
			"axisColor" : "#00CC00",
			"axisThickness" : 2,
			"gridAlpha" : 0,
			"axisAlpha" : 1,
			"position" : "right",
			"tickLength" : 0,
			"offset" : 60
		} ],
		"graphs" : [ {
			"id" : "inTempareId",
			"valueAxis" : "v1",
			"lineColor" : "#FF6600",
			"bullet" : "round",
			"bulletBorderThickness" : 1,
			"hideBulletsCount" : 30,
			"title" : "실내온도",
			"valueField" : "inTempare",
			"fillAlphas" : 0
		}, {
			"valueAxis" : "v1",
			"lineColor" : "#FCD202",
			"bullet" : "square",
			"bulletBorderThickness" : 1,
			"hideBulletsCount" : 30,
			"title" : "실외온도",
			"valueField" : "outTempare",
			"fillAlphas" : 0
		}, {
			"valueAxis" : "v2",
			"lineColor" : "#0000FF",
			"bullet" : "square",
			"bulletBorderThickness" : 1,
			"hideBulletsCount" : 30,
			"title" : "습도",
			"valueField" : "humidity",
			"fillAlphas" : 0,
			"hidden" : true

		}, {
			"valueAxis" : "v3",
			"lineColor" : "#FCD202",
			"bullet" : "square",
			"bulletBorderThickness" : 1,
			"hideBulletsCount" : 30,
			"title" : "일사량",
			"valueField" : "solar",
			"fillAlphas" : 0,
			"hidden" : true
		}, {
			"valueAxis" : "v4",
			"lineColor" : "#00CC00",
			"bullet" : "square",
			"bulletBorderThickness" : 1,
			"hideBulletsCount" : 30,
			"title" : "co2",
			"valueField" : "co2",
			"fillAlphas" : 0,
			"hidden" : true
		}, {
			"id" : "fromGraph",
			"lineAlpha" : 0,
			"lineColor" : "#FCD202",
			"showBalloon" : false,
			"valueField" : "max",
			"fillAlphas" : 0,
			"visibleInLegend" : false
		}, {
			"fillAlphas" : 0.2,
			"lineColor" : "#FCD202",
			"fillToGraph" : "fromGraph",
			"lineAlpha" : 0,
			"showBalloon" : false,
			"valueField" : "min",
			"visibleInLegend" : false
		} ],
		/* "chartScrollbar" : {
			"graph" : "inTempareId",
			"oppositeAxis" : false,
			"offset" : 30,
			"scrollbarHeight" : 30

		}, */
		"chartCursor" : {
			"cursorPosition" : "mouse",

		},
		"ChartCursorSettings" : {
			"categoryBalloonDateFormats" : "period:'mm',format:'JJ:NN'"
		},

		"categoryField" : "date",
		"categoryAxis" : {
			"parseDates" : true,
			"axisColor" : "#DADADA",
			"minorGridEnabled" : true,
			"minPeriod" : "mm"
		},
		"export" : {
			"enabled" : true,
			"position" : "bottom-right"
		}

	});

	// generate some random data, quite different range
	function generateChartData() {
		var max = 35;
		var min = 10;
		var chartData = [];
		var sunrise = new Date();//일출
		var sunset = new Date();//일몰

		for (var i = 0; i < sensor[1].length; i++) {
			var newDate = new Date(sensor[4][sensor[1].length - i - 1].date);

			var inTempare = sensor[4][sensor[1].length - i - 1].eqValue;
			var outTempare = sensor[1][sensor[1].length - i - 1].eqValue;
			var humidity = sensor[7][sensor[1].length - i - 1].eqValue;
			var solar = sensor[9][sensor[1].length - i - 1].eqValue;
			var co2 = sensor[8][sensor[1].length - i - 1].eqValue;
			

			chartData.push({
				date : newDate,
				inTempare : inTempare,
				outTempare : outTempare,
				humidity : humidity,
				solar : solar,
				co2 : co2,
				max : max,
				min : min
			});
		}
		return chartData;
	}

	/************************************** 첫 번째 그래프 일반 그래프 end *********************************/

	var chart = AmCharts.makeChart("chartdiv3", {
		type : "stock",
		"theme" : "light",
		
		dataSets : [ {
			title : "습도",
			fieldMappings : [ {
				fromField : "humidity",
				toField : "humidity"
			}, {
				fromField : "solar",
				toField : "solar"
			}, {
				fromField : "co2",
				toField : "co2"
			} ],
			dataProvider : chartData,
			categoryField : "date"
		} ],

		panels : [ {
			id : "humidity",
			title : "습도",
			percentHeight : 30,
			stockGraphs : [ {
				valueField : "humidity",
				showBalloon : false,
				fillAlphas : 1,
				useDataSetColors : false,
				lineColor : "#FF6600"
			} ]
		}, {
			id : "solar",
			title : "일사량",
			percentHeight : 30,
			stockGraphs : [ {
				valueField : "solar",
				showBalloon : false,
				fillAlphas : 1,
				useDataSetColors : false,
				lineColor : "#FF6600"
			} ]
		}, {
			id : "co2",
			title : "CO2",
			percentHeight : 30,
			stockGraphs : [ {
				valueField : "co2",
				showBalloon : false,
				fillAlphas : 1,
				useDataSetColors : false,
				lineColor : "#FF6600"
			} ]
		} ],

		categoryAxesSettings : {
			minPeriod : "mm",
			position : "hidden"

		},
		"export" : {
			"enabled" : true
		},
		chartScrollbarSettings : {

			enabled : false
		},

	});

	/************************************** 첫 번째 그래프 일반 그래프2 end *********************************/

	/*
	 * chart.addListener("dataUpdated", zoomChart); zoomChart(); function
	 * zoomChart(){ chart.zoomToIndexes(chart.dataProvider.length,
	 * chart.dataProvider.length); }
	 */
	/************************************** 두번째 그래프 start *********************************/
	var chartData2 = generateChartData2();
	var chart2 = AmCharts.makeChart("chartdiv2", {
		"type" : "serial",
		"titles" : [ {
			"text" : "시간대 평균 온도"
		} ],
		"theme" : "light",
		"autoMarginOffset" : 25,
		"dataProvider" : chartData2,
		"valueAxes" : [ {
			"axisAlpha" : 0,
			"position" : "right"
		} ],
		"graphs" : [ {
			"id" : "g1",
			"balloonText" : "[[inTempare]] ℃</b>",
			"type" : "step",
			"bullet" : "square",
			"bulletAlpha" : 0,
			"bulletSize" : 4,
			"bulletBorderAlpha" : 0,
			"valueField" : "inTempare",
			"periodValue " : "Average"

		} ],
		"chartScrollbar" : {
			"graph" : "g1",
			"gridAlpha" : 0,
			"color" : "#888888",
			"scrollbarHeight" : 55,
			"backgroundAlpha" : 0,
			"selectedBackgroundAlpha" : 0.1,
			"selectedBackgroundColor" : "#888888",
			"graphFillAlpha" : 0,
			"autoGridCount" : true,
			"selectedGraphFillAlpha" : 0,
			"graphLineAlpha" : 1,
			"graphLineColor" : "#c2c2c2",
			"selectedGraphLineColor" : "#888888",
			"selectedGraphLineAlpha" : 1
		},
		"chartCursor" : {
			"fullWidth" : true,
			"categoryBalloonDateFormat" : "HH",
			"cursorAlpha" : 0.05,
			"graphBulletAlpha" : 1

		},
		"categoryField" : "date",
		"categoryAxis" : {
			"minPeriod" : "hh",
			"parseDates" : true,
			"gridAlpha" : 0
		},
		"export" : {
			"enabled" : true
		}

	});

	chart2.addListener("dataUpdated", zoomChart);

	function zoomChart2() {
		chart2.zoomToDates(new Date(1965, 0), new Date(1975, 0));
	}

	function generateChartData2() {
		var max = 35;
		var min = 10;
		var chartData = [];
		var oldHour;
		var count = 1;
		var sum = 0;
		for (var i = 0; i < sensor[1].length; i++) {
			var newDate = new Date(sensor[4][sensor[1].length - i - 1].date);
			var newHour = leadingZeros(newDate.getHours(), 2);
			if (i != 0) {
				oldHour = leadingZeros(newDate.getHours(), 2);
			}

			var inTempare = sensor[4][sensor[1].length - i - 1].eqValue;

			if (i == 0) {
				sum = sum + inTempare;
			} else if (oldHour == newHour) {

				count++;
				sum = sum + inTempare;
			} else {

				chartData.push({
					date : newDate,
					inTempare : inTempare,

				});
				count = 1;
				sum = 0;
			}
		}
		return chartData;
	}

	/************************************** 두 번째 그래프 시간 대 별 그래프 end *********************************/
</script>
</head>
<body style="background-color: #FFFFFF">

	<div id="ContentView" style="width: 1450px;">
		<div id="top_bar">
			<div class="title">온 실</div>
			<div class="contents">- 7 -</div>
			<div class="title">구 역</div>
			<div class="contents">- 1 -</div>
			<div class="title">품 종</div>
			<div class="contents2">Rainbow Lycopene</div>
			<div class="title">정 식 일</div>
			<div class="contents2">2015년 2월 24일</div>
			<div class="contents2">정식 32일 째</div>
			<div class="contents_time" id="updateTime"></div>
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
				    <div id="chartdiv" style="width: 1000px; height: 300px;"></div>
					<div id="chartdiv3"
						style="width: 805px; height: 200px; margin-left: 45px;"></div>

				</div>
                
				<div class="tab2_content">
					<div id="chartdiv2" style="width: 1000px; height: 480px;"></div>
					
				</div>
				
				
				
				
			</div>

			<!-- 메인그래프 end-->

			<div id="css_tabs">
				<input id="tab1" type="radio" name="tab" checked="checked" /> <input
					id="tab2" type="radio" name="tab" /> <input id="tab3" type="radio"
					name="tab" /> <input id="tab4" type="radio" name="tab" /> <input
					id="tab9" type="radio" name="tab" /> <label for="tab1">환경센서</label>
				<label for="tab2">제어</label> <label for="tab3">제어로그</label> <label
					for="tab4">양액</label> <label for="tab9">생육</label>


				<div class="tab1_content">
					<div class="tab1_table">실외 온도</div>
					<div class="tab1_table">좌측 온도</div>
					<div class="tab1_table">우측 온도</div>
					<div class="tab1_table">평균 온도</div>
					<div class="tab1_table">일사량</div>
					<div class="tab1_table">CO2</div>
					<div style="clear: both;"></div>
					<div class="tab1_table2" id="data1"></div>

					<div class="tab1_table2" id="data2"></div>
					<div class="tab1_table2" id="data3"></div>
					<div class="tab1_table2" id="data4"></div>
					<div class="tab1_table2" id="data9"></div>
					<div class="tab1_table2" id="data8"></div>
					<br> <br> <br>
					<div class="tab1_table">빗물감지</div>
					<div class="tab1_table">좌측 습도</div>
					<div class="tab1_table">우측 습도</div>
					<div class="tab1_table">평균 습도</div>
					<div class="tab1_table">지온</div>
					<div class="tab1_table">지습</div>
					<div style="clear: both;"></div>
					<div class="tab1_table2" id="data10"></div>
					<div class="tab1_table2" id="data5"></div>
					<div class="tab1_table2" id="data6"></div>
					<div class="tab1_table2" id="data7"></div>
					<div class="tab1_table2" id="data13"></div>
					<div class="tab1_table2" id="data14"></div>
					<br> <br> <br>
					<div class="tab1_table">풍 향</div>
					<div class="tab1_table">풍 속</div>
					<div style="clear: both;"></div>
					<div class="tab1_table2" id="data11"></div>
					<div class="tab1_table2" id="data12"></div>
					<br> <br> <br>
				</div>

				<div class="tab2_content">
					<div class="tab1_content">
						<div class="tab1_table">측창 1</div>
						<div class="tab1_table">측창 2</div>
						<div class="tab1_table">측창 3</div>
						<div class="tab1_table">측창 4</div>
						<div class="tab1_table">차광스크린 1</div>
						<div class="tab1_table">차광스크린 2</div>
						<div style="clear: both;"></div>
						<div class="tab1_table2">
							<script type="text/javascript">
								//document.write(sensorF[1]);
							</script>
							50%
						</div>
						<div class="tab1_table2">
							<script type="text/javascript">
								// document.write(sensorF[2]);
							</script>
							40%
						</div>
						<div class="tab1_table2">
							<script type="text/javascript">
								//document.write(sensorF[3]);
							</script>
							40%
						</div>
						<div class="tab1_table2" id="av_temp">
							<script type="text/javascript">
								//document.write(sensorF[4]);
							</script>
							40%
						</div>
						<div class="tab1_table2">
							<script type="text/javascript">
								//document.write(sensorF[9]);
							</script>
							60%
						</div>
						<div class="tab1_table2">
							<script type="text/javascript">
								//document.write(sensorF[8]);
							</script>
							60%
						</div>
						<br> <br> <br>
						<div class="tab1_table">보온커튼 1</div>
						<div class="tab1_table">보온커튼 2</div>
						<div class="tab1_table">보온커튼 3</div>
						<div class="tab1_table">배기팬</div>
						<div class="tab1_table">유동팬</div>
						<div class="tab1_table">난방기</div>
						<div style="clear: both;"></div>
						<div class="tab1_table2">
							<script type="text/javascript">
								//document.write(sensorF[10]);
							</script>
							OFF
						</div>
						<div class="tab1_table2">
							<script type="text/javascript">
								//document.write(sensorF[5]);
							</script>
							OFF
						</div>
						<div class="tab1_table2">
							<script type="text/javascript">
								//document.write(sensorF[6]);
							</script>
							OFF
						</div>
						<div class="tab1_table2">
							<script type="text/javascript">
								//document.write(sensorF[7]);
							</script>
							ON
						</div>
						<div class="tab1_table2">
							<script type="text/javascript">
								//document.write(sensorF[13]);
							</script>
							ON
						</div>
						<div class="tab1_table2">
							<script type="text/javascript">
								//document.write(sensorF[14]);
							</script>
							OFF
						</div>
					</div>
				</div>
				<div class="tab3_content">

					<ul>
						<li>[09:50] 급수 완료</li>
						<li>[07:17] 급수 시작</li>
						<li>[05:50] 차양 커튼 60%</li>
						<li>[12:50] 난방 가동</li>
						<li>[10:50] 1번 측창 50% 열림</li>
						<li>[09:50] 2번 측창 50% 열림</li>
						<li>[07:17] 3번 측창 50% 열림</li>
						<li>[05:50] 4번 측창 50% 열림</li>
						<li>[09:50] 5번 측창 50% 열림</li>
						<li>[07:17] 양액 투여</li>
						<li>[05:50] 이산화탄소 공급 완료</li>
						<li>[09:50] 급수 완료</li>
						<li>[07:17] 급수 시작</li>
						<li>[05:50] 이산화탄소 공급 시작</li>
					</ul>
				</div>
				<div class="tab4_content">
					Tab4 내용 <br />사십 듯이 만들 황급하였다. 말조차 벌던 방학을 있었다. 그러자, 날리고 젠장맞을 없었다.
					보배를 수 조금 남은 없네, 있다. 그는 은전이 원 수 띄었다. 아씨, 하고 천하를 그들의 모든 병자에 뿐이다.
				</div>
				<div class="tab9_content">
					Tab9 내용 <br />사십 듯이 만들 황급하였다. 말조차 벌던 방학을 있었다. 그러자, 날리고 젠장맞을 없었다.
					보배를 수 조금 남은 없네, 있다. 그는 은전이 원 수 띄었다. 아씨, 하고 천하를 그들의 모든 병자에 뿐이다.
				</div>
			</div>
		</div>

		<div></div>
		<div>
			<div id="css_tabs3">
				<input id="tab7" type="radio" name="tab3" checked="checked" /> <label
					for="tab7">알람</label>

				<div class="tab1_content">
					<ul style="font-weight: bold; padding-left: 10px;">
						<li style="list-style: none;">[12:50] 일사량 부족</li>
						<li style="list-style: none;">[10:50] 급격한 기온 상승</li>
						<li style="list-style: none;">[09:50] 급격한 기온 상승</li>
						<li style="list-style: none;">[07:17] 냉해 발생 주의</li>
						<li style="list-style: none;">[05:50] 건조 주의</li>
						<li style="list-style: none;">[09:50] 급격한 기온 상승</li>
						<li style="list-style: none;">[07:17] 냉해 발생 주의</li>
						<li style="list-style: none;">[05:50] 건조 주의</li>
						<li style="list-style: none;">[09:50] 급격한 기온 상승</li>
						<li style="list-style: none;">[07:17] 냉해 발생 주의</li>
						<li style="list-style: none;">[05:50] 건조 주의</li>
						<li style="list-style: none;">[09:50] 급격한 기온 상승</li>
						<li style="list-style: none;">[07:17] 냉해 발생 주의</li>
						<li style="list-style: none;">[05:50] 건조 주의</li>
					</ul>
				</div>

			</div>
		</div>
		<div>
			<div id="css_tabs4">
				<input id="tab8" type="radio" name="tab4" checked="checked" /> <label
					for="tab8">영농정보</label>

				<div class="tab1_content">영농정보</div>

			</div>
		</div>

	</div>
</body>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>