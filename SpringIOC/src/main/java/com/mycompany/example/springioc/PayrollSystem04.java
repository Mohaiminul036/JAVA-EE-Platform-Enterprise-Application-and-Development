package com.mycompany.example.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.example.springioc.entity.Employee;
import com.mycompany.example.springioc.service.EmployeeService;

public class PayrollSystem04 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans_04.xml");
		
		// The setter-based Dependency Injection.
		EmployeeService empService = context.getBean("employeeService", EmployeeService.class);
		System.out.println("Unique Employee Id: " + empService.generateEmployeeId());
		
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
	}
}
