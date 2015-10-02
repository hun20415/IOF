
/*var chartData1 = [];
var chartData2 = [];

function generateChartData2() {
	var check = null;
	for (var i = 0; i < sensor[1].length; i++) {

		if ((sensor[4][sensor[1].length - i] != null) || check != null) {

			var newDate = new Date(sensor[4][sensor[1].length - i].date);
			var a = sensor[4][sensor[1].length - i].eqValue;
			var b = sensor[3][sensor[1].length - i].eqValue;

			chartData1.push({
				date : newDate,
				value : a
			});
			chartData2.push({
				date : newDate,
				value : b,
			});
		}
	}
}

function createStockChart2() {
	var chart = new AmCharts.AmStockChart();

	var categoryAxesSettings = new AmCharts.CategoryAxesSettings();
	categoryAxesSettings.minPeriod = "hh";	
	chart.categoryAxesSettings = categoryAxesSettings;
	
	// DATASETS //////////////////////////////////////////
	// create data sets first
	var dataSet1 = new AmCharts.DataSet();
	dataSet1.title = "first data set";
	dataSet1.fieldMappings = [ {
		fromField : "value",
		toField : "value"
	} ];
	dataSet1.dataProvider = chartData1;
	dataSet1.categoryField = "date";

	var dataSet2 = new AmCharts.DataSet();
	dataSet2.title = "second data set";
	dataSet2.fieldMappings = [ {
		fromField : "value",
		toField : "value"
	}
	];
	dataSet2.dataProvider = chartData2;
	dataSet2.categoryField = "date";

	// set data sets to the chart
	chart.dataSets = [ dataSet1, dataSet2 ];

	// PANELS ///////////////////////////////////////////
	// first stock panel
	var stockPanel1 = new AmCharts.StockPanel();
	stockPanel1.showCategoryAxis = false;
	stockPanel1.title = "Value";
	stockPanel1.percentHeight = 60;

	// graph of first stock panel
	var graph1 = new AmCharts.StockGraph();
	graph1.valueField = "value";
	graph1.comparable = true;
	graph1.bullet = "round";
	graph1.bulletBorderColor = "#FFFFFF";
	graph1.bulletBorderAlpha = 1;
	graph1.compareGraphBullet = "round";
	graph1.compareGraphBulletBorderColor = "#FFFFFF";
	graph1.compareGraphBulletBorderAlpha = 1;
	graph1.periodValue = "Average";
	stockPanel1.addStockGraph(graph1);
	
	// create stock legend
	var stockLegend1 = new AmCharts.StockLegend();
	stockLegend1.periodValueTextRegular = "[[value.close]]";
	stockPanel1.stockLegend = stockLegend1;

	
	// set panels to the chart
	chart.panels = [ stockPanel1 ];

	// OTHER SETTINGS ////////////////////////////////////
	var sbsettings = new AmCharts.ChartScrollbarSettings();
	sbsettings.graph = graph1;
	chart.chartScrollbarSettings = sbsettings;
	

	// CURSOR
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

	// DATA SET SELECTOR
	var dataSetSelector = new AmCharts.DataSetSelector();
	dataSetSelector.position = "top";
	chart.dataSetSelector = dataSetSelector;

	chart.write('chartdiv2');
}*/

var chartData2 = generateChartData2();
var chart2 = AmCharts.makeChart("chartdiv2", {
    "type": "serial",
    "theme": "light",
    "legend": {
        "useGraphSettings": true
    },
    "dataProvider": chartData2,
    "valueAxes": [{
        "id":"v1",
        "axisColor": "#FF6600",
        "axisThickness": 2,
        "gridAlpha": 0,
        "axisAlpha": 1,
        "position": "left"
    }],
    "graphs": [{
        "valueAxis": "v1",
        "lineColor": "#FF6600",
        "bullet": "round",
        "bulletBorderThickness": 1,
        "hideBulletsCount": 30,
        "title": "red line",
        "valueField": "visits",
		"fillAlphas": 0
    }, {
        "valueAxis": "v2",
        "lineColor": "#FCD202",
        "bullet": "square",
        "bulletBorderThickness": 1,
        "hideBulletsCount": 30,
        "title": "yellow line",
        "valueField": "hits",
		"fillAlphas": 0
    }, {
        "valueAxis": "v3",
        "lineColor": "#B0DE09",
        "bullet": "triangleUp",
        "bulletBorderThickness": 1,
        "hideBulletsCount": 30,
        "title": "green line",
        "valueField": "views",
		"fillAlphas": 0
    }],
    "chartScrollbar": {},
    "chartCursor": {
        "cursorPosition": "mouse"
    },
    "categoryField": "date",
    "categoryAxis": {
        "parseDates": true,
        "axisColor": "#DADADA",
        "minorGridEnabled": true,
        "minPeriod": "hh"
    },
    "export": {
    	"enabled": true,
        "position": "bottom-right"
     },
    "dataLoader":{
    	"url" : "mainPageView.jsp"
    }
});

chart2.addListener("dataUpdated", zoomChart2);
zoomChart2();

function zoomChart2(){
    chart2.zoomToIndexes(chart2.dataProvider.length - 20, chart2.dataProvider.length - 1);
}

function generateChartData2() {
	
	
    var check = null;
     var chartData2 = [];
        var firstDate = new Date();
        firstDate.setDate(firstDate.getDate() - 100);

        for (var i = 0; i < 100; i++) {
            // we create date objects here. In your data, you can have date strings
            // and then set format of your dates using chart.dataDateFormat property,
            // however when possible, use date objects, as this will speed up chart rendering.
            var newDate = new Date(firstDate);
            newDate.setDate(newDate.getDate() + i);

            var visits = Math.round(Math.random() * 80) + 500;
            var hits = Math.round(Math.random() * 80) + 500;
            var views = sensor[3][4].eqValue;

            chartData2.push({
                date: newDate,
                visits: visits,
                hits: hits,
                views: views
            });
        }
        return chartData2;
}