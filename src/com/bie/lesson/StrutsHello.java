package com.bie.lesson;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
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
		
		//�����ݱ��浽����
		ActionContext ac = ActionContext.getContext();
		//�õ�����request��map
		Map<String, Object> request = ac.getContextMap();
		//�õ�����session��map
		Map<String, Object> session = ac.getSession();
		//�õ�����application��map
		Map<String, Object> application = ac.getApplication();
		
		//����
		request.put("request_data", "request");
		session.put("session_data", "session");
		application.put("application_data", "application");
		
		
		return "success";
	}
}
