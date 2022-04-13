package com.enc.test00.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/java")
	public static void main(String[] args) {
		System.out.println("Hello SP Boot Console");
	}
	@RequestMapping("/web")
	public String reHello() {
		return "Hello SP Boot web";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public String hello() { 
		System.out.println("home controller start"); 
		return "Hello00";
	}

}
