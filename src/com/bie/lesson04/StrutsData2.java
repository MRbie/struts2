package com.bie.lesson04;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��11�� ����10:06:41 
*
*
*/
public class StrutsData2 extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		//���ݱ��浽����
		//��ʽ����ͨ��ActionContext��
		ActionContext ac = ActionContext.getContext();
		//�õ�Struts��httpServletRequest��������˷�װ����װΪ��һ��map
		//�õ���ʾrequest�����map
		Map<String, Object> request = ac.getContextMap();
		//�õ���ʾsession�����map
		Map<String, Object> session = ac.getSession();
		//�õ���ʾservletContext�����map
		Map<String, Object> application = ac.getApplication();
		
		//��������
		request.put("request_data", "request_data");
		session.put("session_data", "session_data");
		application.put("application_data", "application_data");
		
		return SUCCESS;
	}
}
