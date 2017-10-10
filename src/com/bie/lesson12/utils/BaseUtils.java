package com.bie.lesson12.utils;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class BaseUtils {

	//��ʼ��c3p0
    private static DataSource dataSource=null;
    
    static{
        //�Զ�����srcĿ¼�����c3p0�������ļ�����c3p0-config.xml��
        dataSource = new ComboPooledDataSource();
    }
    
    public static QueryRunner getQueryRunner(){
        //��һ��������QueryRunner���󣬴������ӳض���
        //�ڴ���QueryRunner�����ʱ������������ݶ���dataSource��
        //��ô��ʹ��QueryRunner����ķ���ʱ�򣬾Ͳ���Ҫ�������Ӷ���
        QueryRunner query=new QueryRunner(dataSource);
        //�ڶ��������Զ�������Դ�л�ȡ����(���ùر�����)
        return query;
    }
    
    /***
     * ʵ����ɾ�ĵĹ�������
     * @param sql
     * @param arr
     * @return
     */
    public static boolean addUpdateDelete(String sql,Object[] arr){
        QueryRunner qr=getQueryRunner();
        int count;
        try {
            count = qr.update(sql, arr);
            if(count>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
