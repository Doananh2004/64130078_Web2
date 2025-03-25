package vn.trandoananh.TongHopGK.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String HomePage() {
		return "homeView";
	}
	
	@GetMapping("/about")
	public String AboutPage() {
		return "aboutView";
	}
	
	@GetMapping("/studentList")
	public String StudentListPage() {
		return "studentListView";
	}
	
	@GetMapping("/addNew")
	public String AddNew() {
		return "addNewView";
	}
}
