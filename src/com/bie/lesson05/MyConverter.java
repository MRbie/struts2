package com.bie.lesson05;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

/** 
* @author  Author:别先生 
* @date Date:2017年9月16日 下午3:09:03 
*
* 自定义类型局部转换器
*/
public class MyConverter extends StrutsTypeConverter{

	//新需求：要求项目中要支持的格式，如：yyyy-MM-dd/yyyyMMdd/yyyy年MM月dd日
	//先定义项目中支持的转换的格式
	DateFormat[] df = {
		new SimpleDateFormat("yyyy-MM-dd"),
		new SimpleDateFormat("yyyyMMdd"),
		new SimpleDateFormat("yyyy年MM月dd日")
	};
	
	 /***
	 * 把String转换为指定的类型【String to Date】
	 * @param context 当前上下文环境
	 * @param values  jsp表单提交的字符串的值
	 * @param toClass 要转换为目标类型
	 */
	/*
	@Override
	public Object convertFromString(Map cntext, String[] value, Class toClass) {
		//判断传递进来的值不能为空
		if(value==null || value.length== 0){
			return null;
		}
		//判断类型必须为Date
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
		//判断传递进来的值不能为空
		if(value==null || value.length== 0){
			return null;
		}
		//判断类型必须为Date
		if(Date.class != toClass){
			return null;
		}
	
		//迭代，转换失败向下一个格式转换，转换成功直接返回
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
