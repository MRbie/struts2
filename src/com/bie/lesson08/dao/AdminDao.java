package com.bie.lesson08.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.bie.lesson08.po.Admin;
import com.bie.lesson08.utils.JdbcUtils;

/** 
* @author  Author:������ 
* @date Date:2017��9��17�� ����2:13:17 
*
*
*/
public class AdminDao {

	/***
	 * ��½�ķ���
	 * @param admin
	 * @return
	 */
	public Admin login(Admin admin){
		String sql = "select * from admin where adminName = ? and adminPassword = ? ";
		Admin query = null;
		try {
			//JdbcUtils.getQueryRunner().query(sql, new BeanHandler<Admin>(Admin.class),admin.getAdminName(),admin.getAdminPassword());
			//��ȡ�����ݿ������
			QueryRunner queryRunner = JdbcUtils.getQueryRunner();
			//Ȼ��������ݿ⣬����ʹ�ò�ѯ����
			query = queryRunner.query(sql, new BeanHandler<Admin>(Admin.class),admin.getAdminName(),admin.getAdminPassword());
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		//����ѯ�Ľ�����ػ�ȥ
		return query;
	}
	
	
	/**
	 * �б�չʾ����Ϣ
	 * @return
	 */
	public List<Admin> getAll(){
		String sql = "select * from admin ";
		//�������ݿ������
		QueryRunner queryRunner = JdbcUtils.getQueryRunner();
		//��ѯ����
		List<Admin> query = null;
		try {
			query = queryRunner.query(sql, new BeanListHandler<Admin>(Admin.class));
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		//����ѯ�Ľ�����ػ�ȥ
		return query;
	}
	
	
	
}

