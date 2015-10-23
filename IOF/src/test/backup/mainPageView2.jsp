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
    
function dataRead(){
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
dataRead();

    AmCharts.ready(function() {
        generateChartData();
        createStockChart();
    });

    var chartData2 = generateChartData2();
    var chart2 = AmCharts.makeChart("chartdiv2", {
        "type" : "serial",
        "theme" : "light",
        "legend" : {
            "useGraphSettings" : true
        },
        "categoryAxesSettings" : {
            minPeriod : "hh"
            

        },
        "dataProvider" : chartData2,
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
            "title" : "상한 온도",
            "valueField" : "visits",
            "fillAlphas" : 0
        }, {
            "valueAxis" : "v2",
            "lineColor" : "#FCD202",
            "bullet" : "square",
            "bulletBorderThickness" : 1,
            "hideBulletsCount" : 30,
            "title" : "하안 온도",
            "valueField" : "hits",
            "fillAlphas" : 0
        }, {
            "valueAxis" : "v3",
            "lineColor" : "#B0DE09",
            "bullet" : "triangleUp",
            "bulletBorderThickness" : 1,
            "hideBulletsCount" : 30,
            "title" : "실제 온도",
            "valueField" : "views",
            "fillAlphas" : 0
        } ],
        "chartScrollbar" : {},
        "chartCursor" : {
            "categoryBalloonDateFormat" : "JJ:NN, DD MMMM YYYY",
            "cursorPosition" : "mouse"
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

    //chart2.addListener("dataUpdated", zoomChart2);
    //zoomChart2();

    function zoomChart2() {
        chart2.zoomToIndexes(chart2.dataProvider.length - 20,
                chart2.dataProvider.length - 1);
    }

    function generateChartData2() {

        var chartData2 = [];

        for (var i = 0; i < sensor[4].length; i++) {
            
            var newDate2 = new Date(sensor[4][sensor[4].length - 1 - i].date);

            var visits = sensor[4][sensor[4].length - 1 - i].eqValue;
            var hits = sensor[2][sensor[4].length - 1 - i].eqValue;
            var views = sensor[3][sensor[4].length - 1 - i].eqValue;

            chartData2.push({
                date : newDate2,
                visits : visits,
                hits : hits,
                views : views
            });
        }
        return chartData2;
    }
    
    var menuClick = function(url){
    
    $.ajax({
        url: url,
        data: "",
        contentType: "application/x-www-form-urlencoded; charset=utf-8",
        dataType : "text",
        success: function(data) {
            //dataRead();
            //$('#data1').html(data);
            
            <c:forEach items="${sensor1}" var="result" end="1440">
            var json = new Object();
            json.eqId = "${result.farmEquipList.eqId}";
            json.eqValue = "${result.eqValue}";
            json.date = "${result.dataInqDate}";
            sensor[1].push(json);
            </c:forEach>
            sensorF[1] = sensor[1][0].eqValue;
            
            //alert(data2.code)
            $('#data1').html(sensorF[1]);
            /*$('#data2').html(sensorF[2]);
            $('#data3').html(sensorF[3]);
            $('#data4').html(sensorF[4]);
            $('#data5').html(sensorF[5]);
            $('#data6').html(sensorF[6]);
            $('#data7').html(sensorF[7]);
            $('#data8').html(sensorF[8]);
            $('#data9').html(sensorF[9]);
            $('#data10').html(sensorF[10]);
            $('#data11').html(sensorF[11]);
            $('#data12').html(sensorF[12]);
            $('#data13').html(sensorF[13]);
            $('#data14').html(sensorF[14]); */
            //css_tabs
        },
        error: function(request, status, error) {
            alert(error);
        }
    });
};

/* var test = setInterval(function() {
    
    dataRead(); 
    }, 5000);   */
     var test = setInterval(function() {
         
        menuClick('mainPage');
        //document.getElementById('css_tabs').reload();
        }, 5000);  
    /*  var auto_refresh = setInterval(
             function ()
             {
                $('#css_tabs').load('/mainPage');
             }, 10000); // refresh every 10000 milliseconds
              */
     
</script>
</head>
<body style="background-color: #FFFFFF">
    <!-- <div>
        <button onClick="window.location.reload()"
            style="margin-bottom: 10px;">데이터 갱신</button>
    </div> -->
    
    <%-- <c:forEach items="${sensor1}" var="result" end="1440" step="1" varStatus="status">
    <td>${status.index}</td>
    <td>${result.eqValue}</td>
    <td>${result.dataInqDate}</td>    
    <br>
    </c:forEach> --%>
<div id = "ContentView" style="width: 100%;">
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
                <div id="chartdiv" style="width: 700px; height: 500px;"></div>
            </div>

            <div class="tab2_content">
                <div id="chartdiv2" style="width: 100%; height: 500px;"></div>
            </div>
        </div>

        <!-- 메인그래프 end-->

        <div id="css_tabs" >
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
                <div class="tab1_table2" id="data1">
                    <script type="text/javascript">
                        document.write(sensorF[1]);
                    </script>

                </div>

                <div class="tab1_table2" id="data2">
                    <script type="text/javascript">
                        document.write(sensorF[2]);
                    </script>
                </div>
                <div class="tab1_table2" id="data3">
                    <script type="text/javascript">
                        document.write(sensorF[3]);
                    </script>
                </div>
                <div class="tab1_table2" id="data4">
                    <script type="text/javascript">
                        document.write(sensorF[4]);
                    </script>
                </div>
                <div class="tab1_table2" id="data9">
                    <script type="text/javascript">
                        document.write(sensorF[9]);
                    </script>
                </div>
                <div class="tab1_table2" id="data8">
                    <script type="text/javascript">
                        document.write(sensorF[8]);
                    </script>
                </div>
                <br> <br> <br>
                <div class="tab1_table">빗물감지</div>
                <div class="tab1_table">좌측 습도</div>
                <div class="tab1_table">우측 습도</div>
                <div class="tab1_table">평균 습도</div>
                <div class="tab1_table">지온</div>
                <div class="tab1_table">지습</div>
                <div style="clear: both;"></div>
                <div class="tab1_table2" id="data10">
                
                    <script type="text/javascript">
                        document.write(sensorF[10]);
                    </script>
                </div>
                <div class="tab1_table2" id="data5">
                    <script type="text/javascript">
                        document.write(sensorF[5]);
                    </script>
                </div>
                <div class="tab1_table2" id="data6">
                    <script type="text/javascript">
                        document.write(sensorF[6]);
                    </script>
                </div>
                <div class="tab1_table2" id="data7">
                    <script type="text/javascript">
                        document.write(sensorF[7]);
                    </script>
                </div>
                <div class="tab1_table2" id="data13">
                    <script type="text/javascript">
                        document.write(sensorF[13]);
                    </script>
                </div>
                <div class="tab1_table2" id="data14">
                    <script type="text/javascript">
                        document.write(sensorF[14]);
                    </script>
                </div>
                <br> <br> <br>
                <div class="tab1_table">풍 향</div>
                <div class="tab1_table">풍 속</div>
                <div style="clear: both;"></div>
                <div class="tab1_table2" id="data11">
                    <script type="text/javascript">
                        var windD = sensorF[11];

                        function windDirection() {
                            if (windD == 1) {
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
                            }
                        }
                        document.write(windDirection());
                    </script>
                </div>
                <div class="tab1_table2" id="data12">
                    <script type="text/javascript">
                        document.write(sensorF[12]);
                    </script>
                </div>

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

                <ul style="font-weight: bold; , list-style: none;">

                    <li style="list-style: none;">[09:50] 급수 완료</li>
                    <li style="list-style: none;">[07:17] 급수 시작</li>
                    <li style="list-style: none;">[05:50] 차양 커튼 60%</li>
                    <li style="list-style: none;">[12:50] 난방 가동</li>
                    <li style="list-style: none;">[10:50] 1번 측창 50% 열림</li>
                    <li style="list-style: none;">[09:50] 2번 측창 50% 열림</li>
                    <li style="list-style: none;">[07:17] 3번 측창 50% 열림</li>
                    <li style="list-style: none;">[05:50] 4번 측창 50% 열림</li>
                    <li style="list-style: none;">[09:50] 5번 측창 50% 열림</li>
                    <li style="list-style: none;">[07:17] 양액 투여</li>
                    <li style="list-style: none;">[05:50] 이산화탄소 공급 완료</li>
                    <li style="list-style: none;">[09:50] 급수 완료</li>
                    <li style="list-style: none;">[07:17] 급수 시작</li>
                    <li style="list-style: none;">[05:50] 이산화탄소 공급 시작</li>


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
                <ul style="font-weight: bold;">
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