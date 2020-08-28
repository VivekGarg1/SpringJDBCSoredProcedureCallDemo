package com.home.dao;

import com.home.model.Employee;

public interface EmployeeDao {
	
	public abstract Employee fetchEmployeeNameAndSalaryById(int employeeId);

}
