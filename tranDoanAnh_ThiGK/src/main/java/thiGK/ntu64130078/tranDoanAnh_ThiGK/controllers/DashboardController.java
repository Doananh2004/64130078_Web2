package thiGK.ntu64130078.tranDoanAnh_ThiGK.controllers;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import thiGK.ntu64130078.tranDoanAnh_ThiGK.model.Page;
import thiGK.ntu64130078.tranDoanAnh_ThiGK.model.Post;

@Controller
public class DashboardController {
	
	ArrayList<Page> pageList = new ArrayList<Page>(Arrays.asList(
			new Page("1","Trang 1","p1","","")
			));
	
	ArrayList<Post> postList = new ArrayList<Post>(Arrays.asList(
			
			));
	
	@GetMapping("/")
	public String DashboardPage() {
		return "dashboard";
	}
}
