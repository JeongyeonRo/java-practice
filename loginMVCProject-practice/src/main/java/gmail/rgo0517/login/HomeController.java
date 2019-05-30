package gmail.rgo0517.login;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmail.rgo0517.login.dao.BoxerDao;
import gmail.rgo0517.login.domain.Boxer;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {		
		return "home";
	}
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {		
		return "login";
	}
	@Autowired
	private BoxerDao boxerDao;
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(Locale locale, Model model, HttpSession session, Boxer boxer) {
		//login 처리 메소드를 호출
		Boxer result = boxerDao.login(boxer);
		//로그인 성공
		if(result != null) {
			//세션에 로그인 정보를 저장
			session.setAttribute("user",result);
			return "redirect:home";
		}else {
			//로그인이 되지 않은 경우
			return "redirect:login";
		}
	}
	@RequestMapping(value = "more", method = RequestMethod.GET)
	public String more(Locale locale, Model model) {		
		return "more";
	}
	
}
