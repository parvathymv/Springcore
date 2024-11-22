package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	@Autowired
	private Employee employee;
	

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

}
