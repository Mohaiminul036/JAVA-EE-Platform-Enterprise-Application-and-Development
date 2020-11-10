package com.mycompany.example.springioc.service.impl;

import com.mycompany.example.springioc.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	@Override
	public Long generateEmployeeId() {
		return System.currentTimeMillis();
	}
}
