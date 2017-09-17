package com.bie.lesson08.utils;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/** 
* @author  Author:别先生 
* @date Date:2017年9月17日 下午2:03:52 
*
* 封装常用的方法
*/
public class JdbcUtils {

	//初始化连接池,//初始化c3p0
	private static DataSource dataSource;
	static{
		//自动加载src目录下面的c3p0的配置文件，【c3p0-config.xml】
		dataSource = new ComboPooledDataSource();
	}
	
	public static DataSource getDataSource(){
		
		return dataSource;
	}

	/**
	 * 创建DbUtils常用工具类对象
	 * @return
	 */
	public static QueryRunner getQueryRunner(){
		//第一步：创建QueryRunner对象，传入连接池对象
		//在创建QueryRunner对象的时候，如果传入数据对象dataSource，
		//那么在使用QueryRunner对象的方法时候，就不需要传入连接对象
		QueryRunner queryRunner = new QueryRunner(dataSource);
		
		return queryRunner;
	}
	
}
