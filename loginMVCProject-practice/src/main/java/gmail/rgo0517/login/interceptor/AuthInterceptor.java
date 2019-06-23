package gmail.rgo0517.login.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AuthInterceptor implements HandlerInterceptor {
	//Controller가 요청을 처리하기 전에 호출되는 메소드
	//이 메소드가 true - Controller가 요청을 처리/ false - 요청을 처리하지 않음
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response,
			Object handler) {
	//로그인 정보 확인 
	//세션 user라는 이름의 객체가 null이면 ( 로그인이 되어있지 않으면)
	if(request.getSession().getAttribute("user") == null) {
		//login 페이지로 포워딩
		try {
			response.sendRedirect("login");
		}catch(Exception e) {
			System.out.println("Forwarding Exception: " + e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	return true;
	}
}
