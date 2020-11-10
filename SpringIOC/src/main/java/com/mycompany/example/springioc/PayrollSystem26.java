package com.mycompany.example.springioc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.example.springioc.service.EmployeeService;

public class PayrollSystem26 {
	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring_beans_26.xml")) {
			//Using init-method in the XML configuration.
			EmployeeService employeeServiceBean = context.getBean("employeeServiceBean", EmployeeService.class);
			System.out.println("employeeService.generateEmployeeId(): \n" + employeeServiceBean.generateEmployeeId());
		}
	}
}
