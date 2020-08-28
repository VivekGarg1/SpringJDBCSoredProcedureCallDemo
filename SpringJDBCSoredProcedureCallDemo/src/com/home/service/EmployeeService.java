package com.home.service;

import com.home.model.Employee;

public interface EmployeeService {

	public abstract Employee fetchEmployeeNameAndSalaryById(int employeeId);
	
}
