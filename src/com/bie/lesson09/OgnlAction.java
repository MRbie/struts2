package com.bie.lesson09;


import java.util.Map;

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
	// 全局元素，根元素值
	private User user = new User(1, "tom");
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String execute() throws Exception {
		ActionContext ac = ActionContext.getContext();
		//映射数据
		//ac.getContextMap().put("request_data", "request_data");
		
		// 数据存储request
		@SuppressWarnings("unchecked")
		Map<String,Object> map = (Map<String, Object>) ac.get("request");
		map.put("request_data", "request_data");
		map.put("cn", "China");
		
		
		ac.getSession().put("session_data", "session_data");
		ac.getApplication().put("application_data", "application_data");
		
		// 二、值栈对象的存储数据的原理
		ValueStack vs = ac.getValueStack();
		
		/***************操作根元素的几种方法*****************/
		// 设置数据: 入栈
		// 栈顶
		//vs.getRoot().push(new User(2, "jack"));
		vs.push(new User(2, "jack"));
		// 移除栈顶元素
		vs.pop();
		
		
		// 如何存储？  map结构存储  
		vs.set("user1", new User(3, "张三"));
		vs.set("user2", new User(4, "李四"));
		
		
		System.out.println(vs);
		return SUCCESS;
	}
	
	
	
	// 一、获取值栈对象的2种方式
	public void valueStack(){
		//获取值栈对象，方式一:
		HttpServletRequest request = ServletActionContext.getRequest();
		ValueStack vs = (ValueStack) request.getAttribute("struts.valueStack");
		
		//获取值栈对象，方式二:
		ActionContext ac = ActionContext.getContext();
		ValueStack vs2 = ac.getValueStack();
		
		System.out.println(vs == vs2);
	}
	
}
