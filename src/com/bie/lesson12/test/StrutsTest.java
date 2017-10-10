package com.bie.lesson12.test;

import java.util.List;

import org.junit.Test;

import com.bie.lesson12.dao.EmployeeDao;
import com.bie.lesson12.dao.impl.EmployeeDaoImpl;
import com.bie.lesson12.po.Employee;
import com.bie.lesson12.service.EmployeeService;
import com.bie.lesson12.service.impl.EmployeeServiceImpl;


public class StrutsTest {

	private EmployeeDao dao=new  EmployeeDaoImpl();
    private EmployeeService service=new EmployeeServiceImpl();
    
    
    
    //查询所有信息的测试
    @Test
    public void select(){
        List<Employee> list=dao.getALL();
        for(Employee e:list){
            System.out.println(e);
        }
    }
    
}
