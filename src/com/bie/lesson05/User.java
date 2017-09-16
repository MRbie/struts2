package com.bie.lesson05;

import java.util.Date;

/** 
* @author  Author:别先生 
* @date Date:2017年9月16日 下午2:40:55 
*
*
*/
public class User {

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
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public int getAge() {
		return age;
	}
	public Date getBirthday() {
		return birthday;
	}
		
}
