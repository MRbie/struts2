package com.bie.lesson11;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��24�� ����3:28:25 
*
* 1:ע�⣬�����Ҫ��struts������У�鹦�ܣ�����̳�ActionSupport����ʵ����ؽӿڣ�
*/
public class CheckXmlAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//��װ��������
	private User user = new User();
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	
	
	//ҵ�񷽷�
	public String checkXmlData(){
		
		System.out.println(user);
		return SUCCESS;
	}
	
	/*//�û��б��չʾ
	public String list(){
		
		System.out.println("ģ���Ƿ���֤");
		return "list";
	}*/
	
}
