package com.bie.lesson05;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

/** 
* @author  Author:������ 
* @date Date:2017��9��16�� ����3:09:03 
*
* �Զ������;ֲ�ת����
*/
public class MyConverter extends StrutsTypeConverter{

	//������Ҫ����Ŀ��Ҫ֧�ֵĸ�ʽ���磺yyyy-MM-dd/yyyyMMdd/yyyy��MM��dd��
	//�ȶ�����Ŀ��֧�ֵ�ת���ĸ�ʽ
	DateFormat[] df = {
		new SimpleDateFormat("yyyy-MM-dd"),
		new SimpleDateFormat("yyyyMMdd"),
		new SimpleDateFormat("yyyy��MM��dd��")
	};
	
	 /***
	 * ��Stringת��Ϊָ�������͡�String to Date��
	 * @param context ��ǰ�����Ļ���
	 * @param values  jsp���ύ���ַ�����ֵ
	 * @param toClass Ҫת��ΪĿ������
	 */
	/*
	@Override
	public Object convertFromString(Map cntext, String[] value, Class toClass) {
		//�жϴ��ݽ�����ֵ����Ϊ��
		if(value==null || value.length== 0){
			return null;
		}
		//�ж����ͱ���ΪDate
		if(Date.class != toClass){
			return null;
		}
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date parse = sdf.parse(value[0]);
			return parse;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}*/
	
	

	@Override
	public String convertToString(Map arg0, Object arg1) {
		
		return null;
	}

	@Override
	public Object convertFromString(Map context, String[] value, Class toClass) {
		//�жϴ��ݽ�����ֵ����Ϊ��
		if(value==null || value.length== 0){
			return null;
		}
		//�ж����ͱ���ΪDate
		if(Date.class != toClass){
			return null;
		}
	
		//������ת��ʧ������һ����ʽת����ת���ɹ�ֱ�ӷ���
		for(int i=0; i<df.length; i++){
			try {
				return df[i].parse(value[0]);
			} catch (ParseException e) {
				continue;
			}
		}
		
		return null;
	}

	
}
