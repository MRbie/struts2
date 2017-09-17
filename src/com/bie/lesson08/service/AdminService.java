package com.bie.lesson08.service;

import java.util.List;

import com.bie.lesson08.dao.AdminDao;
import com.bie.lesson08.po.Admin;

/** 
* @author  Author:������ 
* @date Date:2017��9��17�� ����2:27:32 
*
*
*/
public class AdminService {

	private AdminDao adminDao = new AdminDao();
	
	public Admin login(Admin admin){
		try {
			//����dao���ѯ�Ľ��
			Admin login = adminDao.login(admin);
			//����ѯ�Ľ�����ػ�ȥ
			return login;
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	public List<Admin> getAll(){
		try {
			List<Admin> all = adminDao.getAll();
			return all;
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
