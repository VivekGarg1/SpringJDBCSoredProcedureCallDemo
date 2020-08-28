package com.home.dao.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.home.dao.EmployeeDao;
import com.home.model.Employee;

@Repository
public class EmployeeDaoImpl  implements EmployeeDao{

	@Autowired
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Employee fetchEmployeeNameAndSalaryById(int employeeId) {
		simpleJdbcCall.withProcedureName("proc_getEmployeeNameAndsalaryById");
		MapSqlParameterSource input=new MapSqlParameterSource();
		input.addValue("emp_id", employeeId);
		Map<String,Object> outData=simpleJdbcCall.execute(input);
		Employee  employee=new Employee();
		employee.setEmployeeName((String)outData.get("emp_name"));
		employee.setSalary((Double)outData.get("emp_sal"));
		return employee;
	}

}
