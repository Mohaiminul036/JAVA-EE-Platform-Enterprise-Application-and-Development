package org.packt.Spring.chapter7.springmvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "EMPLOYEE_INFO")
public class Employee implements Serializable, Comparable<Object> {

	/** Generated serial version UID. */
	private static final long serialVersionUID = 7877287965941237763L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "JOB_TITLE")
	private String jobTitle;

	@Column(name = "DEPARTMENT")
	private String department;

	@Column(name = "SALARY")
	private int salary;

	// ---- Getter and Setter ----

	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// ---- toString, hashCode, equals, compareTo ----

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("firstName", firstName).append("lastName", lastName)
				.append("jobTitle", jobTitle).append("department", department).append("salary", salary).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(firstName).append(lastName).append(jobTitle).append(department)
				.toHashCode();
	}

	@Override
	public boolean equals(Object pObject) {
		boolean equals = false;
		if (pObject instanceof Employee) {
			Employee bean = (Employee) pObject;
			equals = (new EqualsBuilder().append(firstName, bean.firstName).append(lastName, bean.lastName)
					.append(jobTitle, bean.jobTitle).append(department, bean.department).append(salary, bean.salary))
							.isEquals();
		}
		return equals;
	}

	@Override
	public int compareTo(Object pObject) {
		return CompareToBuilder.reflectionCompare(this, pObject);
	}
}
