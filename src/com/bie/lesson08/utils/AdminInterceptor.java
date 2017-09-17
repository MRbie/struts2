package com.bie.lesson08.utils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/** 
* @author  Author:������ 
* @date Date:2017��9��17�� ����4:53:45 
*
*
*/
public class AdminInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/***
	 * ����ҵ������
	 */
	public String intercept(ActionInvocation invocation) throws Exception {
		//�õ���ǰִ�еķ��������жϣ�ֻ�е�ǰ����������login�ͽ�����֤
		
		//��ȡActionContext����
		ActionContext ac = invocation.getInvocationContext();
				
				
		//��ȡaction�Ĵ������
		ActionProxy proxy = invocation.getProxy();
		//��ȡ��ǰִ�еķ�����
		String method = proxy.getMethod();
		//�ж�
		if(!"login".equals(method)){
			//�Ȼ�ȡ��ǰ��½���û�
			Object object = ac.getSession().get("loginInfo");
			if(object == null){
				//��˵��û�е�½
				return "input";
			}else{
				//��ǰ�û��е�½
				return invocation.invoke();
			}
		}else{
			//��ǰ�û����ڵ�½
			return invocation.invoke();
		}
	}

}
