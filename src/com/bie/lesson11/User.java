package com.bie.lesson11;

import java.util.Date;

/** 
* @author  Author:别先生 
* @date Date:2017年9月24日 下午3:59:21 
*
*
*/
public class User {

	private String name;
	private String password;
	private String email;
	private Date birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public User(String name, String password, String email, Date birthday) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.birthday = birthday;
	}
	public User() {
		super();
	}
	
	
}
