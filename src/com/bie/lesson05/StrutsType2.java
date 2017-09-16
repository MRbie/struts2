package com.bie.lesson05;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:别先生 
* @date Date:2017年9月16日 下午2:17:51 
* Struts的核心业务，请求数据的自动封装以及类型转换
*
*/
public class StrutsType2 extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//第二种方式，请求数据封装,对象类型一定要给get方法
	private User user = new User();
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


	public String register2(){
	
		System.out.println("账号:" + user.getName());
		System.out.println("密码:" + user.getPassword());
		System.out.println("年龄:" + user.getAge());
		System.out.println("生日:" + user.getBirthday());
		return SUCCESS;
	}
	
}
