package com.mycompany.example.springioc.service.impl;

import org.springframework.beans.factory.DisposableBean;

import com.mycompany.example.springioc.service.EmployeeService;

public class EmployeeServiceImpl25 implements EmployeeService, DisposableBean {
	/**
	 * Constructor.
	 */
	public EmployeeServiceImpl25() {
	}
	
	@Override
	public Long generateEmployeeId() {
		return System.currentTimeMillis();
	}
	
	/**
	 * Implement the methods in DisposableBean interface.
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("Employee destroy... ");
	}

}
