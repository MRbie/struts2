package com.bie.lesson07;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/** 
* @author  Author:������ 
* @date Date:2017��9��17�� ����10:57:10 
*
* 1:������ʱ��
* 	������ʱ�򴴽�������������
	ִ�����������ĳ�ʼ������init
  2:������ʱ��
  	2.1. Actionʵ��������
	2.2:ִ��actionִ�е�һЩʱ�ڣ���������ҵ������ʼ
	2.3. ִ����������ķ���: execute
	2.4:��������ҵ��������success	
*/
public class StrutsInterceptor implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//������ʱ��ִ��
	public StrutsInterceptor() {
		System.out.println("������ʱ�򴴽�������������");
	}
	
	@Override
	public void destroy() {
		
		System.out.println("���������ٵķ���");
	}

	//������ʱ��ִ��
	@Override
	public void init() {
		System.out.println("ִ�����������ĳ�ʼ������");
	}

	//������ҵ��������(�ڷ���actionʱ��ִ�У���execute֮ǰִ�У�)
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("2:ִ��actionִ�е�һЩʱ�ڣ���������ҵ������ʼ");
		
		//������һ������������ִ��action���൱��chain.doFileter(..)
		//��ȡ����:execute�����ķ���ֵ
		String invoke = invocation.invoke();
		
		System.out.println("4:��������ҵ��������" + invoke);
		
		return invoke;
	}

}
