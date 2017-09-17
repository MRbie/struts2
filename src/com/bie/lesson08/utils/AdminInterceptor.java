package com.bie.lesson08.utils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/** 
* @author  Author:别先生 
* @date Date:2017年9月17日 下午4:53:45 
*
*
*/
public class AdminInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/***
	 * 拦截业务处理方法
	 */
	public String intercept(ActionInvocation invocation) throws Exception {
		//拿到当前执行的方法名，判断，只有当前方法名不是login就进行验证
		
		//获取ActionContext对象
		ActionContext ac = invocation.getInvocationContext();
				
				
		//获取action的代理对象
		ActionProxy proxy = invocation.getProxy();
		//获取当前执行的方法名
		String method = proxy.getMethod();
		//判断
		if(!"login".equals(method)){
			//先获取当前登陆的用户
			Object object = ac.getSession().get("loginInfo");
			if(object == null){
				//空说明没有登陆
				return "input";
			}else{
				//当前用户有登陆
				return invocation.invoke();
			}
		}else{
			//当前用户正在登陆
			return invocation.invoke();
		}
	}

}
