﻿<%
String link1 = "/userList";
String link2 = "/farmInfoList";
String link3 = "/farmEquipListList";
String link4 = "/farmCultivateInfoList";
String link5 = "/greenHouseEnviInfo";
String link6 = "/greenPara";
String link7 = "/greenSim";
%>

<ul id="menu" style="text-align: center;">
    <li>
        <a href="#">기본정보</a>
        <ul>
            <li><a href="#">▪ 시스템 환경설정</a></li>
            <li><a href="#">▪ 코드관리</a></li>
            <li><a href="<%=link1%>">▪ 사용자관리</a></li>
            <li><a href="<%=link2%>">▪ 온실 기본정보</a></li>
            <li><a href="<%=link3%>">▪ 온실 장비정보</a></li>
            
            
        </ul>
    </li><li><a href="#">생육모델관리</a>
        <ul>
            <li><a href="<%=link6%>">▪ 모델 파라메터 설정</a></li>
            <li><a href="<%=link7%>">▪ 생육 시뮬레이션</a></li>
            <li><a href="#">▪ 수확량 예측</a></li>
        </ul>
    </li><li><a href="#">생육데이터 입력</a>
    </li><li><a href="#">온실모니터링</a>
        <ul>
            <li><a href="#">▪ 재배정보 입력</a></li>
            <li><a href="#">▪ 온실 리스트 (모니터링)</a></li>
        </ul>
    </li><li><a href="#">빅데이터 분석</a>
        
    </li>
</ul>