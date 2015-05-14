<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!--                                                                                                    -->
<!--                                File Name   : buyerInfoViewAdd.jsp                                   -->
<!--                                Description : buyerInfo 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.07                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<div id=buyerInfoC>
    <!-- 본문 시작 -->
    <h1>cropCView</h1>

    <form id="cropForm" action="buyerInfoAdd" method="post"
        onsubmit="return check()">
        <table>
            <tr>

                <td style="width: 200px;">name</td>
                <!-- 세션이 있을때 입력값을 넣어준다.(수정에서 사용) -->
                <c:if test="${!empty buyerInfo.buyerInfoName}">
                    <td style="width: 390px"><input type="text"
                        name="buyerInfoName" value="${buyerInfo.buyerInfoName}"
                        style="width: 50%;" /></td>
                </c:if>
                <!-- 각 input 값의 name은 java 에서 선언한 entity와 이름이 같아야 한다. -->
                <c:if test="${empty buyerInfo.buyerInfoName}">
                    <td style="width: 390px"><input type="text"
                        name="buyerInfoName" style="width: 50%;" /></td>
                </c:if>
            </tr>

            <tr>
                <td>HTML</td>
                <c:if test="${!empty buyerInfo.buyerInfoName}">
                    <td><input type="text" name="buyerInfoHtml"
                        value="${buyerInfo.buyerInfoHtml}" style="width: 50%;" /></td>
                </c:if>
                <c:if test="${empty buyerInfo.buyerInfoName}">
                    <td><input type="text" name="buyerInfoHtml" style="width: 50%;" /></td>
                </c:if>
            </tr>


        </table>

        <div style="text-align: center; padding-bottom: 15px;">
            <tr>
                <td colspan="2"><c:if test="${!empty buyerInfo.buyerInfoName}">
                        <input type="submit" value="<spring:message text="Edit"/>" />
                    </c:if> <c:if test="${empty buyerInfo.buyerInfoName}">
                        <input type="submit" value="<spring:message text="Add"/>" />
                    </c:if></td>
            </tr>
        </div>
    </form>
    <!--  본문 끝 -->
</div>