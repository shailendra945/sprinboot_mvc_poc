package com.infoiv.springmvcshowcase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping(value="/test")
	public String welcome(Model model) {
		model.addAttribute("user", "shailendra");
		return "welcome";
	}
	
	
	
}
