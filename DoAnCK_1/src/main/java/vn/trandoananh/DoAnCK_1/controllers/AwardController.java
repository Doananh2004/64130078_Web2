package vn.trandoananh.DoAnCK_1.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.trandoananh.DoAnCK_1.Model.Award;
import vn.trandoananh.DoAnCK_1.Repository.AwardRepository;

@Controller
@RequestMapping("/giaithuong")
public class AwardController {
	@Autowired
    private AwardRepository awardRepository;

    // Hiển thị form chỉnh sửa
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") String id, Model model) {
        Optional<Award> award = awardRepository.findById(id);
        if (award.isPresent()) {
            model.addAttribute("award", award.get());
            return "editGT"; // file HTML: editGT.html
        }
        return "redirect:/giaithuong";
    }
    
    @GetMapping("/them")
    public String showAddForm(Model model) {
        model.addAttribute("award", new Award());
        return "addGT";
    }


    // Xử lý form submit
    @PostMapping("/edit")
    public String saveEditedAward(@ModelAttribute("award") Award award) {
        awardRepository.save(award);
        return "redirect:/giaithuong"; // quay về trang danh sách
    }
    
    @GetMapping("/")
    public String getGiaiThuongAll() {
    	return "giaithuong";
    }
}
