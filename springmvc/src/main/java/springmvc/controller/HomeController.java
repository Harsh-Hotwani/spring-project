package springmvc.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
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
	public String handleForm(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		System.out.println(name);
		return "";
	}
}
