package com.example.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.webapp.services.PostService;

@Controller
public class HomeController {
	
	private PostService postService;
	
	public HomeController(PostService postService) {
		super();
		this.postService = postService;
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("user", "Chethan Kumar");
		return "index";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
}
