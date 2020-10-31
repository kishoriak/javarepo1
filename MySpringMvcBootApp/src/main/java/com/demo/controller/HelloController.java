package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public ModelAndView sayaHello() {
		System.out.println("In hello controller");
		String s="kishori";
		return new ModelAndView("hello","msg",s);
	}

}
