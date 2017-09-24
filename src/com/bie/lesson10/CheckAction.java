package com.bie.lesson10;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:别先生 
* @date Date:2017年9月24日 下午3:28:25 
*
* 1:注意，如果想要用struts的数据校验功能，必须继承ActionSupport或者实现相关接口；
*/
public class CheckAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//封装请求数据
	private User user;
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	
	//重写数据校验的功能
	/*@Override
	public void validate() {
		//用户名非空校验
		if(user.getName() == null || "".equals(user.getName())){
			//保存错误信息
			super.addFieldError("name", "用户的账号不能为空。");
		}
		//密码非空校验
		if(user.getPassword() == null || "".equals(user.getPassword())){
			//保存错误信息
			super.addFieldError("password", "用户的密码不能为空");
		}
		//用户的邮箱校验
		if(user.getEmail() == null || "".equals(user.getEmail())){
			//保存错误信息
			super.addFieldError("email", "用户的邮箱不能为空");
		}
		//用户的生日不能为空
		if(user.getBirthday() == null || "".equals(user.getBirthday())){
			//保存错误信息
			super.addFieldError("birthday" , "用户的生日不能为空");
		}
		
	}*/
	
	
	public void validatecheckData() {
		//用户名非空校验
		if(user.getName() == null || "".equals(user.getName())){
			//保存错误信息
			super.addFieldError("name", "用户的账号不能为空。");
		}
		//密码非空校验
		if(user.getPassword() == null || "".equals(user.getPassword())){
			//保存错误信息
			super.addFieldError("password", "用户的密码不能为空");
		}
		//用户的邮箱校验
		/*if(user.getEmail() == null || "".equals(user.getEmail())){
			//保存错误信息
			super.addFieldError("email", "用户的邮箱不能为空");
		}*/
		//用户的生日不能为空
		/*if(user.getBirthday() == null || "".equals(user.getBirthday())){
			//保存错误信息
			super.addFieldError("birthday" , "用户的生日不能为空");
		}*/
		
	}

	//业务方法
	public String checkData(){
		
		System.out.println(user);
		return SUCCESS;
	}
	
	//用户列表的展示
	public String list(){
		
		System.out.println("模拟是否验证");
		return "list";
	}
	
}
