package thiGK.ntu64130078.tranDoanAnh_ThiGK.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DashboardController {
	
	@GetMapping("/dashboard")
    public String Dashboard() {
        return "dashboard";
    }
	
	@GetMapping("/stats")
    public String getDashboardStats(Model model) {
        model.addAttribute("stats", "Dashboard statistics: 10 pages, 20 posts");
        return "dashboard";
    }
}
