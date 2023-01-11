package com.nissan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IEmployeeDAO;
import com.nissan.model.Employee;
@Service
public class EmployeeServiceImplementation implements IEmployeeService{
	
	@Autowired 
	IEmployeeDAO employeeDAO;
	@Override
	public Iterable<Employee> listAllEmployees() {
		return employeeDAO.findAll();
	}

}
