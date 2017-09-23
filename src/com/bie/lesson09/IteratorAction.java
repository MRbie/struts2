package com.bie.lesson09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:别先生 
* @date Date:2017年9月23日 下午9:49:32 
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
		
		//初始化数据
		for(int i=1; i<=10; i++){
			User user = new User(i,"tom" + i);
			list.add(user);
			
			map.put(user.getId(), user);
		}
		
		//保存到request中，需要加#号
		ActionContext.getContext().getContextMap().put("list", list);
		//不需要加#号，或者放到全局，根元素
		//ActionContext.getContext().getValueStack().push(list);
		//ActionContext.getContext().getValueStack().set("list3", list);
		
		ActionContext.getContext().getContextMap().put("map", map);
		return SUCCESS;
	}
	
}
