package com.jc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jc.demo.model.User;

@Controller
public class UserController {

	@GetMapping("/register")
	public String showForm(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/register/submit")
	public String submitForm(@ModelAttribute("user") User user, Model model) {
		model.addAttribute("message", "User " + user.getName() + " email:" + user.getEmail() + " registered successfully!");
		return "result"; // This will return the result.html template
	}
	
	
}
