package com.mycompany.example.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.example.springioc.service.EmployeeService;
import com.mycompany.example.springioc.service.impl.EmployeeServiceImpl05;

public class PayrollSystem11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans_11.xml");
		
		// Autowiring using the constructor.
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		System.out.println("employeeService.generateEmployeeId(): \n" + employeeService.generateEmployeeId());
		
		System.out.println();
		
		System.out.println("The auto-wired object:");
		EmployeeServiceImpl05 employeeService5 = (EmployeeServiceImpl05)employeeService;
		System.out.println("employeeService5.getEmployeeDao(): \n" + employeeService5.getEmployeeDao());
	}
}
