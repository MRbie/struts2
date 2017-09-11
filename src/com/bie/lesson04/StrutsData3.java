package com.bie.lesson04;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��11�� ����10:06:41 
*
*
*/
public class StrutsData3 extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String ,Object> request;
	private Map<String ,Object> session;
	private Map<String ,Object> application;
	
	//struts���е�ʱ�򣬻�Ѵ���request��map����ע��
	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	
	@Override
	public String execute() throws Exception {
		
		//��������
		request.put("request_data", "request_data");
		session.put("session_data", "session_data");
		application.put("application_data", "application_data");
		
		return SUCCESS;
	}

	
}
