<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--                                                                                                    -->
<!--                                File Name   : histWaterViewList.jsp                                  -->
<!--                                Description : histWater 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.07                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<br>
<h3>histWater</h3>
<c:if test="${!empty listHistWater}">
	<table class="tg">
		<tr>
			<th width="120">histWater farmId</th>
			<th width="120">histWater seqNo</th>
			<th width="120">histWater dataInqDate</th>
			<th width="120">histWater temperatureGround</th>
			<th width="120">histWater inputAmount</th>
			<th width="120">histWater inputEc</th>
			<th width="120">histWater inputPh</th>
			<th width="120">histWater groundHumidity</th>
			<th width="120">histWater groundEc</th>
			<th width="120">histWater groundPh</th>
			<th width="120">histWater outAmount</th>
			<th width="120">histWater outEc</th>
			<th width="120">histWater outPh</th>
			<th width="120">histWater sysDate</th>
			<th width="120">edit</th>
            <th width="120">delete</th>
			<!--  <th width="60">Edit</th>
        <th width="60">Delete</th> -->
		</tr>
		<!-- 리스트 객체를 받아서 출력(for문으로 출력) c:forEach 이러한 문법은 JSTL 문ㅂ-->
		<c:forEach items="${listHistWater}" var="histWater">
			<tr>
				<td>${histWater.farmId}</td>
				<td>${histWater.seqNo}</td>
				<td>${histWater.dataInqDate}</td>
				<td>${histWater.temperatureGround}</td>
				<td>${histWater.inputAmount}</td>
				<td>${histWater.inputEc}</td>
				<td>${histWater.inputPh}</td>
				<td>${histWater.groundHumidity}</td>
				<td>${histWater.groundEc}</td>
				<td>${histWater.groundPh}</td>
				<td>${histWater.outAmount}</td>
				<td>${histWater.outEc}</td>
				<td>${histWater.outPh}</td>
				<td>${histWater.sysDate}</td>
				
				<td><form action="histWaterModify">
            <input type="hidden" name="id" value="${histWater.farmId}">
            <input type="hidden" name="id2" value="${histWater.seqNo}">
            <input type="submit" value="Edit">
            </form></td>
            <td><form action="histWaterRemove">
            <input type="hidden" name="id" value="${histWater.farmId}">
            <input type="hidden" name="id2" value="${histWater.seqNo}">
            <input type="submit" value="Delete">
            </form></td>
        </tr>
    </c:forEach>
    <td><button onclick="window.location.href='/histWaterAdd'" >add</a></td>
    
	</table>
</c:if>