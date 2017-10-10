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
		//创建QueryRunner
        //记住查询是BeanListHandler区别增删改的方法BeanHandler
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
		//根据员工的编号进行查询
		String sql ="select * from employee where employeeId = ? ";
		//问号?这个参数传到后面，切记传参数
		try {
			return BaseUtils.getQueryRunner().query(sql, new BeanHandler<Employee>(Employee.class),employeeId);
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	@Override
	public void save(Employee employee) {
		//保存员工的信息，即插入操作
		String sql = "insert into employee(employeeName,employeeTime) values(?,?)";
		
		//使用c3p0的插入操作
		try {
			BaseUtils.getQueryRunner().update(sql, employee.getEmployeeName(),employee.getEmployeeTime());
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	@Override
	public void update(Employee employee) {
		//修改操作
		String sql = "update employee set employeeName =?,employeeTime=? where employeeId =? ";
		
		try {
			BaseUtils.getQueryRunner().update(sql, employee.getEmployeeName(),employee.getEmployeeTime(),employee.getEmployeeId());
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	
}
