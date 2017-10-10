package com.bie.lesson12.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.bie.lesson12.dao.EmployeeDao;
import com.bie.lesson12.po.Employee;
import com.bie.lesson12.utils.BaseUtils;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getALL() {
		//����QueryRunner
        //��ס��ѯ��BeanListHandler������ɾ�ĵķ���BeanHandler
        QueryRunner qr=BaseUtils.getQueryRunner();
        try {
            String sql="select * from employee ";
            return qr.query(sql, new BeanListHandler<Employee>(Employee.class));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public Employee getById(int employeeId) {
		//����Ա���ı�Ž��в�ѯ
		String sql ="select * from employee where employeeId = ? ";
		//�ʺ�?��������������棬�мǴ�����
		try {
			return BaseUtils.getQueryRunner().query(sql, new BeanHandler<Employee>(Employee.class),employeeId);
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	@Override
	public void save(Employee employee) {
		//����Ա������Ϣ�����������
		String sql = "insert into employee(employeeName,employeeTime) values(?,?)";
		
		//ʹ��c3p0�Ĳ������
		try {
			BaseUtils.getQueryRunner().update(sql, employee.getEmployeeName(),employee.getEmployeeTime());
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	@Override
	public void update(Employee employee) {
		//�޸Ĳ���
		String sql = "update employee set employeeName =?,employeeTime=? where employeeId =? ";
		
		try {
			BaseUtils.getQueryRunner().update(sql, employee.getEmployeeName(),employee.getEmployeeTime(),employee.getEmployeeId());
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	
}
