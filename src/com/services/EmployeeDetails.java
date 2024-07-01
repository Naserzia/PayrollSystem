package com.services;

public class EmployeeDetails implements Employee
{
	
	private int employeeId;
	private String employeeFullName;
	private String employeeEmail;
	private String employeeJobTitle;
	private double hourlyRate;
	private int hourOfWork;
	

	@Override
	public int getEmployeeId() {
		return employeeId;
	}

	@Override
	public void setEmployeeId(int employeeID) {
		this.employeeId = employeeID;
		
	}

	@Override
	public String getEmployeeFullName() {
		
		return employeeFullName;
	}

	@Override
	public void setEmployeeFullName(String employeeFullName) {
		this.employeeFullName = employeeFullName;
		
	}

	@Override
	public String getEmployeeEmail() {
		return employeeEmail;
	}

	@Override
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
		
	}

	@Override
	public String getEmployeeJobTitle() {
		return employeeJobTitle;
	}

	@Override
	public void setEmployeeJobTitle(String employeeJobTitle) {
		this.employeeJobTitle = employeeJobTitle;
		
	}

	@Override
	public double gethourlyRate() {
		return hourlyRate;
	}

	@Override
	public void sethourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public int gethourOfWork() {
		return hourOfWork;
	}

	@Override
	public void sethourOfWork(int hourOfWork) {
		this.hourOfWork = hourOfWork;
		
	}

}
