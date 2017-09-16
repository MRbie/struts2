package com.bie.lesson06;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:别先生 
* @date Date:2017年9月16日 下午5:22:07 
*
*
*/
public class StrutsUpload extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//对应表单的上传文件的name属性值
	private File file1;//文件
	private String fileFileName;//文件名称
	private String file1ContextType;//文件类型(MIME)
	public void setFile1(File file1) {
		this.file1 = file1;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public void setFile1ContextType(String file1ContextType) {
		this.file1ContextType = file1ContextType;
	}
	
	
	//文件上传拦截器帮助我们完成了文件上传的功能
	@Override
	public String execute() throws Exception {
		//拿到上传的文件进行处理
		//获取上传的路径
		String path = ServletActionContext.getServletContext().getRealPath("/upload");
		//创建目标文件对象
		File destFile = new File(path, fileFileName);
		//把上传的文件，拷贝到目标文件中
		FileUtils.copyFile(file1, destFile);
		
		return SUCCESS;
	}
	
}
