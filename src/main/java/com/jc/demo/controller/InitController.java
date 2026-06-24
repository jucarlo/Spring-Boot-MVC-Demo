package com.jc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InitController {

	@GetMapping("/")
	public String index() {
		return "index"; // This will return the index.html template
	}
	
	@PostMapping("/greet")
	public String greetUser(@RequestParam String name, Model model) {
		model.addAttribute("name", name);
		return "greeting"; // This will return the greeting.html template
	}
}
