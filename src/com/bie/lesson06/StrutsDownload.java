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
* @author  Author:别先生 
* @date Date:2017年9月16日 下午10:32:16 
*
*
*/
public class StrutsDownload extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/****************1:显示所有要下载的文件列表*****************/
	public String list() throws Exception{
		//得到upload的路径
		String realPath = ServletActionContext.getServletContext().getRealPath("/upload");
		//目录对象
		File file = new File(realPath);
		//得到所有要下载的文件的文件名称
		String[] list = file.list();
		//保存
		ActionContext context = ActionContext.getContext();
		//获取request的域对象,第二种方式获取request
		Map<String,Object> request= (Map<String, Object>) context.get("request");
		
		request.put("list", list);
		return "list";
	}
	
	/*************2:文件下载********************/
	//2.1：获取要下载的文件的文件名,设置字符集，前台页面提交的是以get方式提交的
	 private String fileName;
	 public void setFileName(String fileName) {
		//处理传入的参数种问题（get提交）
        try {
            fileName=new String(fileName.getBytes("ISO8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException();
        }
        //把处理好的文件名，赋值
        this.fileName = fileName;
	}
	
	//2.2：下载提交的业务方法（在struts.xml中配置返回stream）
    public String download() throws Exception {
    	
        return "download";
    }
    
    //2.3：返回流的方法
    public InputStream getAttrInputStream(){
        
    	InputStream resourceAsStream = ServletActionContext.getServletContext()
    			.getResourceAsStream("/upload/"+fileName);
        
    	return resourceAsStream;
    }
    
    //2.4:下载显示的中文名，（浏览器显示的文件名）
    public String getDownFileName(){
        try{
            //import java.net.URLEncoder;
        	//需要进行中文编码
            fileName = URLEncoder.encode(fileName,"UTF-8");
        }catch(Exception e){
            throw new RuntimeException();
        }
        
        return fileName;
    }

}
