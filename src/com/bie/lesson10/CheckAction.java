package com.bie.lesson10;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��24�� ����3:28:25 
*
* 1:ע�⣬�����Ҫ��struts������У�鹦�ܣ�����̳�ActionSupport����ʵ����ؽӿڣ�
*/
public class CheckAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//��װ��������
	private User user;
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	
	//��д����У��Ĺ���
	/*@Override
	public void validate() {
		//�û����ǿ�У��
		if(user.getName() == null || "".equals(user.getName())){
			//���������Ϣ
			super.addFieldError("name", "�û����˺Ų���Ϊ�ա�");
		}
		//����ǿ�У��
		if(user.getPassword() == null || "".equals(user.getPassword())){
			//���������Ϣ
			super.addFieldError("password", "�û������벻��Ϊ��");
		}
		//�û�������У��
		if(user.getEmail() == null || "".equals(user.getEmail())){
			//���������Ϣ
			super.addFieldError("email", "�û������䲻��Ϊ��");
		}
		//�û������ղ���Ϊ��
		if(user.getBirthday() == null || "".equals(user.getBirthday())){
			//���������Ϣ
			super.addFieldError("birthday" , "�û������ղ���Ϊ��");
		}
		
	}*/
	
	
	public void validatecheckData() {
		//�û����ǿ�У��
		if(user.getName() == null || "".equals(user.getName())){
			//���������Ϣ
			super.addFieldError("name", "�û����˺Ų���Ϊ�ա�");
		}
		//����ǿ�У��
		if(user.getPassword() == null || "".equals(user.getPassword())){
			//���������Ϣ
			super.addFieldError("password", "�û������벻��Ϊ��");
		}
		//�û�������У��
		/*if(user.getEmail() == null || "".equals(user.getEmail())){
			//���������Ϣ
			super.addFieldError("email", "�û������䲻��Ϊ��");
		}*/
		//�û������ղ���Ϊ��
		/*if(user.getBirthday() == null || "".equals(user.getBirthday())){
			//���������Ϣ
			super.addFieldError("birthday" , "�û������ղ���Ϊ��");
		}*/
		
	}

	//ҵ�񷽷�
	public String checkData(){
		
		System.out.println(user);
		return SUCCESS;
	}
	
	//�û��б��չʾ
	public String list(){
		
		System.out.println("ģ���Ƿ���֤");
		return "list";
	}
	
}
