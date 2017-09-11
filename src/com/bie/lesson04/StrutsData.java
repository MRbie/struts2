package com.bie.lesson04;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��11�� ����10:06:41 
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
		
		//���ݱ��浽����
		//��ʽһ��ֱ���õ�servletApiִ�в���
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		ServletContext application = ServletActionContext.getServletContext();
		//����
		request.setAttribute("request_data", "request_data");
		session.setAttribute("session_data", "session_data");
		application.setAttribute("application_data", "application_data");
		
		
		return SUCCESS;
	}
}
