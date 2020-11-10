package com.mycompany.example.springioc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.example.springioc.service.EmployeeService;

/**
 * Bean's scope - Prototype.
 * 
 * @author bobyuan
 */
@Tag("junit5")
public class BeanScopePrototypeTest {

	@Test
	public void test_Prototype() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans_22.xml");
		EmployeeService serviceObj1 = context.getBean("employeeServiceBean", EmployeeService.class);
		EmployeeService serviceObj2 = context.getBean("employeeServiceBean", EmployeeService.class);
		
		Assertions.assertNotSame(serviceObj1, serviceObj2); //different 2 objects.
		Assertions.assertFalse(serviceObj1 == serviceObj2); //different 2 objects.
	}
}
