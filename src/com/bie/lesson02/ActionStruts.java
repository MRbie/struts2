package com.bie.lesson02;

import com.opensymphony.xwork2.Action;

/** 
* @author  Author:������ 
* @date Date:2017��9��10�� ����10:07:13 
*
*
*/
public class ActionStruts implements Action{

	@Override
	public String execute() throws Exception {
		
		System.out.println("ʵ����Action�Ľӿ�");
		//return "success";
		return SUCCESS;
	}

	
}
