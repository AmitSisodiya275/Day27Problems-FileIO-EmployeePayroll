package com.bridgelab.day27problem.fileio;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.bridgelab.day23problems.fileio.EmployeePayroll;
import com.bridgelab.day23problems.fileio.EmployeePayrollService;
import com.bridgelab.day23problems.fileio.EmployeePayrollService.IOService;

public class EmployeePayrollServiceTest {

	@Test
	public void given3EmployeeDetailsWhenWrittenToTheFileShouldMatchTheEntries() {
		EmployeePayroll[] arrayOfEmpData = { new EmployeePayroll(1, "Amit", 20000),
				new EmployeePayroll(2, "Sunanda", 30000), new EmployeePayroll(3, "Gayatri", 40000) };

		EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmpData));
		employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);
		employeePayrollService.printData(IOService.FILE_IO);
		long entries = employeePayrollService.countEntries(IOService.FILE_IO);
		assertEquals(3, entries);
	}
}
