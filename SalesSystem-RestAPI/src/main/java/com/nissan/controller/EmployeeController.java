package com.nissan.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nissan.model.Employee;
import com.nissan.service.IEmployeeService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;
	//get all Department
	@GetMapping("employees")
	public Iterable<Employee> getAllDepartment()
	{
		return employeeService.listAllEmployees();		
	}

}
