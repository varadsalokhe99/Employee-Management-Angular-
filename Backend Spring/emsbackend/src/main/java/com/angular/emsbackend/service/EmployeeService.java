package com.angular.emsbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.emsbackend.dao.EmployeeDao;
import com.angular.emsbackend.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeedao;
	
	public Employee saveEmployee(Employee employee) {
		return employeedao.save(employee);
	}
	
	public List<Employee> getEmployees() {
		
//		List<Employee> employees = new ArrayList<>();
//		employeedao.findAll().forEach(employees::add);
//		return employees;
		
		return employeedao.findAll();
	}
	
	
	public Employee getEmployees(int employeeId) {
		return employeedao.findById(employeeId).orElseThrow();
	}
	
	public void deleteEmployee(int employeeId) {
		employeedao.deleteById(employeeId);
	}
	
	public Employee updateEmployee(Employee employee) {
		employeedao.findById(employee.getEmployeeId()).orElseThrow();
		return employeedao.save(employee);
	}
}









