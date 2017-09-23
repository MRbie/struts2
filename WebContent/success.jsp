<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>struts2 hello </title>
</head>
<body>

<h1>hello world struts2</h1>

<h1>${requestScope.request_data }</h1>
<h1>${sessionScope.session_data }</h1>
<h1>${applicationScope.application_data }</h1>

<!-- 页面： 必须要拿到ValueStack -->
<h1>根元素的值：</h1>
<s:property value="user.id"/><br/>
<s:property value="user.name"/><br/>
<s:property value="user.address"/><br/>
<s:property value="user.address.provice"/><br/>
<s:property value="user.address.city"/><br/>

<br/><br/>
<!-- 非根元素的值 -->
<s:property value="#request.cn"/><br/>
<s:property value="#session.session_data"/><br/>
<s:property value="#application.application_data"/>

<br/><br/>
<!-- 自动找request/session/application,找到后立刻返回 -->
<s:property value="#attr.cn"/><br/>
<s:property value="#attr.session_data"/><br/>
<s:property value="#attr.application_data"/><br/>

<br/><br/>
<!-- 获取请求的参数数据 -->
<s:property value="#parameters.userName"/>
     


<!-- struts的调试标签：可以观测值栈数据 -->
<s:debug></s:debug>
</body>
</html>