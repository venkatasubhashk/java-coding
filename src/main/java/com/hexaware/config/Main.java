package com.hexaware.config;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.pojo.Employee;
import com.hexaware.service.EmployeeService;

public class Main {
	public static void main(String args[]) {
		EmployeeService employeeService = new EmployeeService();
		List<Employee> employeeList = employeeService.loadEmployeeData();
		System.out.println("Employees List");
		employeeList.stream().forEach(System.out::println);
		System.out.println("-------------------------------------------");
		employeeService.getEmployeeCntByDepartment(employeeList);
		System.out.println("-------------------------------------------");
		employeeService.getEmployeesInEachDep(employeeList);
	}
}
