package com.nm.springbootstarter.hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping("/hello")
	public String sayHello()
	{
		System.out.println("Request has arrived");
		return "hello";
	}

}
