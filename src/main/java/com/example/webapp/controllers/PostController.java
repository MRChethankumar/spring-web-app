package com.example.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.webapp.models.Post;
import com.example.webapp.services.PostService;

@Controller
public class PostController {
	
	private PostService postService;
	
	public PostController(PostService postService) {
		super();
		this.postService = postService;
	}

	@GetMapping("/posts")
	public String index(Model model) {
		model.addAttribute("posts", postService.getAllPost());
		return "posts";
	}
	
	@GetMapping("/post/{id}")
	public String getPost(@PathVariable Integer id) {
		return "home";
	}
	
	@GetMapping("/add/post")
	public String addPost(Model model) {
		Post post = new Post();
		model.addAttribute("post", post);
		return "add_post";
	}
	
	@PostMapping("/save/post")
	public String savePost(@ModelAttribute("post") Post post) {
		postService.savePost(post);
		return "redirect:/posts";
	}
	
	@GetMapping("/edit/post/{id}")
	public String editPost(@PathVariable Integer id, Model model) {
		model.addAttribute("post", postService.getPostById(id));
		return "edit_post";
	}
	
	@PostMapping("/update/post/{id}")
	public String updatePost(@PathVariable Integer id, @ModelAttribute("post") Post post) {
		Post exist_post = postService.getPostById(id);
		exist_post.setCaption(post.getCaption());
		exist_post.setContent(post.getContent());
		postService.updatePost(exist_post);
		return "redirect:/posts";
	}
	
	@GetMapping("/delete/post/{id}")
	public String deletePost(@PathVariable Integer id) {
		postService.deletePostById(id);
		return "redirect:/posts";
	}
	
	
	
	

}
