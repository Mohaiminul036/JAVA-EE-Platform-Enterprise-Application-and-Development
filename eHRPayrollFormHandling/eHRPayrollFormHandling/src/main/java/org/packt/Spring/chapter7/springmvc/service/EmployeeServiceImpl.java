package org.packt.Spring.chapter7.springmvc.service;

import java.util.List;

import org.packt.Spring.chapter7.springmvc.dao.EmployeeDao;
import org.packt.Spring.chapter7.springmvc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Transactional(readOnly = true)
	public List<Employee> listEmployee() {
		return this.employeeDao.listEmployee();
	}

	@Transactional
	public void insertEmployee(Employee employee) {
		this.employeeDao.insertEmployee(employee);
	}

	@Transactional
	public void deleteEmployee(Integer employeeId) {
		this.employeeDao.deleteEmployee(employeeId);
	}
}
