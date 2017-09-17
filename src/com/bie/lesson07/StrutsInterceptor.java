package com.bie.lesson07;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/** 
* @author  Author:别先生 
* @date Date:2017年9月17日 上午10:57:10 
*
* 1:启动的时候
* 	启动的时候创建了拦截器对象
	执行了拦截器的初始化方法init
  2:创建的时候
  	2.1. Action实例创建了
	2.2:执行action执行的一些时期，拦截器，业务处理，开始
	2.3. 执行了请求处理的方法: execute
	2.4:拦截器，业务处理，结束success	
*/
public class StrutsInterceptor implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//启动的时候执行
	public StrutsInterceptor() {
		System.out.println("启动的时候创建了拦截器对象");
	}
	
	@Override
	public void destroy() {
		
		System.out.println("拦截器销毁的方法");
	}

	//启动的时候执行
	@Override
	public void init() {
		System.out.println("执行了拦截器的初始化方法");
	}

	//拦截器业务处理方法，(在访问action时候执行？在execute之前执行？)
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("2:执行action执行的一些时期，拦截器，业务处理，开始");
		
		//调用下一个拦截器或者执行action，相当于chain.doFileter(..)
		//获取的是:execute方法的返回值
		String invoke = invocation.invoke();
		
		System.out.println("4:拦截器，业务处理，结束" + invoke);
		
		return invoke;
	}

}
