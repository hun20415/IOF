<%
String link1 = "userList";
String link2 = "greenHouseList";
String link3 = "equipmentList";
String link4 = "farmCultivateInfoList";
String link5 = "greenHouseEnviInfo";
String link6 = "#";
String link7 = "#";
%>
<div id="content_left">
	<dl class="curved">
		<dt>기본 정보</dt>
		<dd>
			<br />
			<ul id="navlist">
				<li><a href="<%=link1%>">사용자 관리</a></li>
				<li><a href="<%=link2%>">온실 정보 관리</a></li>
				<li><a href="<%=link3%>">장비 정보 관리</a></li>
				<li><a href="<%=link4%>">재배 정보</a></li>
				<li><a href="<%=link5%>">환경 제어 정보</a></li>
				<li><a href="<%=link6%>">기상 정보</a></li>
				<li><a href="<%=link7%>">공지 사항</a></li>

			</ul>
			<p class="last">&nbsp;</p>
		</dd>
	</dl>
	<dl class="curved">
		<dt>온실 현황</dt>
		<dd>
		<br/>
			<ul id="navlist">
				<li><a href="#">온실 기본 정보</a></li>
				<li><a href="#">제어 상태</a></li>
				<li><a href="#">온실별 현황</a></li>

			</ul>
			<p class="last">&nbsp;</p>
		</dd>
	</dl>
	<!-- <dl class="curved">
		<dt>MORE INFORMATION</dt>
		<dd>
			<p>Nulla in urna eu tellus auctor convallis.</p>
			<p class="last">Morbi sodales vehicula nisi. Donec id tortor.</p>
		</dd>
	</dl> -->
</div>