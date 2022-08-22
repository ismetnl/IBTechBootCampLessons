package com.ibtecth.compositon.entity;

public class Employee {
	
	private long employeeId;
	private String employeeName;
	private double monthSalary;
	
	
	public Employee(long employeeId, String employeeName, double monthSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.monthSalary = monthSalary;
	}
	
	
	
	public Employee() {
		super();
	}



	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}
	
	
}
