package com.bie.lesson09;
/** 
* @author  Author:别先生 
* @date Date:2017年9月23日 下午3:02:57 
*
*
*/
public class User {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public User() {
		super();
	}
	
	
}
