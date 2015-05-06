<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- *********************************************************************************************************/
/*************************list view 페이지********************************************************************/
/*************************2015-05-06 박정훈 *****************************************************************/
/*********************************************************************************************************/ -->
<br>
<h3>crop List</h3>
<c:if test="${!empty listcrop}">
    <table class="tg">
    <tr>
        <th width="80">cropcate ID</th>
        <th width="120">cropcate Name</th>
        <th width="120">cropcate html</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
     <!-- 리스트 객체를 받아서 출력(for문으로 출력) c:forEach 이러한 문법은 JSTL 문ㅂ-->
    <c:forEach items="${listcrop}" var="cropcate">
        <tr>
            <td>${cropcate.cropcateid}</td>
            <td>${cropcate.cropcatename}</td>
            <td>${cropcate.cropcatehtml}</td>
            <td><a href="<c:url value='/${cropcate.cropcateid}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${cropcate.cropcateid}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    
    </table>
</c:if>