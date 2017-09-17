package com.bie.lesson08.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.bie.lesson08.po.Admin;
import com.bie.lesson08.utils.JdbcUtils;

/** 
* @author  Author:别先生 
* @date Date:2017年9月17日 下午2:13:17 
*
*
*/
public class AdminDao {

	/***
	 * 登陆的方法
	 * @param admin
	 * @return
	 */
	public Admin login(Admin admin){
		String sql = "select * from admin where adminName = ? and adminPassword = ? ";
		Admin query = null;
		try {
			//JdbcUtils.getQueryRunner().query(sql, new BeanHandler<Admin>(Admin.class),admin.getAdminName(),admin.getAdminPassword());
			//获取到数据库的链接
			QueryRunner queryRunner = JdbcUtils.getQueryRunner();
			//然后操作数据库，这里使用查询操作
			query = queryRunner.query(sql, new BeanHandler<Admin>(Admin.class),admin.getAdminName(),admin.getAdminPassword());
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		//将查询的结果返回回去
		return query;
	}
	
	
	/**
	 * 列表展示的信息
	 * @return
	 */
	public List<Admin> getAll(){
		String sql = "select * from admin ";
		//创建数据库的链接
		QueryRunner queryRunner = JdbcUtils.getQueryRunner();
		//查询操作
		List<Admin> query = null;
		try {
			query = queryRunner.query(sql, new BeanListHandler<Admin>(Admin.class));
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		//将查询的结果返回回去
		return query;
	}
	
	
	
}

