package com.bie.lesson;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
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
		
		//把数据保存到域中
		ActionContext ac = ActionContext.getContext();
		//得到代表request的map
		Map<String, Object> request = ac.getContextMap();
		//得到代表session的map
		Map<String, Object> session = ac.getSession();
		//得到代表application的map
		Map<String, Object> application = ac.getApplication();
		
		//保存
		request.put("request_data", "request");
		session.put("session_data", "session");
		application.put("application_data", "application");
		
		
		return "success";
	}
}
