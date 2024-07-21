package com.angular.emsbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.angular.emsbackend.entity.Employee;
import com.angular.emsbackend.service.EmployeeService;


@RestController
@CrossOrigin("http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@PostMapping("/save/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeservice.saveEmployee(employee);
	}
	
	@GetMapping("/get/employee")
	public List<Employee> getEmployees() {
		return employeeservice.getEmployees();
	}
	
	
	@GetMapping("/get/employee/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		return employeeservice.getEmployees(employeeId); 
	}
	
	@DeleteMapping("/delete/employee/{employeeId}")
	public void deleteEmployee(@PathVariable int employeeId) {
		 employeeservice.deleteEmployee(employeeId);
	}
	
	@PutMapping("/update/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		return employeeservice.updateEmployee(employee);
	}
	
	
	
}








