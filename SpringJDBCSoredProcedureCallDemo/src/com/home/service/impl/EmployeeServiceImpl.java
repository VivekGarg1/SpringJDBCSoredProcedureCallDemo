package com.home.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.dao.EmployeeDao;
import com.home.model.Employee;
import com.home.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	

	@Override
	public Employee fetchEmployeeNameAndSalaryById(int employeeId) {
		return employeeDao.fetchEmployeeNameAndSalaryById(employeeId);
	}
	
	

}
