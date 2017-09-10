package com.bie.lesson;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:别先生 
* @date Date:2017年9月10日 下午3:01:40 
*
*
*/
public class StrutsHello extends ActionSupport{

	
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		System.out.println("访问到了action,正在处理请求");
		System.out.println("调用service层的方法");
		return "success";
	}
}
