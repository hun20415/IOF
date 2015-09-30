function generateChartData() {

		for (var i = 0; i < temperList.length; i++) {
			var newDate = new Date(temperList[i].date);

			var a = temperList[i].eqValue;
			var b = humiList[i].eqValue;
			;

			chartData.push({
				date : newDate,
				value : a,
				volume : b
			});
		}
	}

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
	chart.write('chartdiv2');
}