package com.bie.lesson05;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:别先生 
* @date Date:2017年9月16日 下午2:17:51 
* Struts的核心业务，请求数据的自动封装以及类型转换
*
*/
public class StrutsType extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//第一种方式，封装请求数据,必须给set
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
	
		System.out.println("账号:" + name);
		System.out.println("密码:" + password);
		System.out.println("年龄:" + age);
		System.out.println("生日:" + birthday);
		return SUCCESS;
	}
	
}
