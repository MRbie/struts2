package com.bie.lesson04;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:别先生 
* @date Date:2017年9月11日 下午10:06:41 
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
		
		//数据保存到域中
		//方式二，通过ActionContext类
		ActionContext ac = ActionContext.getContext();
		//得到Struts对httpServletRequest对象进行了封装，封装为了一个map
		//拿到表示request对象的map
		Map<String, Object> request = ac.getContextMap();
		//拿到表示session对象的map
		Map<String, Object> session = ac.getSession();
		//拿到表示servletContext对象的map
		Map<String, Object> application = ac.getApplication();
		
		//保存数据
		request.put("request_data", "request_data");
		session.put("session_data", "session_data");
		application.put("application_data", "application_data");
		
		return SUCCESS;
	}
}
