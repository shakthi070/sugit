package com.mycompany.Ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController
{
	@GetMapping	
	 public String loadHome()
	 {
		 return "customer";
	 }
	

	@GetMapping	("/signup")
	 public String customerSignup()
	 {
		 return "customerSignup";
	 }
}
