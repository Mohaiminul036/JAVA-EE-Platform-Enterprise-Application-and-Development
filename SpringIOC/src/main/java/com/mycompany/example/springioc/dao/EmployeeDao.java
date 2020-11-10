package com.mycompany.example.springioc.dao;

import com.mycompany.example.springioc.entity.Employee;

public interface EmployeeDao {
	void insert(Employee obj);

	void select(int employeeId);

	void update(Employee obj);

	void delete(int employeeId);
}
