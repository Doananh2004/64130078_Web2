package thiGK.ntu64130078.tranDoanAnh_ThiGK.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DashboardController {
	
	@GetMapping("/dashboard")
    public String Dashboard() {
        return "dashboard";
    }
}
