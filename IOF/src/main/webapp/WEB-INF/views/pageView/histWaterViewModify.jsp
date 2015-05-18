<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- *********************************************************************************************************/
/************************복합키 add 수정안함*******************************************************/
/*************************2015-05-18 박정훈 *****************************************************************/
/*********************************************************************************************************/ -->
<div id = histWaterM>
<!-- 본문 시작 -->
<h1>cropCView</h1>

<form id="cropForm" action="histWaterModify" method="post"
    onsubmit="return check()">
    <table>
        <tr>
        
            <td style="width: 200px;">name</td>
            <c:if test="${!empty histWater.farmId}">
            <td style="width: 390px"><input type="text" name="farmId" value="${histWater.histWaterName}"
                style="width: 50%;" /></td>
                </c:if>
                <c:if test="${empty histWater.farmId}">
            <td style="width: 390px"><input type="text" name="farmId"
                style="width: 50%;" /></td>
                </c:if>
        </tr>

        <tr>
            <td>html</td>
            <c:if test="${!empty histWater.seqNo}">
            <td><input type="text" name="histWaterHtml" value="${histWater.seqNo}" style="width: 50%;" /></td>
            </c:if>
            <c:if test="${empty histWater.seqNo}">
            <td><input type="text" name="seqNo" style="width: 50%;" /></td>
            </c:if>
        </tr>
        
        
    </table>
    <input type="text" name="histWaterId" value="${histWater.histWaterId}" hidden="true"/>
    <div style="text-align: center; padding-bottom: 15px;">
        <tr>
        <td colspan="2">
            <c:if test="${!empty histWater.histWaterName}">
                <input type="submit"
                    value="<spring:message text="Edit"/>" />
            </c:if>
            <c:if test="${empty histWater.histWaterName}">
                <input type="submit"
                    value="<spring:message text="Add"/>" />
            </c:if>
        </td>
    </tr>
    </div>
</form>
<!--  본문 끝 -->
</div>