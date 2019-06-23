package gmail.tjsdnwls813.SpringBoard;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gmail.tjsdnwls813.SpringBoard.service.UserService;

//JSON을 리턴할 수 있는 컨트롤러
@RestController
public class JSONController {
	@Autowired
	private UserService userService;
	
    //이메일 중복검사 요청을 처리할 메소드
	@RequestMapping(
			value = "user/emailcheck",
			method = RequestMethod.GET)
	public Map<String, Object> emailcheck(
		@RequestParam("email") String email){
		//서비스 메소드 호출
		String result = userService.emailcheck(email);
		//출력할 데이터 만들기
		Map<String, Object> map = new HashMap<String, Object>();
		//중복된 이메일이 없으면 result 키에 true를 저장하고
		//중복되 이메일이면 false를 저장
		
		map.put("result", result == null);
		
		
	return map;
	}	
}
