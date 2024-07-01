package com.services;

public interface Employee {

	int getEmployeeId();
	
	    /**
     * Set the employee associated ID
     * @param employeeID
     */	
	void setEmployeeId(int employeeID);
	
	    /**
     * Get the employee associated  Full Name
     * @return
     */
	
	String getEmployeeFullName();
	
	    /**
     * Set the employee associated Full Name
     * @param employeeFullName
     */
	void setEmployeeFullName(String employeeFullName);
	
	    /** 
     * *get employee Email Address
     * @return
     */
	String getEmployeeEmail();
	
	    /**
     * Set the employee associated Email Address
     * @param employeeEmail
     */
	void setEmployeeEmail(String employeeEmail);
	
	    /**
     * Get the employee associated Job Title
     * @return
     */
	String getEmployeeJobTitle();
	
        /**
     * Set the employee associated Job Title
     * @param employeeJobTitle
     */
	void setEmployeeJobTitle(String employeeJobTitle);
	
	    /**
     * Get the employee associated hourly rate
     * @return
     */
	double gethourlyRate();
	
        /**
     * Set the employee associated hourly rate
     * @param hourlyRate
     */
	void sethourlyRate(double hourlyRate);
	
        /**
     * Get the employee associated hours Worked
     * @return
     */
	int gethourOfWork();
	
	/**
     * Set the employee associated hours Worked
     * @param hourOfWork
     */
	void sethourOfWork(int hourOfWork);
}
