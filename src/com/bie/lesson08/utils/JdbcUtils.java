package com.bie.lesson08.utils;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/** 
* @author  Author:������ 
* @date Date:2017��9��17�� ����2:03:52 
*
* ��װ���õķ���
*/
public class JdbcUtils {

	//��ʼ�����ӳ�,//��ʼ��c3p0
	private static DataSource dataSource;
	static{
		//�Զ�����srcĿ¼�����c3p0�������ļ�����c3p0-config.xml��
		dataSource = new ComboPooledDataSource();
	}
	
	public static DataSource getDataSource(){
		
		return dataSource;
	}

	/**
	 * ����DbUtils���ù��������
	 * @return
	 */
	public static QueryRunner getQueryRunner(){
		//��һ��������QueryRunner���󣬴������ӳض���
		//�ڴ���QueryRunner�����ʱ������������ݶ���dataSource��
		//��ô��ʹ��QueryRunner����ķ���ʱ�򣬾Ͳ���Ҫ�������Ӷ���
		QueryRunner queryRunner = new QueryRunner(dataSource);
		
		return queryRunner;
	}
	
}
