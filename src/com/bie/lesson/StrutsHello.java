package com.bie.lesson;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��10�� ����3:01:40 
*
*
*/
public class StrutsHello extends ActionSupport{

	
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		System.out.println("���ʵ���action,���ڴ�������");
		System.out.println("����service��ķ���");
		return "success";
	}
}
