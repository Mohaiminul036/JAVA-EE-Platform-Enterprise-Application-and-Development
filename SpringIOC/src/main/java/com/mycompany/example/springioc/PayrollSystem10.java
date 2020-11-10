package com.mycompany.example.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.example.springioc.service.EmployeeService;
import com.mycompany.example.springioc.service.impl.EmployeeServiceImpl04;

public class PayrollSystem10 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans_10.xml");
		
		// Autowiring using the byType option
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		System.out.println("employeeService.generateEmployeeId(): \n" + employeeService.generateEmployeeId());
		
		System.out.println();
		
		System.out.println("The auto-wired object:");
		EmployeeServiceImpl04 employeeService4 = (EmployeeServiceImpl04)employeeService;
		System.out.println("employeeService4.getEmployeeDao(): \n" + employeeService4.getEmployeeDao());
	}
}
