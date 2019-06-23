package gmail.tjsdnwls813.SpringBoard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Controller를 만들기 위한 어노테이션
@Controller
public class UserController {
   @RequestMapping(
		   value="user/register", method=RequestMethod.GET)
   public String login (Model model){
	   
	   return "user/register";
   }
}
