package thiGK.ntu64130078.tranDoanAnh_ThiGK.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import thiGK.ntu64130078.tranDoanAnh_ThiGK.model.Post;

@Controller
public class PostController {
	
	private final List<Post> posts = Arrays.asList(
            new Post(1L, "Spring Boot Basics", "Content of Spring Boot Basics", 101L),
            new Post(2L, "REST API Design", "Content of REST API Design", 102L)
    );

    @GetMapping("/all")
    public List<Post> getAllPosts() {
        return posts;
    }
    
    @GetMapping("/{id}")
    public Optional<Post> getPostById(@PathVariable Long id) {
        return posts.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    @PostMapping("/add")
    public Post addPost(@RequestBody Post post) {
        posts.add(post);
        return post;
    }
}
