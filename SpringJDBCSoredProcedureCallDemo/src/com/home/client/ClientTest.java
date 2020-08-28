package com.home.client;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Employee;
import com.home.service.EmployeeService;
import com.home.service.impl.EmployeeServiceImpl;

public class ClientTest {

	public static void main(String[] args) throws SQLException {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeService employeeService = context.getBean("employeeService", EmployeeServiceImpl.class);
		Employee employee = employeeService.fetchEmployeeNameAndSalaryById(1);
		System.out.println(employee.getEmployeeName()+"\t"+employee.getSalary());
        ((AbstractApplicationContext) context).close();
	}


}
