<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- *********************************************************************************************************/
/************************modify view 페이지 add 페이지와 동일*******************************************************/
/*************************2015-05-06 박정훈 *****************************************************************/
/*********************************************************************************************************/ -->
<div id = cropcateM>
<!-- 본문 시작 -->
<h1>cropCView</h1>

<form id="cropForm" action="cropcateModify" method="post"
	onsubmit="return check()">
	<table>
		<tr>
		
			<td style="width: 200px;">name</td>
			<c:if test="${!empty cropcate.cropcatename}">
			<td style="width: 390px"><input type="text" name="cropcatename" value="${cropcate.cropcatename}"
				style="width: 50%;" /></td>
				</c:if>
				<c:if test="${empty cropcate.cropcatename}">
            <td style="width: 390px"><input type="text" name="cropcatename"
                style="width: 50%;" /></td>
                </c:if>
		</tr>

		<tr>
			<td>html</td>
			<c:if test="${!empty cropcate.cropcatename}">
			<td><input type="text" name="cropcatehtml" value="${cropcate.cropcatehtml}" style="width: 50%;" /></td>
			</c:if>
			<c:if test="${empty cropcate.cropcatename}">
            <td><input type="text" name="cropcatehtml" style="width: 50%;" /></td>
            </c:if>
		</tr>
		
		
	</table>
	<input type="text" name="cropcateid" value="${cropcate.cropcateid}" hidden="true"/>
	<div style="text-align: center; padding-bottom: 15px;">
		<tr>
        <td colspan="2">
            <c:if test="${!empty cropcate.cropcatename}">
                <input type="submit"
                    value="<spring:message text="Edit"/>" />
            </c:if>
            <c:if test="${empty cropcate.cropcatename}">
                <input type="submit"
                    value="<spring:message text="Add"/>" />
            </c:if>
        </td>
    </tr>
	</div>
</form>
<!--  본문 끝 -->
</div>