package com.mycompany.Ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/merchant")
public class MerchantController 
{
	@GetMapping	
	 public String loadHome()
	 {
		 return "merchant";
	 }
	
//	@PostMapping("/signup")
//	@ResponseBody
//	 public String signup()
//	{
//	return merchant.toString();
//	}
}
