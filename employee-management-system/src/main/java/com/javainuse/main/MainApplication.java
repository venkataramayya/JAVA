package com.javainuse.main;

import java.util.List;

import com.javainuse.domain.Employee;
import com.javainuse.service.EmployeeService;

public class MainApplication {

	public static void main(String[] args) {

		EmployeeService empService = new EmployeeService();
		Employee emp1 = new Employee("1", "Test1", "Manager", 1000);
		Employee emp2 = new Employee("2", "Test2", "Employee", 7650);
		Employee emp3 = new Employee("3", "Test3", "Employee", 6560);
		Employee emp4 = new Employee("4", "Test4", "Employee", 8640);
		Employee emp5 = new Employee("5", "Test5", "Employee", 1990);

		empService.addNewEmployee(emp1);
		empService.addNewEmployee(emp2);
		empService.addNewEmployee(emp3);
		empService.addNewEmployee(emp4);
		empService.addNewEmployee(emp5);
		List<Employee>employees = empService.getEmployees();
		System.out.println(empService.gDepartment().getname());
		for (Employee employee : employees) {
			System.out.println(employee.getName()+":"+employee.getEmpId()+":"+employee.getDesignation()+":"+employee.getSalary());
		}

	}

}