var chartData = generateChartData();

// generate some random data, quite different range
function generateChartData() {
	var max = 35;
	var min = 10;
	var chartData = [];
	var firstDate = new Date();
	firstDate.setDate(firstDate.getDate() - 100);
	
	for (var i = 0; i < 1440; i++) {
		var newDate = new Date(firstDate);
		newDate.setDate(newDate.getDate() + i);

		var inTempare = Math.round(Math.random() * 40) + 100;
		var outTempare = Math.round(Math.random() * 80) + 500;

		chartData.push({
			date : newDate,
			inTempare : inTempare,
			outTempare : outTempare,
			max : max,
			min : min
		});
	}
	return chartData;
}

var chart = AmCharts.makeChart("chartdiv", {
	"type" : "serial",
	"theme" : "light",
	"legend" : {
		"useGraphSettings" : true
	},
	"dataProvider" : chartData,
	"valueAxes" : [ {
		"id" : "v1",
		"axisColor" : "#FF6600",
		"axisThickness" : 2,
		"gridAlpha" : 0,
		"axisAlpha" : 1,
		"position" : "left"
	} ],
	"graphs" : [ {
		"valueAxis" : "v1",
		"lineColor" : "#FF6600",
		"bullet" : "round",
		"bulletBorderThickness" : 1,
		"hideBulletsCount" : 30,
		"title" : "red line",
		"valueField" : "inTempare",
		"fillAlphas" : 0
	}, {
		"valueAxis" : "v1",
		"lineColor" : "#FCD202",
		"bullet" : "square",
		"bulletBorderThickness" : 1,
		"hideBulletsCount" : 30,
		"title" : "yellow line",
		"valueField" : "outTempare",
		"fillAlphas" : 0
	}, {
		"id" : "fromGraph",
		"lineAlpha" : 1,
		"lineColor" : "#FCD202",
		"showBalloon" : false,
		"valueField" : "max",
		"fillAlphas" : 0
	}, {
		"fillAlphas" : 0.2,
		"lineColor" : "#FCD202",
		"fillToGraph" : "fromGraph",
		"lineAlpha" : 1,
		"showBalloon" : false,
		"valueField" : "min"
	} ],
	"chartScrollbar" : {},
	"chartCursor" : {
		"cursorPosition" : "mouse"
	},
	"categoryField" : "date",
	"categoryAxis" : {
		"parseDates" : true,
		"axisColor" : "#DADADA",
		"minorGridEnabled" : true
	},
	"export" : {
		"enabled" : true,
		"position" : "bottom-right"
	}
});
/*
 * chart.addListener("dataUpdated", zoomChart); zoomChart(); function
 * zoomChart(){ chart.zoomToIndexes(chart.dataProvider.length,
 * chart.dataProvider.length); }
 */
