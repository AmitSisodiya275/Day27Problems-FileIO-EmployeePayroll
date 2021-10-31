package com.bridgelab.day23problems.fileio;

public class EmployeePayroll {

	int id;
	String name;
	double salary;
	
	public EmployeePayroll(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "Id : "+id+ ", Name : "+name+", Salary : "+salary;
	}
}
