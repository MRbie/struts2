package com.bie.lesson06;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
* @author  Author:������ 
* @date Date:2017��9��16�� ����10:32:16 
*
*
*/
public class StrutsDownload extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/****************1:��ʾ����Ҫ���ص��ļ��б�*****************/
	public String list() throws Exception{
		//�õ�upload��·��
		String realPath = ServletActionContext.getServletContext().getRealPath("/upload");
		//Ŀ¼����
		File file = new File(realPath);
		//�õ�����Ҫ���ص��ļ����ļ�����
		String[] list = file.list();
		//����
		ActionContext context = ActionContext.getContext();
		//��ȡrequest�������,�ڶ��ַ�ʽ��ȡrequest
		Map<String,Object> request= (Map<String, Object>) context.get("request");
		
		request.put("list", list);
		return "list";
	}
	
	/*************2:�ļ�����********************/
	//2.1����ȡҪ���ص��ļ����ļ���,�����ַ�����ǰ̨ҳ���ύ������get��ʽ�ύ��
	 private String fileName;
	 public void setFileName(String fileName) {
		//������Ĳ��������⣨get�ύ��
        try {
            fileName=new String(fileName.getBytes("ISO8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException();
        }
        //�Ѵ���õ��ļ�������ֵ
        this.fileName = fileName;
	}
	
	//2.2�������ύ��ҵ�񷽷�����struts.xml�����÷���stream��
    public String download() throws Exception {
    	
        return "download";
    }
    
    //2.3���������ķ���
    public InputStream getAttrInputStream(){
        
    	InputStream resourceAsStream = ServletActionContext.getServletContext()
    			.getResourceAsStream("/upload/"+fileName);
        
    	return resourceAsStream;
    }
    
    //2.4:������ʾ�������������������ʾ���ļ�����
    public String getDownFileName(){
        try{
            //import java.net.URLEncoder;
        	//��Ҫ�������ı���
            fileName = URLEncoder.encode(fileName,"UTF-8");
        }catch(Exception e){
            throw new RuntimeException();
        }
        
        return fileName;
    }

}
