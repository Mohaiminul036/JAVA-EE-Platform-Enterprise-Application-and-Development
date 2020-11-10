package com.mycompany.example.springioc.service.impl;

import org.springframework.beans.factory.InitializingBean;

import com.mycompany.example.springioc.service.EmployeeService;

public class EmployeeServiceImpl23 implements EmployeeService, InitializingBean {
	/**
	 * Constructor.
	 */
	public EmployeeServiceImpl23() {
	}
	
	@Override
	public Long generateEmployeeId() {
		return System.currentTimeMillis();
	}
	
	/**
	 * Implement the methods in InitializingBean interface.
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee afterPropertiesSet... ");
	}

}
