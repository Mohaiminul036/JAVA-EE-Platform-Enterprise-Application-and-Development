package com.mycompany.example.springioc.service.impl;

import org.springframework.stereotype.Service;

import com.mycompany.example.springioc.service.GreetingService;

@Service("greetingService")
public class GreetingServiceImpl implements GreetingService {

	public String greet(String name) {
		if (name==null || "".equals(name)) {
			return "Hello there!";
		} else {
			return String.format("Hello %s!", name);
		}
	}

}
