package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("/hello1")
	public ModelAndView sayHello() {
		String msg="Welcome to spring Boot Appliaction";
		return new ModelAndView("hello","msg",msg);
		
	}

}
