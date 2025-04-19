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

import ThiGK.ntu64130078.TranDoanAnh_ThiGK_1.model.Post;

@Controller
@RequestMapping("/post")
public class PostController {
	private List<Post> posts = new ArrayList<>(List.of(
	        new Post(1L, "First Post", "This is the first post", 1L),
	        new Post(2L, "Second Post", "This is the second post", 2L)
	    ));

	    @GetMapping("/all")
	    public String listPosts(Model model) {
	        model.addAttribute("posts", posts);
	        return "post-list";
	    }

	    @GetMapping("/new")
	    public String newPost(Model model) {
	        model.addAttribute("post", new Post(null, "", "", null));
	        return "post-form";
	    }

	    @PostMapping("/new")
	    public String savePost(@ModelAttribute Post post) {
	        long newId = posts.stream().mapToLong(Post::getId).max().orElse(0L) + 1;
	        post.setId(newId);
	        posts.add(post);
	        return "redirect:/post/all";
	    }

	    @GetMapping("/view/{id}")
	    public String viewPost(@PathVariable Long id, Model model) {
	        Post post = posts.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
	        model.addAttribute("post", post);
	        return "post-view";
	    }

	    @GetMapping("/delete/{id}")
	    public String deletePost(@PathVariable Long id) {
	        posts.removeIf(p -> p.getId().equals(id));
	        return "redirect:/post/all";
	    }
}
