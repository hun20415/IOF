<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
       
        <link rel="stylesheet" href="../amcharts/style.css" type="text/css">

        <script src="../amcharts/amcharts.js" type="text/javascript"></script>
        <script src="../amcharts/serial.js" type="text/javascript"></script>
        <script src="../amcharts/amstock.js" type="text/javascript"></script>


        <script>

            var chartData1 = [];
            var chartData2 = [];
            var chartData3 = [];
            var chartData4 = [];

            generateChartData();

            function generateChartData() {
                var firstDate = new Date();
                firstDate.setDate(firstDate.getDate() - 500);
                firstDate.setHours(0, 0, 0, 0);

                for (var i = 0; i < 500; i++) {
                    var newDate = new Date(firstDate);
                    newDate.setDate(newDate.getDate() + i);

                    var a1 = Math.round(Math.random() * (40 + i)) + 100 + i;
                    var b1 = Math.round(Math.random() * (1000 + i)) + 500 + i * 2;

                    var a2 = Math.round(Math.random() * (100 + i)) + 200 + i;
                    var b2 = Math.round(Math.random() * (1000 + i)) + 600 + i * 2;

                    var a3 = Math.round(Math.random() * (100 + i)) + 200;
                    var b3 = Math.round(Math.random() * (1000 + i)) + 600 + i * 2;

                    var a4 = Math.round(Math.random() * (100 + i)) + 200 + i;
                    var b4 = Math.round(Math.random() * (100 + i)) + 600 + i;

                    chartData1.push({
                        date: newDate,
                        value: a1,
                        volume: b1
                    });
                    chartData2.push({
                        date: newDate,
                        value: a2,
                        volume: b2
                    });
                    chartData3.push({
                        date: newDate,
                        value: a3,
                        volume: b3
                    });
                    chartData4.push({
                        date: newDate,
                        value: a4,
                        volume: b4
                    });
                }
            }

            AmCharts.makeChart("chartdiv", {
                type: "stock",
                dataSets: [{
                    title: "실내 온도",
                    fieldMappings: [{
                        fromField: "value",
                        toField: "value"
                    }, {
                        fromField: "volume",
                        toField: "volume"
                    }],
                    dataProvider: chartData1,
                    categoryField: "date"
                },

                {
                    title: "실외 온도",
                    fieldMappings: [{
                        fromField: "value",
                        toField: "value"
                    }, {
                        fromField: "volume",
                        toField: "volume"
                    }],
                    dataProvider: chartData2,
                    categoryField: "date"
                },

                {
                    title: "third data set",
                    fieldMappings: [{
                        fromField: "value",
                        toField: "value"
                    }, {
                        fromField: "volume",
                        toField: "volume"
                    }],
                    dataProvider: chartData3,
                    categoryField: "date"
                },

                {
                    title: "fourth data set",
                    fieldMappings: [{
                        fromField: "value",
                        toField: "value"
                    }, {
                        fromField: "volume",
                        toField: "volume"
                    }],
                    dataProvider: chartData4,
                    categoryField: "date"
                }],

                panels: [{

                    showCategoryAxis: false,
                    title: "Value",
                    percentHeight: 70,

                    stockGraphs: [{
                        id: "g1",

                        valueField: "value",
                        comparable: true,
                        compareField: "value",
                        bullet: "round",
                        bulletBorderColor: "#FFFFFF",
                        bulletBorderAlpha: 1,
                        balloonText: "[[title]]:<b>[[value]]</b>",
                        compareGraphBalloonText: "[[title]]:<b>[[value]]</b>",
                        compareGraphBullet: "round",
                        compareGraphBulletBorderColor: "#FFFFFF",
                        compareGraphBulletBorderAlpha: 1
                    }],

                    stockLegend: {
                        periodValueTextComparing: "[[percents.value.close]]%",
                        periodValueTextRegular: "[[value.close]]"
                    }
                },

                {
                    title: "Volume",
                    percentHeight: 30,
                    stockGraphs: [{
                        valueField: "volume",
                        type: "column",
                        showBalloon: false,
                        fillAlphas: 1
                    }],


                    stockLegend: {
                        periodValueTextRegular: "[[value.close]]"
                    }
                }],

                chartScrollbarSettings: {
                    graph: "g1"
                },

                chartCursorSettings: {
                    valueBalloonsEnabled: true,
                    valueLineEnabled:true,
                    valueLineBalloonEnabled:true
                },

                periodSelector: {
                    position: "left",
                    periods: [{
                        period: "DD",
                        count: 10,
                        label: "10 days"
                    }, {
                        period: "MM",
                        selected: true,
                        count: 1,
                        label: "1 month"
                    }, {
                        period: "YYYY",
                        count: 1,
                        label: "1 year"
                    }, {
                        period: "YTD",
                        label: "YTD"
                    }, {
                        period: "MAX",
                        label: "MAX"
                    }]
                },

                dataSetSelector: {
                    position: "left"
                }
            });
        </script>
    </head>
    <body style="background-color:#FFFFFF">
        <div id="chartdiv" style="width:100%; height:600px;"></div>
    </body>
    
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%> 
