package com.bie.lesson05;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��16�� ����2:17:51 
* Struts�ĺ���ҵ���������ݵ��Զ���װ�Լ�����ת��
*
*/
public class StrutsType extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//��һ�ַ�ʽ����װ��������,�����set
	private String name;
	private String password;
	private int age;
	private Date birthday;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String register(){
	
		System.out.println("�˺�:" + name);
		System.out.println("����:" + password);
		System.out.println("����:" + age);
		System.out.println("����:" + birthday);
		return SUCCESS;
	}
	
}
