package ThiGK.ntu64130078.TranDoanAnh_ThiGK_1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	@GetMapping({"/", "/dashboard"})
    public String dashboard(Model model) {
        model.addAttribute("username", "Student Name");
        return "dashboard";
    }
}
