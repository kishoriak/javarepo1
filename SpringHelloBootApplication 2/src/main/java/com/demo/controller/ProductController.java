package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.Product;
import com.demo.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	//display table
	@RequestMapping("/viewProducts")
	public ModelAndView displayAllProduct() {
		List<Product> plist=productService.getAllProduct();
		return new ModelAndView("displayallProduct","plist",plist);
	}
	
	//display data in the form for updatetion
	@RequestMapping("/editproduct/{id}")
	public ModelAndView editProduct(@PathVariable("id") int pid) {
		Product p=productService.getProductById(pid);
		return new ModelAndView("editProduct","prod",p);
		
	}
	
	//update the product in the databse
	@RequestMapping("/updateProduct")
	public ModelAndView updateProduct(@RequestParam("pid") int id,@RequestParam("pname") String pname,@RequestParam("price") double price){
		Product p=new Product(id,pname,price);
		productService.updateProduct(p);
		return new ModelAndView("redirect:/viewProducts");
	} 
	
	//delete the product from the databse
	@RequestMapping("deleteproduct/{id}")
	public ModelAndView deleteProduct(@PathVariable("id") int id) {
		productService.deleteById(id);
		return new ModelAndView("redirect:/viewProducts");
		
	}
	
	//display empty form for accept new product
	@RequestMapping("/showform")
	public String acceptData() {
		 return "addProduct";
	}
	//display empty form using spring form tags for accept new product
		@RequestMapping("/showform1")
		public String acceptDataProduct(Model m) {
			 m.addAttribute("command", new Product());
			 return "addproduct1";
		}
		
	//save product in the databse
	@RequestMapping("/addProduct")
	public ModelAndView saveProduct(@RequestParam("pid") int id,@RequestParam("pname") String pname,@RequestParam("price") double price) {
		Product p=new Product(id,pname,price);
		productService.addProduct(p);
		return new ModelAndView("redirect:/viewProducts");
	}
	
	//using spring form tags
	@RequestMapping(value="/addProduct1",method=RequestMethod.POST)
	public ModelAndView saveProductData(@ModelAttribute("product") Product p) {
		//Product p=new Product(id,pname,price);
		productService.addProduct(p);
		return new ModelAndView("redirect:/viewProducts");
	}
	
	

}
