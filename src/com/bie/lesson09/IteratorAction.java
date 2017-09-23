package com.bie.lesson09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��23�� ����9:49:32 
*
*
*/
public class IteratorAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		List<User> list = new ArrayList<User>();
		Map<Integer,User> map = new HashMap<Integer,User>();
		
		//��ʼ������
		for(int i=1; i<=10; i++){
			User user = new User(i,"tom" + i);
			list.add(user);
			
			map.put(user.getId(), user);
		}
		
		//���浽request�У���Ҫ��#��
		ActionContext.getContext().getContextMap().put("list", list);
		//����Ҫ��#�ţ����߷ŵ�ȫ�֣���Ԫ��
		//ActionContext.getContext().getValueStack().push(list);
		//ActionContext.getContext().getValueStack().set("list3", list);
		
		ActionContext.getContext().getContextMap().put("map", map);
		return SUCCESS;
	}
	
}
