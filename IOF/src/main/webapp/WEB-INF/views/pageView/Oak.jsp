<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!--                                                                                                    -->
<!--                                File Name   : cropCateViewAdd.jsp                                   -->
<!--                                Description : cropCate 입력페이지                                                                                                        -->
<!--                                Update      : 2015.05.07                                            -->
<!--                                ETC         :                                                       -->
<!--                                                                                                    -->
<div id = cropcateC>
<!-- 본문 시작 -->
<h1>cropCView</h1>

<form id="cropForm" action="cropcateAdd" method="post"
	onsubmit="return check()">
	<table>
		<tr>
		
			<td style="width: 200px;">name</td><!-- 세션이 있을때 입력값을 넣어준다.(수정에서 사용) -->
			<c:if test="${!empty cropcate.cropcatename}">
			<td style="width: 390px"><input type="text" name="cropcatename" value="${cropcate.cropcatename}"
				style="width: 50%;" /></td>
				</c:if><!-- 각 input 값의 name은 java 에서 선언한 entity와 이름이 같아야 한다. -->
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