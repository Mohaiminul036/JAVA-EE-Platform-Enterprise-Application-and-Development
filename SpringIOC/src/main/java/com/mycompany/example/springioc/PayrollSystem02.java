package com.mycompany.example.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.example.springioc.service.EmployeeService;

public class PayrollSystem02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans_02.xml");
		
		EmployeeService empService = context.getBean("empServiceBean", EmployeeService.class);
		System.out.println("Unique Employee Id: " + empService.generateEmployeeId());
	}
}
