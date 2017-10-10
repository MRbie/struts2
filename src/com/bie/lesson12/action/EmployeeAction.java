package com.bie.lesson12.action;

import java.util.List;
import java.util.Map;

import com.bie.lesson12.po.Employee;
import com.bie.lesson12.service.EmployeeService;
import com.bie.lesson12.service.impl.EmployeeServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

/***
 * 1:随机生成一个id为给jsp，
 * 2:随机生成一个id给action,但访问特定方法的时候，才可以进行验证，客户端与服务器
 * 端，只要相等，允许访问特定方法，如save，然后删除服务器id；
 * 
 * 
 * @author 华硕
 *
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//service层数据
	private EmployeeService service = new EmployeeServiceImpl();
	//封装数据
	private Employee employee = new Employee();
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	//重写模型驱动的方法
	@Override
	public Employee getModel() {
		//这里对模型驱动的学习和使用，必须实现ModelDriven<Employee>接口哦
		return employee;
	}

	//员工添加的方法
	public String save(){
		try {
			//调用service的添加的方法
			service.save(employee);
			//添加成功，跳到列表页面
			//但是这种会出现重复刷新的情况，可以将转发改为重定向
			return list();
			
			//转发改为重定向的操作
			//return "successList";
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

	//列表显示
	public String list(){
		try {
			//调用service的查询的方法
			List<Employee> list = service.getALL();
			//保存到request域中
			ActionContext ac = ActionContext.getContext();
			Map<String, Object> request = ac.getContextMap();
			request.put("listEmployee", list);
			
			Object object = request.get("listEmployee");
			System.out.println(object);
			
			//跳转到list
			return "list";
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

		
	//进入修改页面
	public String viewUpdate(){
		//1:获取当前修改的记录的主键值
		int employeeId = employee.getEmployeeId();
		//2:service查询
		Employee emp = service.getById(employeeId);
		//3:数据回显，传统的方式是保存到域中然后显示出来。
		//所以首先获取到值栈，
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.pop();//移除栈顶元素
		vs.push(emp);//将员工对象保存到栈顶
	
		return "update";
	}
	
	//修改员工信息
	public String update(){
		try {
			//调用service的修改的方法，employee是对数据的封装。
			service.update(employee);
			//
			return list();
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}

	}
}
