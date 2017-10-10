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
 * 1:�������һ��idΪ��jsp��
 * 2:�������һ��id��action,�������ض�������ʱ�򣬲ſ��Խ�����֤���ͻ����������
 * �ˣ�ֻҪ��ȣ���������ض���������save��Ȼ��ɾ��������id��
 * 
 * 
 * @author ��˶
 *
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//service������
	private EmployeeService service = new EmployeeServiceImpl();
	//��װ����
	private Employee employee = new Employee();
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	//��дģ�������ķ���
	@Override
	public Employee getModel() {
		//�����ģ��������ѧϰ��ʹ�ã�����ʵ��ModelDriven<Employee>�ӿ�Ŷ
		return employee;
	}

	//Ա����ӵķ���
	public String save(){
		try {
			//����service����ӵķ���
			service.save(employee);
			//��ӳɹ��������б�ҳ��
			//�������ֻ�����ظ�ˢ�µ���������Խ�ת����Ϊ�ض���
			return list();
			
			//ת����Ϊ�ض���Ĳ���
			//return "successList";
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

	//�б���ʾ
	public String list(){
		try {
			//����service�Ĳ�ѯ�ķ���
			List<Employee> list = service.getALL();
			//���浽request����
			ActionContext ac = ActionContext.getContext();
			Map<String, Object> request = ac.getContextMap();
			request.put("listEmployee", list);
			
			Object object = request.get("listEmployee");
			System.out.println(object);
			
			//��ת��list
			return "list";
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

		
	//�����޸�ҳ��
	public String viewUpdate(){
		//1:��ȡ��ǰ�޸ĵļ�¼������ֵ
		int employeeId = employee.getEmployeeId();
		//2:service��ѯ
		Employee emp = service.getById(employeeId);
		//3:���ݻ��ԣ���ͳ�ķ�ʽ�Ǳ��浽����Ȼ����ʾ������
		//�������Ȼ�ȡ��ֵջ��
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.pop();//�Ƴ�ջ��Ԫ��
		vs.push(emp);//��Ա�����󱣴浽ջ��
	
		return "update";
	}
	
	//�޸�Ա����Ϣ
	public String update(){
		try {
			//����service���޸ĵķ�����employee�Ƕ����ݵķ�װ��
			service.update(employee);
			//
			return list();
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}

	}
}
