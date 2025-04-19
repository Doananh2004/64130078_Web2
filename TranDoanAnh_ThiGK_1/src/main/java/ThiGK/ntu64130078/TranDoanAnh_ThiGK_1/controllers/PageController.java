package ThiGK.ntu64130078.TranDoanAnh_ThiGK_1.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ThiGK.ntu64130078.TranDoanAnh_ThiGK_1.model.Page;

@Controller
@RequestMapping("/page")
public class PageController {
	private List<Page> pages = new ArrayList<>(List.of(
	        new Page(1L, "Home", "home", "Welcome to the Home page", null),
	        new Page(2L, "About", "about", "About us content", null),
	        new Page(3L, "Contact", "contact", "Contact info", null)
	    ));

	    @GetMapping("/all")
	    public String listPages(Model model) {
	        model.addAttribute("pages", pages);
	        return "page-list";
	    }

	    @GetMapping("/new")
	    public String newPage(Model model) {
	        model.addAttribute("page", new Page(null, "", "", "", null));
	        return "page-form";
	    }

	    @PostMapping("/new")
	    public String savePage(@ModelAttribute Page page) {
	        long newId = pages.stream().mapToLong(Page::getId).max().orElse(0L) + 1;
	        page.setId(newId);
	        pages.add(page);
	        return "redirect:/page/all";
	    }

	    @GetMapping("/view/{id}")
	    public String viewPage(@PathVariable Long id, Model model) {
	        Page page = pages.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
	        model.addAttribute("page", page);
	        return "page-view";
	    }

	    @GetMapping("/delete/{id}")
	    public String deletePage(@PathVariable Long id) {
	        pages.removeIf(p -> p.getId().equals(id));
	        return "redirect:/page/all";
	    }
}
