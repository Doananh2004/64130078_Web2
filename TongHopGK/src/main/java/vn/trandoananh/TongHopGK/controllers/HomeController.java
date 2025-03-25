package vn.trandoananh.TongHopGK.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String HomePage() {
		return "frontEndViews/index";
	}
	
	@GetMapping("/about")
	public String AboutPage() {
		return "frontEndViews/about";
	}
	
	@GetMapping("/studentList")
	public String StudentListPage() {
		return "frontEndViews/studentList";
	}
	
	@GetMapping("/addNew")
	public String AddNew() {
		return "frontEndViews/addNew";
	}
}
