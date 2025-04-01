package thiGK.ntu64130078.tranDoanAnh_ThiGK.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import thiGK.ntu64130078.tranDoanAnh_ThiGK.model.Page;

@Controller
public class PageController {

	private final List<Page> pages = Arrays.asList(
            new Page(1L, "Home", "home", "Welcome to Home Page", null),
            new Page(2L, "About", "about", "About Us Content", 1L)
    );

    @GetMapping("/all")
    public List<Page> getAllPages() {
        return pages;
    }
    
    @GetMapping("/{id}")
    public Optional<Page> getPageById(@PathVariable Long id) {
        return pages.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    @PostMapping("/add")
    public Page addPage(@RequestBody Page page) {
        pages.add(page);
        return page;
    }
}
