package com.bie.lesson02;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��10�� ����10:00:49 
*
*
*/
public class StrutsAction extends ActionSupport{

	
	private static final long serialVersionUID = 1L;

	public String login(){
		
		System.out.println("�̳���ActionSupport����");
		return "success";
	}
}
