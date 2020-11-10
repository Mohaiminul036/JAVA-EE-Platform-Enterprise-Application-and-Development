package com.mycompany.example.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.example.springioc.entity.Employee;

public class PayrollSystem07 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans_07.xml");
		
		// Bean definition inheritance.  
		Employee employeeBean = context.getBean("employeeBean", Employee.class);
		System.out.println("employeeBean: \n" + employeeBean);
	}
}
