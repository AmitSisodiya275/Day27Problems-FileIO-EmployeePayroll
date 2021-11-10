package com.bridgelab.day23problems.fileio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	Scanner scanner = new Scanner(System.in);
	List<EmployeePayroll> employeePayrollList = new ArrayList<>();

	public EmployeePayrollService() {
	}

	public EmployeePayrollService(List<EmployeePayroll> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	public static void main(String[] args) {

		EmployeePayrollService service = new EmployeePayrollService();
		service.readEmployeePayrollData();
		service.writeEmployeePayrollData(IOService.CONSOLE_IO);
	}

	public void readEmployeePayrollData() {
		System.out.println("Enter Employee ID : ");
		int id = scanner.nextInt();
		System.out.println("Enter Employee Name : ");
		String name = scanner.next();
		System.out.println("Enter Employee Salary : ");
		double salary = scanner.nextDouble();
		System.out.println("Details Added!");
		employeePayrollList.add(new EmployeePayroll(id, name, salary));
	}

	public void writeEmployeePayrollData(IOService ioService) {
		if (ioService.equals(IOService.CONSOLE_IO)) {
			System.out.println("Writing Employee Payroll Data to the console : " + employeePayrollList);
		} else if (ioService.equals(IOService.FILE_IO)) {
			new EmployeePayrollFileIOService().writeEmployeePayrollData(employeePayrollList);
		}
	}

	public void printData(IOService ioService) {
		if (ioService.equals(IOService.FILE_IO)) {
			new EmployeePayrollFileIOService().printData();
		}
	}

	public long countEntries(IOService ioService) {
		if (ioService.equals(IOService.FILE_IO)) {
			return new EmployeePayrollFileIOService().countEntries();
		}
		return 0;
	}

}
