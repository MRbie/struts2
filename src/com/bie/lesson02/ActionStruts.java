package com.bie.lesson02;

import com.opensymphony.xwork2.Action;

/** 
* @author  Author:别先生 
* @date Date:2017年9月10日 下午10:07:13 
*
*
*/
public class ActionStruts implements Action{

	@Override
	public String execute() throws Exception {
		
		System.out.println("实现了Action的接口");
		//return "success";
		return SUCCESS;
	}

	
}
