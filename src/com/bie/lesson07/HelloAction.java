package com.bie.lesson07;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��17�� ����11:06:31 
*
*
*/
public class HelloAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HelloAction() {
		System.out.println("1. Actionʵ��������");
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("3. ִ����������ķ���: execute");
		return "success";
	}
}

