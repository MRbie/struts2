package com.bie.lesson06;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��16�� ����5:22:07 
*
*
*/
public class StrutsUpload extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//��Ӧ�����ϴ��ļ���name����ֵ
	private File file1;//�ļ�
	private String fileFileName;//�ļ�����
	private String file1ContextType;//�ļ�����(MIME)
	public void setFile1(File file1) {
		this.file1 = file1;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public void setFile1ContextType(String file1ContextType) {
		this.file1ContextType = file1ContextType;
	}
	
	
	//�ļ��ϴ���������������������ļ��ϴ��Ĺ���
	@Override
	public String execute() throws Exception {
		//�õ��ϴ����ļ����д���
		//��ȡ�ϴ���·��
		String path = ServletActionContext.getServletContext().getRealPath("/upload");
		//����Ŀ���ļ�����
		File destFile = new File(path, fileFileName);
		//���ϴ����ļ���������Ŀ���ļ���
		FileUtils.copyFile(file1, destFile);
		
		return SUCCESS;
	}
	
}
