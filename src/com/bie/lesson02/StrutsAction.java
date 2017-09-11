package com.bie.lesson02;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:别先生 
* @date Date:2017年9月10日 下午10:00:49 
*
*
*/
public class StrutsAction extends ActionSupport{

	
	private static final long serialVersionUID = 1L;

	public String login(){
		
		System.out.println("继承了ActionSupport的类");
		return "success";
	}
}
