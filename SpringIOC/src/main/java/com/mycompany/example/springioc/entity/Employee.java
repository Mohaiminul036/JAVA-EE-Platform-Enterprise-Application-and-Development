package com.mycompany.example.springioc.entity;

public class Employee {
	private String employeeName;
	private int employeeAge;
	private boolean married;
	private String country;

	public Employee() {
		employeeName = null;
		employeeAge = 0;
		married = false;
		country = null;
	}
	
	public Employee(String employeeName, int employeeAge, boolean married) {
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.married = married;
	}

	@Override
	public String toString() {
		return "Employee Name: " + this.employeeName + " , Age:" + this.employeeAge + ", IsMarried: " + married;
	}

	// ---- Setter and Getter ----

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
