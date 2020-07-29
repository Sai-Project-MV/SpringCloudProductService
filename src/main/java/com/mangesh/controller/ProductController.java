package com.mangesh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/msg")
	public String message() {
		return "Welcome Spring Cloud Product Service";
	}

}
