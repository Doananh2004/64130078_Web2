package vn.trandoananh.TruyenDuLieuSangView.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TruyenDuLieuController {
	
	@GetMapping("/personal")
	public String thongTinCaNhan(ModelMap m) {
		m.addAttribute("mssv", "64130078");
		m.addAttribute("ten", "Trần Doãn Anh");
		m.addAttribute("nam_sinh", "2004");
		m.addAttribute("gioi_tinh", "Nam");
		return "personalInfoView";
	}
}
