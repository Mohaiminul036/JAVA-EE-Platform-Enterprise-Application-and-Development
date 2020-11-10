package com.mycompany.example.springioc.service.impl;

import com.mycompany.example.springioc.dao.EmployeeDao;

public class EmployeeServiceImpl03 {
	private EmployeeDao employeeDao;

	/**
	 * Constructor.
	 */
	public EmployeeServiceImpl03(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	// ---- Getter and Setter ----

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
}
