package com.bie.lesson05;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��16�� ����2:17:51 
* Struts�ĺ���ҵ���������ݵ��Զ���װ�Լ�����ת��
*
*/
public class StrutsType2 extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//�ڶ��ַ�ʽ���������ݷ�װ,��������һ��Ҫ��get����
	private User user = new User();
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


	public String register2(){
	
		System.out.println("�˺�:" + user.getName());
		System.out.println("����:" + user.getPassword());
		System.out.println("����:" + user.getAge());
		System.out.println("����:" + user.getBirthday());
		return SUCCESS;
	}
	
}
