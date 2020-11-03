package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.ProductData;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductMVCController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/product")
	public ModelAndView getAllProduct() {
		ProductData p=productService.findAllProduct();
		return new ModelAndView("displayProduct","plist",p.getPlist());
		
	}

}
