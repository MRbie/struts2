package com.bie.lesson03;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:别先生 
* @date Date:2017年9月10日 下午10:22:34 
*
*
*/
public class StrutsConfig extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String login() {
		
		System.out.println("模拟的登陆的方法");
		
		return SUCCESS;
	}
	
	public String register(){
		
		System.out.println("模拟的注册的方法");
		
		return SUCCESS;
	}
	
}
