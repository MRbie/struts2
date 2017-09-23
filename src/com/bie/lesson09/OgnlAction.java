package com.bie.lesson09;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/** 
* @author  Author:������ 
* @date Date:2017��9��23�� ����11:18:51 
*
* struts��������ת����δӺ�̨��ҳ��
*/
public class OgnlAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		//��ȡֵջ���󣬷�ʽһ:
		HttpServletRequest request = ServletActionContext.getRequest();
		ValueStack vs = (ValueStack) request.getAttribute("struts.valueStack");
		
		//��ȡֵջ���󣬷�ʽ��:
		ActionContext ac = ActionContext.getContext();
		ValueStack vs2 = ac.getValueStack();
		
		System.out.println(vs == vs2);
		
		return SUCCESS;
	}
}
