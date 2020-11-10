package com.mycompany.example.springioc.service.impl;

import com.mycompany.example.springioc.dao.EmployeeDao;
import com.mycompany.example.springioc.service.EmployeeService;

public class EmployeeServiceImpl04 implements EmployeeService {
	private EmployeeDao employeeDao;

	// ---- Getter and Setter ----

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Long generateEmployeeId() {
		return System.currentTimeMillis();
	}
}
