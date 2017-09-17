package com.bie.lesson07;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:别先生 
* @date Date:2017年9月17日 上午11:06:31 
*
*
*/
public class HelloAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HelloAction() {
		System.out.println("1. Action实例创建了");
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("3. 执行了请求处理的方法: execute");
		return "success";
	}
}

