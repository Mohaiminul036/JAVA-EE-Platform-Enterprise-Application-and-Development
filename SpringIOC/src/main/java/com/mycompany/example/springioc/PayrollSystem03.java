package com.mycompany.example.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.example.springioc.service.impl.EmployeeServiceImpl03;

public class PayrollSystem03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans_03.xml");
		
		EmployeeServiceImpl03 empService = context.getBean("employeeService", EmployeeServiceImpl03.class);
		System.out.println("EmployeeServiceImpl3.employeeDao: " + empService.getEmployeeDao());
	}
}
