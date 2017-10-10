package com.bie.lesson12.po;

import java.util.Date;

public class Employee {

	private int employeeId;//员工编号
	private String employeeName;//员工姓名
	private Date employeeTime;//员工日期
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	public Date getEmployeeTime() {
		return employeeTime;
	}
	public void setEmployeeTime(Date employeeTime) {
		this.employeeTime = employeeTime;
	}

	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeName, Date employeeTime) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeTime = employeeTime;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeTime="
				+ employeeTime + "]";
	}
	
	
}
