package vn.trandoananh.FormDangNhap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Trả về trang login.html
    }

    @PostMapping("/login")
    public ModelAndView login(@RequestParam("id") String id, 
                              @RequestParam("password") String password) {
        ModelAndView mav = new ModelAndView("login");
        if ("admin".equals(id) && "123456".equals(password)) {
            mav.addObject("message", "Đăng nhập thành công!");
        } else {
            mav.addObject("message", "Sai ID hoặc mật khẩu!");
        }
        return mav;
    }
}
