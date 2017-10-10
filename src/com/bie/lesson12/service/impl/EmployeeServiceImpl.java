package com.bie.lesson12.service.impl;

import java.util.List;

import com.bie.lesson12.dao.EmployeeDao;
import com.bie.lesson12.dao.impl.EmployeeDaoImpl;
import com.bie.lesson12.po.Employee;
import com.bie.lesson12.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao dao = new EmployeeDaoImpl();
	
	@Override
	public List<Employee> getALL() {
		
		return dao.getALL();
	}

	@Override
	public Employee getById(int employeeId) {
		if(employeeId != 0){			
			return dao.getById(employeeId);
		}
		
		return null;
	}

	@Override
	public void save(Employee employee) {
		if(employee != null){
			dao.save(employee);
		}
		
	}

	@Override
	public void update(Employee employee) {
		if(employee != null){
			dao.update(employee);
		}
		
	}

	
}
