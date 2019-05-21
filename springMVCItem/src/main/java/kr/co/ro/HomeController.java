package kr.co.ro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ro.domain.Item;
import kr.co.ro.service.ItemService;

@Controller
public class HomeController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		//서비스의 메소드를 호출해서 결과를 저장
		List<Item> list = itemService.allItem();
		//결과페이지에서 출력할 수 있도록 저장
		model.addAttribute("list",list);
		return "home";
	}
	
}
