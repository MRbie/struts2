package com.bie.lesson04;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:别先生 
* @date Date:2017年9月11日 下午10:06:41 
*
*
*/
public class StrutsData extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		//数据保存到域中
		//方式一，直接拿到servletApi执行操作
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		ServletContext application = ServletActionContext.getServletContext();
		//操作
		request.setAttribute("request_data", "request_data");
		session.setAttribute("session_data", "session_data");
		application.setAttribute("application_data", "application_data");
		
		
		return SUCCESS;
	}
}
