package com.services;

public class PayrollRun implements Payroll {

	public final double TAX_RATE = 0.2;

	@Override
	public void processPayroll(Employee employee) {

		double grossPay = calculateGrossPay(employee);
		double netPay = calculateNetPay(grossPay);
		generatePayslip(employee, grossPay, netPay);
	}

	private double calculateGrossPay(Employee employee) {
		return employee.gethourlyRate() * employee.gethourOfWork();
	}

	private double calculateNetPay(double grossPay) {
		return grossPay * (1 - TAX_RATE);
	}

	private void generatePayslip(Employee employee, double grossPay, double netPay) {
		System.out.println("Payslip for " + employee.getEmployeeFullName());
		System.out.println("Job Title: " + employee.getEmployeeJobTitle());
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Net Pay: $" + netPay);

	}

}
