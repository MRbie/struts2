package com.bie.lesson03;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��10�� ����10:22:34 
*
*
*/
public class StrutsConfig extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String login() {
		
		System.out.println("ģ��ĵ�½�ķ���");
		
		return SUCCESS;
	}
	
	public String register(){
		
		System.out.println("ģ���ע��ķ���");
		
		return SUCCESS;
	}
	
}
