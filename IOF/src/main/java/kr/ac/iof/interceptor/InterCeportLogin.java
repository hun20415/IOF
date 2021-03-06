/**                                                                             				                **/
/**                                File Name   : InterCeportLogin.java       	                		   			      **/  		
/**                                Description : 페이지 세션 처리(로그인 되 있으면 메인페이지로 들어가게)                        								**/ 
/**                                Update      : 2015.05.07(박정훈)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                             **/

package kr.ac.iof.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterCeportLogin extends HandlerInterceptorAdapter{
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
		try {
			//logininfo 세션값이 널일경우
			if(request.getSession().getAttribute("user") == null ){
					//로그인페이지로 redirect
					response.sendRedirect("/login");	
					return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//널이 아니면 정상적으로 컨트롤러 호출
		return true;
	}
}
