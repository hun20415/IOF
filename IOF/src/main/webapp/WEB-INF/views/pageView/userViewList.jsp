<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="../css/userList.css" rel="stylesheet" type="text/css">
<!--                                                                                                    -->
<!--                                File Name   : userViewList.jsp                                   -->
<!--                                Description : userList 페이지                                                                                                        -->
<!--                                Update      : 2015.05.13                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->

<!-- 본문 시작 -->
<center>
    <h1>온실구역별 장비 List</h1>
</center>



<table class="userList">
    <p align="right">
        <button onclick="window.location.href='/signUp'" >신규</button>
    </p>
    <thead>
        <tr>
            <th scope="cols">ID</th>
            <th scope="cols">이름</th>
            <th scope="cols">그룹</th>
            <th scope="cols">휴대폰</th>
            <th scope="cols">집주소</th>
            <th scope="cols">등록일</th>
            <th scope="cols">조회</th>
            <th scope="cols">수정</th>
            <th scope="cols">탈퇴</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${listUser}" var="user">
        <tr>
            <td>${user.userId}</td>
            <td>${user.userName}</td>
            <td>${user.userGroupId}</td>
            <td>${user.mobilePhone}</td>
            <td>${user.homeAddr}</td>
             <td>${user.sysDataTime}</td>
             <td><form action="userInfo">
            <input type="hidden" name="id" value="${user.userId}">
            <input type="submit" value="조회">
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
