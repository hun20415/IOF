var chartData = [];
var chart;

function generateChartData() {
	var check = null;
	
	
	for (var i = 0; i < sensor[1].length; i++) {

		if ((sensor[4][i] != null) || check != null) {

			var newDate = new Date(sensor[4][sensor[1].length - i].date);
			var a = sensor[4][sensor[1].length - i].eqValue;
			var b = sensor[7][sensor[1].length - i].eqValue;
			var c = sensor[9][sensor[1].length - i].eqValue;

			chartData.push({
				date : newDate,
				value : a,
				volume : b,
				volume2 : c
			});
		}
		check = 1;
	}
}

function createStockChart() {
	chart = new AmCharts.AmStockChart();

	// As we have minutely data, we should set minPeriod to "mm"
	var categoryAxesSettings = new AmCharts.CategoryAxesSettings();
	categoryAxesSettings.minPeriod = "mm";
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
	},{
		fromField : "volume2",
		toField : "volume2"
	}
	];
	dataSet.dataProvider = chartData;
	dataSet.categoryField = "date";

	// set data sets to the chart
	chart.dataSets = [dataSet];

	// PANELS ///////////////////////////////////////////
	// first stock panel
	var stockPanel1 = new AmCharts.StockPanel();
	stockPanel1.showCategoryAxis = false;
	stockPanel1.title = "온도(℃)";
	stockPanel1.percentHeight = 60;

	// graph of first stock panel
	var graph1 = new AmCharts.StockGraph();
	graph1.valueField = "value";
	graph1.type = "line";
	graph1.lineThickness = 2;
	graph1.bullet = "round";
	graph1.lineColor  = "#FF8000";
	graph1.bulletBorderColor = "#FFFFFF";
	graph1.bulletBorderAlpha = 1;
	graph1.bulletBorderThickness = 3;
	graph1.useDataSetColors = false;
	
	stockPanel1.addStockGraph(graph1);

	// create stock legend
	var stockLegend1 = new AmCharts.StockLegend();
	stockLegend1.valueTextRegular = " ";
	stockLegend1.markerType = "none";
	stockPanel1.stockLegend = stockLegend1;

	// second stock panel
	var stockPanel2 = new AmCharts.StockPanel();
	stockPanel2.title = "습도(%)";
	stockPanel2.percentHeight = 20;
	var graph2 = new AmCharts.StockGraph();
	graph2.valueField = "volume";
	graph2.cornerRadiusTop = 2;
	graph2.lineColor  = "#99FFFF";
	graph2.useDataSetColors = false;
	graph2.fillAlphas = 1;
	stockPanel2.addStockGraph(graph2);

	// create stock legend
	var stockLegend2 = new AmCharts.StockLegend();
	stockLegend2.valueTextRegular = " ";
	stockLegend2.markerType = "none";
	stockPanel2.stockLegend = stockLegend2;
	
	
	// 3 stock panel
	var stockPanel3 = new AmCharts.StockPanel();
	stockPanel3.title = "일사량";
	stockPanel3.percentHeight = 20;
	var graph3 = new AmCharts.StockGraph();
	graph3.valueField = "volume2";
	graph3.cornerRadiusTop = 2;
	graph3.fillAlphas = 1;
	graph3.lineColor  = "#FFCC99";
	graph3.useDataSetColors = false;
	stockPanel3.addStockGraph(graph3);

	// create stock legend
	var stockLegend3 = new AmCharts.StockLegend();
	stockLegend3.valueTextRegular = " ";
	stockLegend3.markerType = "none";
	stockPanel3.stockLegend = stockLegend3;
	
	
	// set panels to the chart
	chart.panels = [ stockPanel1, stockPanel2, stockPanel3 ];

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

	
	var panelsSettings = new AmCharts.PanelsSettings();
	panelsSettings.mouseWheelZoomEnabled = true;
	panelsSettings.usePrefixes = true;
	chart.panelsSettings = panelsSettings;

	chart.write('chartdiv');
}

// //////////////////////////////////////////////////////////////////////////////////////////////////////////////
// //////////////////////////////////////////////////////////////////////////////////////////////////////////////
// //////////////////////////////////////////////////////////////////////////////////////////////////////////////
// //////////////////////////////////////////////////////////////////////////////////////////////////////////////
