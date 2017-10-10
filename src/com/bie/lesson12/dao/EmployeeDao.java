package com.bie.lesson12.dao;

import java.util.List;

import com.bie.lesson12.po.Employee;

public interface EmployeeDao {

	//��ѯ���е�Ա����Ϣ
	List<Employee> getALL();
	
	//����Ա����Ž��в�ѯ����
	Employee getById(int employeeId);
	
	//���Ա����Ϣ
	void save(Employee employee);
	
	//�޸�Ա����Ϣ
	void update(Employee employee);
}
