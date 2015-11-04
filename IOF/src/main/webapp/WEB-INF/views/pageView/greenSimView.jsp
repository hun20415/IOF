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
	var greentom = new Array();
	<c:forEach items="${greentoms}" var="result">
	var json = new Object();
	json.nbru = "${result.nbru}";
	json.nblv = "${result.nblv}";
	json.dml = "${result.dml}";
	json.dms = "${result.dms}";
	json.dmf = "${result.dmf}";
	greentom.push(json);
	</c:forEach>
	
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
			"axisColor" : "#24B300",
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
			"lineColor" : "#24B300",
			"bullet" : "round",
			"bulletBorderThickness" : 1,
			"hideBulletsCount" : 30,
			"title" : "NBRU",
			"valueField" : "NBRU",
			"fillAlphas" : 0
		}, {
			"valueAxis" : "v1",
			"lineColor" : "#FCD202",
			"bullet" : "square",
			"bulletBorderThickness" : 1,
			"hideBulletsCount" : 30,
			"title" : "NBLV",
			"valueField" : "NBLV",
			"fillAlphas" : 0
		}, {
			"valueAxis" : "v2",
			"lineColor" : "#0000FF",
			"bullet" : "square",
			"bulletBorderThickness" : 1,
			"hideBulletsCount" : 30,
			"title" : "DML",
			"valueField" : "DML",
			"fillAlphas" : 0,
			"hidden" : true

		}, {
			"valueAxis" : "v3",
			"lineColor" : "#FCD202",
			"bullet" : "square",
			"bulletBorderThickness" : 1,
			"hideBulletsCount" : 30,
			"title" : "DMS",
			"valueField" : "DMS",
			"fillAlphas" : 0,
			"hidden" : true
		}, {
			"valueAxis" : "v4",
			"lineColor" : "#00CC00",
			"bullet" : "square",
			"bulletBorderThickness" : 1,
			"hideBulletsCount" : 30,
			"title" : "DMF",
			"valueField" : "DMF",
			"fillAlphas" : 0,
			"hidden" : true
		}],
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
			"minPeriod" : "dd"
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
		  var firstDate = new Date();
		  firstDate.setDate( firstDate.getDate() - 500 );
		  firstDate.setHours( 0, 0, 0, 0 );
		  
		for (var i = 0; i < greentom.length; i++) {
		    var newDate = new Date( firstDate );
		    newDate.setDate( newDate.getDate() + i );
		    
			var NBRU = greentom[i].nbru;
			var NBLV = greentom[i].nblv;
			var DML = greentom[i].dml;
			var DMS = greentom[i].dms;
			var DMF = greentom[i].dmf;

			chartData.push({
				date : newDate,
				NBRU : NBRU,
				NBLV : NBLV,
				DML : DML,
				DMS : DMS,
				DMF : DMF
			});
		}
		return chartData;
	}

	/************************************** 첫 번째 그래프 일반 그래프 end *********************************/
	/************************************** 첫 번째 그래프 일반 그래프2 start  ********************************/

	var chart = AmCharts.makeChart("chartdiv3", {
		type : "stock",
		"theme" : "light",

		dataSets : [ {
			fieldMappings : [ {
				fromField : "NBRU",
				toField : "NBRU"
			}, {
				fromField : "NBLV",
				toField : "NBLV"
			}, {
				fromField : "DML",
				toField : "DML"
			}, {
				fromField : "DMS",
				toField : "DMS"
			}, {
				fromField : "DMF",
				toField : "DMF"
			} ],
			dataProvider : chartData,
			categoryField : "date"
		} ],

		panels : [ {
			id : "NBRU",
			title : "NBRU",
			percentHeight : 20,
			stockGraphs : [ {
				valueField : "NBRU",
				showBalloon : false,
				fillAlphas : 1,
				type : "column",
				useDataSetColors : false,
				lineColor : "#24B300"
			} ],
			stockLegend : {
				useGraphSettings : true,
				valueTextRegular : undefined,
				periodValueTextComparing : "[[percents.value.close]]%",
				position : "right"
			}
		}, {
			id : "NBLV",
			title : "NBLV",
			percentHeight : 20,
			stockGraphs : [ {
				valueField : "NBLV",
				showBalloon : false,
				type : "column",
				fillAlphas : 1,
				useDataSetColors : false,
				lineColor : "#24B300"
			} ],
			stockLegend : {
				useGraphSettings : true,
				valueTextRegular : undefined,
				periodValueTextComparing : "[[percents.value.close]]%",
				position : "right"
			}

		}, {
			id : "DML",
			title : "DML",
			percentHeight : 20,
			stockGraphs : [ {
				valueField : "DML",
				showBalloon : false,
				fillAlphas : 1,
				useDataSetColors : false,
				lineColor : "#24B300"
			} ],
			stockLegend : {
				useGraphSettings : true,
				valueTextRegular : undefined,
				periodValueTextComparing : "[[percents.value.close]]%",
				position : "right"
			}
		}, {
			id : "DMS",
			title : "DMS",
			percentHeight : 20,
			stockGraphs : [ {
				valueField : "DMS",
				showBalloon : false,
				fillAlphas : 1,
				useDataSetColors : false,
				lineColor : "#24B300"
			} ],
			stockLegend : {
				useGraphSettings : true,
				valueTextRegular : undefined,
				periodValueTextComparing : "[[percents.value.close]]%",
				position : "right"
			}
		}, {
			id : "DMF",
			title : "DMF",
			percentHeight : 20,
			stockGraphs : [ {
				valueField : "DMF",
				showBalloon : false,
				fillAlphas : 1,
				useDataSetColors : false,
				lineColor : "#24B300"
			} ],
			stockLegend : {
				useGraphSettings : true,
				valueTextRegular : undefined,
				periodValueTextComparing : "[[percents.value.close]]%",
				position : "right"
			}
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

	<div id="ContentView" style="width: 1000px">
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
		<div style="clear: both;"></div>
		<!-- <div style="clear: both; height: 0px; overflow: hidden;"></div> -->

		<div style="float: left; margin-right: 10px;">
			<!-- 메인그래프 -->
			<div id="css_tabs2">
				<input id="tab5" type="radio" name="tab2" checked="checked" /><input
					id="tab6" type="radio" name="tab2" /><label for="tab5">생육</label>
				<label for="tab6">환경별 비교</label>

				<div class="tab1_content">

					<div id="chartdiv3"
						style="width: 805px; height: 600px; margin-left: 45px;"></div>

				</div>

				<div class="tab2_content" style="width: 800px">
					<!-- <div id="chartdiv2" style="width: 1000px; height: 480px;"></div> -->
					<div id="chartdiv"
						style="width: 100%; height: 480px; margin: auto;"></div>
				</div>




			</div>

			<!-- 메인그래프 end-->

			<div id="css_tabs">
				<input id="tab1" type="radio" name="tab" checked="checked" /> <label
					for="tab1">생육</label>



				<div class="tab1_content">
					<div class="tab1_table">number of nodes</div>
					<div class="tab1_table">number of leaves</div>
					<div class="tab1_table">leaf dry weight</div>
					<div class="tab1_table">stem dry weight</div>
					<div class="tab1_table">fruit dry weight</div>
					<div style="clear: both;"></div>
					<div class="tab1_table2" id="data1"></div>
					<div class="tab1_table2" id="data2"></div>
					<div class="tab1_table2" id="data3"></div>
					<div class="tab1_table2" id="data4"></div>
					<div class="tab1_table2" id="data9"></div>

				</div>


			</div>
		</div>


	</div>
</body>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>