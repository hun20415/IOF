<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--                                                                                                    -->
<!--                                File Name   : cropCateViewList.jsp                                  -->
<!--                                Description : cropCate 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.07                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<br>
<center>
    <h1> Crop List</h1>
</center>

<c:if test="${!empty listCropCate}">
    <table class="tg">
    <tr>
        <th width="80">cropCate ID</th>
        <th width="120">cropCate Name</th>
        <th width="120">cropCate html</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
     <!-- 리스트 객체를 받아서 출력(for문으로 출력) c:forEach 이러한 문법은 JSTL 문ㅂ-->
    <c:forEach items="${listCropCate}" var="cropCate">
        <tr>
            <td>${cropCate.cropCateId}</td>
            <td>${cropCate.cropCateName}</td>
            <td>${cropCate.cropCateHtml}</td>
            
            <td><form action="cropCateModify">
            <input type="hidden" name="id" value="${cropCate.cropCateId}">
            <input type="submit" value="Edit">
            </form></td>
            
            <td><button onclick="window.location.href='/cropCateRemove/${cropCate.cropCateId}'" >Delete</a></td>
        </tr>
    </c:forEach>
    <td><button onclick="window.location.href='/cropCateAdd'" >add</a></td>
    
    </table>
</c:if>