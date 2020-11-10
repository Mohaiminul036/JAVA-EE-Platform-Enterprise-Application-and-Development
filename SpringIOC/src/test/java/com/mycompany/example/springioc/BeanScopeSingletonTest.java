package com.mycompany.example.springioc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.example.springioc.service.EmployeeService;

/**
 * Bean's scope - Singleton.
 * 
 * @author bobyuan
 */
@Tag("junit5")
public class BeanScopeSingletonTest {

	@Test
	public void test_Singleton() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans_21.xml");
		EmployeeService serviceObj1 = context.getBean("employeeServiceBean", EmployeeService.class);
		EmployeeService serviceObj2 = context.getBean("employeeServiceBean", EmployeeService.class);
		
		Assertions.assertSame(serviceObj1, serviceObj2); //same object.
		Assertions.assertTrue(serviceObj1 == serviceObj2); //same object.
	}
}
