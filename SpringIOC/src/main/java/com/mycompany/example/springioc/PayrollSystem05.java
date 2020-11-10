package com.mycompany.example.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.example.springioc.entity.ATM;

public class PayrollSystem05 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans_05.xml");
		
		// Injecting inner beans.
		ATM atm = context.getBean("atmBean", ATM.class);
		System.out.println("ATM.printer: " + atm.getPrinter());
	}
}
