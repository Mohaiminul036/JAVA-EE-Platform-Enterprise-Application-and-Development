package com.mycompany.example.springioc.service.impl;

import com.mycompany.example.springioc.service.EmployeeService;

public class EmployeeServiceImpl24 implements EmployeeService {
	/**
	 * Constructor.
	 */
	public EmployeeServiceImpl24() {
	}
	
	// ---- method override ----

	@Override
	public Long generateEmployeeId() {
		return System.currentTimeMillis();
	}
	
	/**
	 * This method is used in spring_beans_24.xml
	 */
	public void myInit()  {
		System.out.println("Employee myInit... ");
	}
}
