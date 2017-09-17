package com.bie.lesson08.service;

import java.util.List;

import com.bie.lesson08.dao.AdminDao;
import com.bie.lesson08.po.Admin;

/** 
* @author  Author:别先生 
* @date Date:2017年9月17日 下午2:27:32 
*
*
*/
public class AdminService {

	private AdminDao adminDao = new AdminDao();
	
	public Admin login(Admin admin){
		try {
			//返回dao层查询的结果
			Admin login = adminDao.login(admin);
			//将查询的结果返回回去
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
