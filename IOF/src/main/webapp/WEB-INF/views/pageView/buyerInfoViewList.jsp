<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--                                                                                                    -->
<!--                                File Name   : buyerInfoViewList.jsp                                  -->
<!--                                Description : buyerInfo 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.12                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<br>
<h3>buyer List</h3>
<c:if test="${!empty listBuyerInfo}">
    <table class="tg">
    <tr>
        <th width="80">buyer Id</th>
        <th width="120">company Name</th>
        <th width="120">branch Name</th>
        <th width="120">branch Addr</th>
        <th width="120">branch Phone</th>
        <th width="120">interface Name</th>
        <th width="120">interface Phone</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    
     <!-- 리스트 객체를 받아서 출력(for문으로 출력) c:forEach 이러한 문법은 JSTL 문ㅂ-->
    <c:forEach items="${listBuyerInfo}" var="buyerInfo">
        <tr>
            <td>${buyerInfo.buyerId}</td>
            <td>${buyerInfo.companyName}</td>
            <td>${buyerInfo.branchName}</td>
            <td>${buyerInfo.branchAddr}</td>
            <td>${buyerInfo.branchPhone}</td>
            <td>${buyerInfo.interfaceName}</td>
             <td>${buyerInfo.interfacePhone}</td>
            <td><a href="<c:url value='/buyerInfoModify/${buyerInfo.buyerId}'/>" >Edit</a></td>
            <td><a href="<c:url value='/buyerInfoRemove/${buyerInfo.buyerId}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    
    </table>
</c:if>