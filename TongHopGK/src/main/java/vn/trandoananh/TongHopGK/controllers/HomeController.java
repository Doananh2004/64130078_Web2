package vn.trandoananh.TongHopGK.controllers;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import vn.trandoananh.TongHopGK.model.SinhVien;

@Controller
public class HomeController {
	
	ArrayList<SinhVien> sinhVienList = new ArrayList<SinhVien>(Arrays.asList(
			new SinhVien("64130078", "Trần Doãn Anh", 7.5),
			new SinhVien("6413005", "Hoàng Duy An", 9.0)
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
		m.addAttribute("svs", sinhVienList);
		return "studentList";
	}
	
	@GetMapping("/addNew")
	public String AddNew() {
		return "newStudent";
	}
	
	@PostMapping("/add")
	public String login(ModelMap model, HttpServletRequest request) {
		String mssv = request.getParameter("mssv");
		String hoTen = request.getParameter("hoTen");
		double diemTB = Double.parseDouble(request.getParameter("diemTB"));
		SinhVien student = new SinhVien(mssv, hoTen, diemTB);
		sinhVienList.add(student);
		model.addAttribute("sv", sinhVienList);
		return "list";
	}
}
