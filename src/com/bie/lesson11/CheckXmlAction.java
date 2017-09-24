package com.bie.lesson11;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:别先生 
* @date Date:2017年9月24日 下午3:28:25 
*
* 1:注意，如果想要用struts的数据校验功能，必须继承ActionSupport或者实现相关接口；
*/
public class CheckXmlAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//封装请求数据
	private User user = new User();
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	
	
	//业务方法
	public String checkXmlData(){
		
		System.out.println(user);
		return SUCCESS;
	}
	
	/*//用户列表的展示
	public String list(){
		
		System.out.println("模拟是否验证");
		return "list";
	}*/
	
}
