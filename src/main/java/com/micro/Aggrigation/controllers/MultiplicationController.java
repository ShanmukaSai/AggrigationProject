package com.micro.Aggrigation.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicationController {
	int a,b;

	@RequestMapping ("/mul/{a}/{b}")
	public String mul(@PathVariable("a")int a1,@PathVariable("b")int b1) {
		
		int c=a1*b1;
		return ""+c;
		
	}

}
