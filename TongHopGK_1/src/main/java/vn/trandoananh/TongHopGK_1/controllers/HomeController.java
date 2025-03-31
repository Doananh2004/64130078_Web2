package vn.trandoananh.TongHopGK_1.controllers;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import vn.trandoananh.TongHopGK_1.model.SinhVien;

@Controller
public class HomeController {
	
	ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>(Arrays.asList(
			new SinhVien("64130078", "Trần Doãn Anh", 7.5)
			));
	
	@GetMapping("/")
	public String HomePage() {
		return "index";
	}
	
	@GetMapping("/about")
	public String AboutPage() {
		return "about";
	}
	
	@GetMapping("/studentList")
	public String StudentListPage(ModelMap m) {
		m.addAttribute("svs", dsSinhVien);
		return "studentList";
	}
	
	@GetMapping("/addNew")
	public String AddNewStudent() {
		return "newStudent";
	}
	
	@PostMapping("/add")
	public String login(ModelMap model, HttpServletRequest request) {
		String mssv = request.getParameter("mssv");
		String hoTen = request.getParameter("hoTen");
		double diemTB = Double.parseDouble(request.getParameter("diemTB"));
		SinhVien student = new SinhVien(mssv, hoTen, diemTB);
		dsSinhVien.add(student);
		model.addAttribute("sv", dsSinhVien);
		return "list";
	}
}
