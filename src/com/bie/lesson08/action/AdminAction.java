package com.bie.lesson08.action;

import java.util.List;
import java.util.Map;

import com.bie.lesson08.po.Admin;
import com.bie.lesson08.service.AdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��17�� ����2:32:30 
*
* ��һ������װ�������ݣ�
* �ڶ���������service�ķ�����
*/
public class AdminAction extends ActionSupport{

	
	private static final long serialVersionUID = 1L;
	
	/***��һ������װ���������*************/
	private Admin admin;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	/****�ڶ���������service�ķ���***********/
	private AdminService adminService = new AdminService();
	
	
	public String login(){
		try {
			//���ص�½����Ϣ
			Admin loginInfo = adminService.login(admin);
			if(loginInfo == null){
				//��½ʧ��
				return "input";
			}
			//��½�ɹ������ݱ�����session��
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
			//���ز�ѯ������
			List<Admin> all = adminService.getAll();
			//������request��
			ActionContext.getContext().getContextMap().put("all", all);
			return "list";
		} catch (Exception e) {
			return ERROR;
		}
	}
}
