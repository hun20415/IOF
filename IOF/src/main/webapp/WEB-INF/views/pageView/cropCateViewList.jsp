<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--                                                                                                    -->
<!--                                File Name   : cropCateViewList.jsp                                  -->
<!--                                Description : cropCate 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.07                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<br>
<h3>crop List</h3>
<c:if test="${!empty listCrop}">
    <table class="tg">
    <tr>
        <th width="80">cropCate ID</th>
        <th width="120">cropCate Name</th>
        <th width="120">cropCate html</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
     <!-- 리스트 객체를 받아서 출력(for문으로 출력) c:forEach 이러한 문법은 JSTL 문ㅂ-->
    <c:forEach items="${listCrop}" var="cropCate">
        <tr>
            <td>${cropCate.cropCateId}</td>
            <td>${cropCate.cropCateName}</td>
            <td>${cropCate.cropCateHtml}</td>
            <td><a href="<c:url value='/${cropCate.cropCateId}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${cropCate.cropCateId}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    
    </table>
</c:if>