<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- *********************************************************************************************************/
/************************modify view 페이지 signUp 페이지와 동일*******************************************************/
/*************************2015-05-06 박정훈 *****************************************************************/
/*********************************************************************************************************/ -->
<div id = userM>
<!-- 본문 시작 -->
<h1>회원 정보 수정</h1>

<form id="signUpForm" action="userModify" method="post"
        onsubmit="return check()">
        <table>
            <tr>
                <td style="width: 200px;">아이디(ID)</td>
                <td style="width: 390px"><input type="text" name="userId" value="${user.userId}"
                    style="width: 50%;" /></td> 
            </tr>

            <tr>
                <td>비밀번호(Password)</td>              
                <td><input type="password" name="userPasswd"
                    style="width: 50%;" /></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center; font-weight: bold;">
                </td>
            </tr>
            <tr>
                <td>비밀번호 확인(Confirm)</td>
                <td><input type="password" name="confirm" style="width: 50%;" /></td>
            </tr>
            <tr>
                <td>이름(Full Name)</td>
                <td><input type="text" name="userName" style="width: 50%;" value="${user.userName}"/></td>
            </tr>
            <tr>
            <td>* 권한(authorization)</td>
				<td><select name="groupId">
						 <c:forEach items="${userGroupList}" var="userGroupP">
						 <c:if test="${userGroupP.userGroup != 1}">
						<option value="${userGroupP.userGroup}">${userGroupP.userGroupName}
						</option>
						</c:if>
						</c:forEach>				
				</select></td>
				
            <%-- 
                <td>권한(authorization)</td>
                <td><select name="userGroupId" value="${user.userGroupId}">
                        <!-- <option value="1">시스템관리자</option> -->
                        <option value="2">관리자</option>
                        <option value="3">농장주</option>

                </select></td> --%>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="email" name="email" style="width: 80%;" value="${user.email}"/></td>
            </tr>
            <tr>
                <td>휴대폰(Mobile)</td>
                <td><input type="tel" name="mobilePhone" style="width: 80%;" value="${user.mobilePhone}"/></td>
            </tr>
            <tr>
                <td>집전화(tel)</td>
                <td><input type="tel" name="phone" style="width: 80%;" value="${user.phone}"/></td>
            </tr>
            <tr>
                <td>우편번호</td>
                <td><input type="text" name="homeZipcode" style="width: 30%;" value="${user.homeZipcode}"/></td>
            </tr>
            <tr>
                <td>주소(address)</td>
                <td><input type="text" name="homeAddr" style="width: 99%;" value="${user.homeAddr}"/></td>
            </tr>
            <tr>
                <td><input type="hidden" name="sysDataTime" value=""${user.sysDataTime}"/></td>
            </tr>

        </table>
        
    <input type="text" name="userId" value="${use.userId}" hidden="true"/>
    
    <div style="text-align: center; padding-bottom: 15px;">
            <input type="submit" value="확인" />
        </div> 
    </form>
<!--  본문 끝 -->
</div>