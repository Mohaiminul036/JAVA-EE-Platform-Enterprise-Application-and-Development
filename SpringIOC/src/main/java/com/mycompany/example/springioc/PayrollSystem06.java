package com.mycompany.example.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.example.springioc.entity.Employee;

public class PayrollSystem06 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans_06.xml");
		
		// Injecting null and empty string values in Spring.    
		Employee employee1 = context.getBean("employee1", Employee.class);
		System.out.println("This should be empty string:");
		System.out.println("employee1.employeeName = " + employee1.getEmployeeName());  //empty string.
		
		System.out.println();
		
		Employee employee2 = context.getBean("employee2", Employee.class);
		System.out.println("This should be null:");
		System.out.println("employee2.employeeName = " + employee2.getEmployeeName());  //null.
	}
}
