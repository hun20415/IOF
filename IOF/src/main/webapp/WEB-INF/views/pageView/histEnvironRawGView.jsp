<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>

<head>

<link rel="stylesheet" href="../amcharts/style.css" type="text/css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="../amcharts/amcharts.js" type="text/javascript"></script>
<script src="../amcharts/serial.js" type="text/javascript"></script>
<script src="../amcharts/amstock.js" type="text/javascript"></script>
<script src="../jquery/jquery-2.1.4.min.js" type="text/javascript"></script>
<%-- <form name="selectForm">

	<select name="ownerId">
		<c:forEach items="${ownerList}" var="owner">
			<option value="${owner.userId}">${owner.userName}</option>
		</c:forEach>
	</select> <input type="submit" value="검색" onclick="histEnvironRawG">

</form> --%>
<script type="text/javascript">


	var resultList = new Array();
	//var resultValue = new Array();

	<c:forEach items="${listHistEnvironRaw}" var="result">
	var json = new Object();
	json.eqId = "${result.farmEquipList.eqId}";
	json.eqValue = "${result.eqValue}";
	json.date = "${result.dataInqDate}";
	/* resultList.push("${result.eqValue}");
	 resultList.push("${result.farmEquipList.eqId}"); */
	resultList.push(json);
	</c:forEach>

	AmCharts.ready(function() {
		generateChartData();
		createStockChart();
	});

	var chartData = [];

	function generateChartData() {
		/* var firstDate = new Date(2012, 0, 1);
		firstDate.setDate(firstDate.getDate() - 1000);
		firstDate.setHours(0, 0, 0, 0);
 */
		for (var i = 0; i < resultList.length ; i++) {
			var newDate = new Date(resultList[i].date);


			var a = resultList[i].eqValue;
			var b = resultList[i].eqValue;;

			chartData.push({
				date : newDate,
				value : a,
				volume : b
			});
		}
	}

	var chart;

	function createStockChart() {
		chart = new AmCharts.AmStockChart();

		// As we have minutely data, we should set minPeriod to "mm"
		var categoryAxesSettings = new AmCharts.CategoryAxesSettings();
		categoryAxesSettings.minPeriod = "ss";
		chart.categoryAxesSettings = categoryAxesSettings;

		// DATASETS //////////////////////////////////////////
		var dataSet = new AmCharts.DataSet();
		dataSet.color = "#b0de09";
		dataSet.fieldMappings = [ {
			fromField : "value",
			toField : "value"
		}, {
			fromField : "volume",
			toField : "volume"
		} ];
		dataSet.dataProvider = chartData;
		dataSet.categoryField = "date";

		// set data sets to the chart
		chart.dataSets = [ dataSet ];

		// PANELS ///////////////////////////////////////////
		// first stock panel
		var stockPanel1 = new AmCharts.StockPanel();
		stockPanel1.showCategoryAxis = false;
		stockPanel1.title = "Value";
		stockPanel1.percentHeight = 70;

		// graph of first stock panel
		var graph1 = new AmCharts.StockGraph();
		graph1.valueField = "value";
		graph1.type = "smoothedLine";
		graph1.lineThickness = 2;
		graph1.bullet = "round";
		graph1.bulletBorderColor = "#FFFFFF";
		graph1.bulletBorderAlpha = 1;
		graph1.bulletBorderThickness = 3;
		stockPanel1.addStockGraph(graph1);

		// create stock legend
		var stockLegend1 = new AmCharts.StockLegend();
		stockLegend1.valueTextRegular = " ";
		stockLegend1.markerType = "none";
		stockPanel1.stockLegend = stockLegend1;

		// second stock panel
		var stockPanel2 = new AmCharts.StockPanel();
		stockPanel2.title = "Volume";
		stockPanel2.percentHeight = 30;
		var graph2 = new AmCharts.StockGraph();
		graph2.valueField = "volume";
		graph2.type = "column";
		graph2.cornerRadiusTop = 2;
		graph2.fillAlphas = 1;
		stockPanel2.addStockGraph(graph2);

		// create stock legend
		var stockLegend2 = new AmCharts.StockLegend();
		stockLegend2.valueTextRegular = " ";
		stockLegend2.markerType = "none";
		stockPanel2.stockLegend = stockLegend2;

		// set panels to the chart
		chart.panels = [ stockPanel1, stockPanel2 ];

		// OTHER SETTINGS ////////////////////////////////////
		var scrollbarSettings = new AmCharts.ChartScrollbarSettings();
		scrollbarSettings.graph = graph1;
		scrollbarSettings.updateOnReleaseOnly = true;
		scrollbarSettings.usePeriod = "10mm"; // this will improve performance
		scrollbarSettings.position = "top";
		chart.chartScrollbarSettings = scrollbarSettings;

		var cursorSettings = new AmCharts.ChartCursorSettings();
		cursorSettings.valueBalloonsEnabled = true;
		chart.chartCursorSettings = cursorSettings;

		// PERIOD SELECTOR ///////////////////////////////////
		var periodSelector = new AmCharts.PeriodSelector();
		periodSelector.position = "top";
		periodSelector.dateFormat = "YYYY-MM-DD JJ:NN";
		periodSelector.inputFieldWidth = 150;
		periodSelector.periods = [ {
			period : "hh",
			count : 1,
			label : "1 hour"
		}, {
			period : "hh",
			count : 2,
			label : "2 hours"
		}, {
			period : "hh",
			count : 5,
			label : "5 hour"
		}, {
			period : "hh",
			count : 12,
			label : "12 hours"
		}, {
			period : "MAX",
			label : "MAX"
		} ];
		chart.periodSelector = periodSelector;

		var panelsSettings = new AmCharts.PanelsSettings();
		panelsSettings.mouseWheelZoomEnabled = true;
		panelsSettings.usePrefixes = true;
		chart.panelsSettings = panelsSettings;

		chart.write('chartdiv');
	}
</script>
</head>
<body style="background-color: #FFFFFF">

	<div id="chartdiv" style="width: 100%; height: 600px;"></div>
	
	<button onClick="window.location.reload()">데이터 갱신</a> 
</body>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>