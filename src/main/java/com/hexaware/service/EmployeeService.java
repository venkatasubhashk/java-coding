package com.hexaware.service;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.hexaware.pojo.Employee;

public class EmployeeService {

	public List<Employee> loadEmployeeData() {
		Employee[] employeeArray = { new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0),

				new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),

				new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0),

				new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0),

				new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0),

				new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0),

				new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0),

				new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0) };

		List<Employee> employeesList = Arrays.asList(employeeArray);

		return employeesList;
	}

	public void getEmployeeCntByDepartment(List<Employee> empList) {
		Map<String, Long> count = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println("Count number of employees in each Department");
		count.forEach((department, cnt) -> System.out.println((department + ":" + cnt)));
	}

	public void getEmployeesInEachDep(List<Employee> empList) {
		Map<String, List<Employee>> count = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

		count.forEach((key, value) -> {
			System.out.println(key + " has employees : ");
			List<Employee> list = value;
			for (Employee e : list) {
				System.out.println(e.getName());
			}
			System.out.println("\n");
		});
	}
}
