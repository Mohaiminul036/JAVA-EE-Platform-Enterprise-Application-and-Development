package com.example.spring.HelloSpring5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.HelloSpring5.service.GreetingService;

public class App {
	private static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	public static void main(String[] args) {
		// GreetingService greetingService = context.getBean(, GreetingService.class);
		GreetingService greetingService = context.getBean("greetingService", GreetingService.class);

		System.out.println(greetingService.greetUser());
	}
}
