package com.bie.lesson09;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/** 
* @author  Author:别先生 
* @date Date:2017年9月23日 上午11:18:51 
*
* struts的数据流转，如何从后台到页面
*/
public class OgnlAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		//获取值栈对象，方式一:
		HttpServletRequest request = ServletActionContext.getRequest();
		ValueStack vs = (ValueStack) request.getAttribute("struts.valueStack");
		
		//获取值栈对象，方式二:
		ActionContext ac = ActionContext.getContext();
		ValueStack vs2 = ac.getValueStack();
		
		System.out.println(vs == vs2);
		
		return SUCCESS;
	}
}
