package vn.trandoananh.DoAnCuoiKy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	// Trang chủ
    @GetMapping("/")
    public String homePage(Model model) {
        // Bạn có thể truyền thêm dữ liệu cho view nếu cần
        return "index";
    }

    // Xử lý form tìm kiếm
    @PostMapping("/search")
    public String searchData(@RequestParam("keyword") String keyword,
                             @RequestParam("category") String category,
                             @RequestParam("unit") String unit,
                             Model model) {
        // Xử lý logic tìm kiếm ở đây (có thể gọi service hoặc repository)
        model.addAttribute("keyword", keyword);
        model.addAttribute("category", category);
        model.addAttribute("unit", unit);
        model.addAttribute("results", null); // Gán kết quả tìm kiếm thật tại đây

        return "search-results"; // Bạn cần tạo thêm file search-results.html
    }
}
