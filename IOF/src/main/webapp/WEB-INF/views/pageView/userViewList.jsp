<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="../css/" rel="stylesheet" type="text/css">
<script src="../js/newWindow.js" type="text/javascript", charset = "utf-8"></script>
<!--                                                                                                    -->
<!--                                File Name   : userViewList.jsp                                   -->
<!--                                Description : userList 페이지   새창으로 출력                                                                                              -->
<!--                                Update      : 2015.05.27(박정훈)                                           -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->

<!-- 본문 시작 -->

    <h1 style="position:absolute; top:70px ; left:700px;" > 전체 사용자 List</h1>


<table class="userList">
    <p > <!--버튼위치지정 -->
        <a href="javascript:SignUpPop()"><input type="button" class = "button" value="신규"/></a>
    </p>
    <thead style=" background: #d2f4ec;" >
        <tr>
            <th width="50px">ID</th>
            <th width="50px">이름</th>
            <th width="100px">그룹</th>
            <th width="100px">휴대폰</th>
            <th width="200px">집주소</th>
            <th width="170px">등록일</th>
            <th width="40px">조회</th>
            <th width="40px">수정</th>
            <th width="45px">탈퇴</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${listUser}" var="user">
        <tr>
            <td>${user.userId}</td>
            <td>${user.userName}</td>
            <td>${user.userGroupName}</td>
            <td>${user.mobilePhone}</td>
            <td>${user.homeAddr}</td>
             <td>${user.sysDataTime}</td>
             <td><form  name = "userInfoForm" method="post">
            <input type="hidden" name="id" value="${user.userId}">
            <input type="button" value="조회"  onclick="javascript:userInfoPop();">
            </form></td>
             <td><form action="userModify">
            <input type="hidden" name="id" value="${user.userId}">
            <input type="submit" value="Edit">
            </form></td>
            <td><button onclick="window.location.href='/userRemove/${user.userId}'" >탈퇴</a></td>
            
        </tr>
    </c:forEach>
    

    </tbody>
</table>
