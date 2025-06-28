package springmvc.controller;


import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.Users;
import springmvc.service.UserService;


@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
	public String hello(Model model) {
		model.addAttribute("name", "Harsh Hotwani");
		System.out.println("this is home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		return "about";
	}
	
	@RequestMapping("/register")
	public String register() {
		System.out.println("this is registration page");
		return "registration";
	}
	
	@RequestMapping(path = "/registerForm",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute Users users, Model model) {
		
		this.userService.createUser(users);
		System.out.println(users);
		return "index";
	}
}
