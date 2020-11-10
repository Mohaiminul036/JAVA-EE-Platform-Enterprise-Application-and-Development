package com.mycompany.example.springioc.service.impl;

import com.mycompany.example.springioc.service.EmployeeService;

public class EmployeeServiceImpl26 implements EmployeeService {
	/**
	 * Constructor.
	 */
	public EmployeeServiceImpl26() {
	}
	
	// ---- method override ----

	@Override
	public Long generateEmployeeId() {
		return System.currentTimeMillis();
	}
	
	/**
	 * This method is used in spring_beans_24.xml
	 */
	public void myDestroy()  {
		System.out.println("Employee myDestroy... ");
	}
}
