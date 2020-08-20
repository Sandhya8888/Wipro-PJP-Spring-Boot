package com.wipro.pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
	@RequestMapping(value="/home")
	public String Home() {
		return "Home";
	}
	@RequestMapping(value="/login")
	public String L(@RequestParam("user") String name,@RequestParam("password") String password,ModelMap model) {
		if(password.equals("Wipro@123")) {
			model.addAttribute("name",name);
			return "Welcome";
		}
		else {
			return "Failure";
		}
		
	}

}
