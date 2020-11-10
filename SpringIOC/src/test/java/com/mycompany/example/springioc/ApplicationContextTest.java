package com.mycompany.example.springioc;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.mycompany.example.springioc.service.GreetingService;

/**
 * Test cases for ApplicationContext.
 * 
 * @author bobyuan
 */
@Tag("junit5")
public class ApplicationContextTest {
	@Test
	@SuppressWarnings("resource")
    public void test_ClassPathXmlApplicationContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans_01.xml");
		GreetingService serviceObj = context.getBean("greetingService", GreetingService.class);
		String msg = serviceObj.greet("Bob");
		//System.out.println(msg);
		Assertions.assertEquals("Hello Bob!", msg);
	}

	@Test
	@SuppressWarnings("resource")
    public void test_FileSystemXmlApplicationContext() {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring_beans_01.xml");
		GreetingService serviceObj = context.getBean("greetingService", GreetingService.class);
		String msg = serviceObj.greet("Jude");
		//System.out.println(msg);
		Assertions.assertEquals("Hello Jude!", msg);
	}
	
	@Test
	public void test_ClassPathResource()  {
		Resource  res = new ClassPathResource("spring_beans_01.xml");
		System.out.println("----  test_ClassPathResource()  ----");
		
		System.out.println(String.format("isFile = %s", res.isFile()));
		Assertions.assertTrue(res.isFile());
		
		System.out.println(String.format("Filename = %s", res.getFilename()));
		Assertions.assertEquals("spring_beans_01.xml", res.getFilename());
		
		System.out.println(String.format("Exists = %s", res.exists()));
		Assertions.assertTrue(res.isFile());

		try {
			System.out.println(String.format("URL = %s", res.getURL()));
			//URL = file:/D:/bobyuan/scm/gitlab/20180611_huatec/my_course/2020_2/JavaEE%e5%b9%b3%e5%8f%b0%e4%bc%81%e4%b8%9a%e7%ba%a7%e5%ba%94%e7%94%a8%e5%bc%80%e5%8f%91/MyWorks/projects/chapter02/SpringIOC/target/classes/spring_beans_01.xml

			System.out.println(String.format("File = %s", res.getFile()));
			//File = D:\bobyuan\scm\gitlab\20180611_huatec\my_course\2020_2\JavaEE平台企业级应用开发\MyWorks\projects\chapter02\SpringIOC\target\classes\spring_beans_01.xml

			File f = res.getFile();
			Assertions.assertTrue(f.isFile());
			Assertions.assertTrue(f.exists());
		} catch (IOException e) {
			//e.printStackTrace();
			Assertions.fail(e.getCause().getMessage());
		}
	}
	
	@Test
	public void test_FileSystemResource()  {
		Resource  res = new FileSystemResource("src/main/resources/spring_beans_01.xml");
		System.out.println("----  test_FileSystemResource()  ----");
		
		System.out.println(String.format("isFile = %s", res.isFile()));
		Assertions.assertTrue(res.isFile());
		
		System.out.println(String.format("Filename = %s", res.getFilename()));
		Assertions.assertEquals("spring_beans_01.xml", res.getFilename());
		
		System.out.println(String.format("Exists = %s", res.exists()));
		Assertions.assertTrue(res.isFile());

		try {
			System.out.println(String.format("URL = %s", res.getURL()));
			//URL = file:/D:/bobyuan/scm/gitlab/20180611_huatec/my_course/2020_2/JavaEE平台企业级应用开发/MyWorks/projects/chapter02/SpringIOC/src/main/resources/spring_beans_01.xml

			
			System.out.println(String.format("File = %s", res.getFile()));
			//File = src\main\resources\spring_beans_01.xml

			File f = res.getFile();
			Assertions.assertTrue(f.isFile());
			Assertions.assertTrue(f.exists());
		} catch (IOException e) {
			//e.printStackTrace();
			Assertions.fail(e.getCause().getMessage());
		}
	}
}
