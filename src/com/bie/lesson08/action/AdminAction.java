package com.bie.lesson08.action;

import java.util.List;
import java.util.Map;

import com.bie.lesson08.po.Admin;
import com.bie.lesson08.service.AdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:别先生 
* @date Date:2017年9月17日 下午2:32:30 
*
* 第一步，封装请求数据；
* 第二步，调用service的方法；
*/
public class AdminAction extends ActionSupport{

	
	private static final long serialVersionUID = 1L;
	
	/***第一步，封装请求的数据*************/
	private Admin admin;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	/****第二步，调用service的方法***********/
	private AdminService adminService = new AdminService();
	
	
	public String login(){
		try {
			//返回登陆的信息
			Admin loginInfo = adminService.login(admin);
			if(loginInfo == null){
				//登陆失败
				return "input";
			}
			//登陆成功，数据保存在session中
			ActionContext context = ActionContext.getContext();
			Map<String, Object> session = context.getSession();
			session.put("loginInfo", loginInfo);
			return "success";
		} catch (Exception e) {
			return ERROR;
		}
	}
	
	public String list(){
		try {
			//返回查询的数据
			List<Admin> all = adminService.getAll();
			//保存在request中
			ActionContext.getContext().getContextMap().put("all", all);
			return "list";
		} catch (Exception e) {
			return ERROR;
		}
	}
}
