package com.mycompany.Ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Main_Controller 
{
	
@GetMapping("/")	
 public String loadHome()
 {
	 return "main";
 }
}
