package com.bie.lesson05;

import java.util.Date;

/** 
* @author  Author:������ 
* @date Date:2017��9��16�� ����2:40:55 
*
*
*/
public class User {

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
