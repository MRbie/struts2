package com.bie.lesson12.dao;

import java.util.List;

import com.bie.lesson12.po.Employee;

public interface EmployeeDao {

	//查询所有的员工信息
	List<Employee> getALL();
	
	//根据员工编号进行查询操作
	Employee getById(int employeeId);
	
	//添加员工信息
	void save(Employee employee);
	
	//修改员工信息
	void update(Employee employee);
}
