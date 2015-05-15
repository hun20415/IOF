<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--                                                                                                    -->
<!--                                File Name   : histWaterViewList.jsp                                  -->
<!--                                Description : histWater 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.07                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<br>
<h3>crop List</h3>
<c:if test="${!empty listHistWater}">
    <table class="tg">
    <tr>
        <th width="80">histWater ID</th>
        <th width="120">histWater Name</th>
        <th width="120">histWater html</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
     <!-- 리스트 객체를 받아서 출력(for문으로 출력) c:forEach 이러한 문법은 JSTL 문ㅂ-->
    <c:forEach items="${listHistWater}" var="histWater">
        <tr>
            <td>${histWater.histWaterId}</td>
            <td>${histWater.histWaterName}</td>
            <td>${histWater.histWaterHtml}</td>
            
            <td><form action="histWaterModify">
            <input type="hidden" name="id" value="${histWater.histWaterId}">
            <input type="submit" value="Edit">
            </form></td>
            
            <td><button onclick="window.location.href='/histWaterRemove/${histWater.histWaterId}'" >Delete</a></td>
        </tr>
    </c:forEach>
    <td><button onclick="window.location.href='/histWaterAdd'" >add</a></td>
    
    </table>
</c:if>