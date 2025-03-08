package vn.trandoananh.ChaoSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChaoController {
	
	@GetMapping("/chao")
	public String xinChao(ModelMap m) {
		m.addAttribute("tb","Dữ liệu thông báo Xin chào");
		return "helloView";
	}
	
}
