package com.india1.main;

import com.services.EmployeeDetails;
import com.services.PayrollRun;

public class PayrollSystem {

	public static void main(String[] args) {
		
		EmployeeDetails employee = new EmployeeDetails();
		
		employee.setEmployeeId(1);
		employee.setEmployeeFullName("Mike Tyson");
		employee.setEmployeeEmail("t@example.com");
		employee.setEmployeeJobTitle("Boxer");
		employee.sethourlyRate(20);
		employee.sethourOfWork(180);
		
		PayrollRun pay = new PayrollRun();
		
		pay.processPayroll(employee);
		
		

	}

}
