<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据校验</title>

<!-- 修改struts标签默认的样式： 不让换行 --> 
<style type="text/css">
	ul{display: inline;}
	ul li{display: inline;color: red;}
</style>

</head>
<body>

<!-- 显示的是Struts2在运行时期产生的所有错误 -->
<!-- 方式一 -->
<%-- <s:fielderror></s:fielderror> --%>

<%-- <s:fielderror fieldName="user.name"></s:fielderror>
<s:fielderror fieldName="user.password"></s:fielderror>
<s:fielderror fieldName="user.email"></s:fielderror>
<s:fielderror fieldName="user.birthday"></s:fielderror> --%>

<form action="${pageContext.request.contextPath}/data_checkXmlData.action" method="post">
	账号：<input type="text" name="user.name"/>
		<!-- 方式二 -->	
		<s:fielderror fieldName="user.name"></s:fielderror><br/>
	密码：<input type="password" name="user.password"/>
		<s:fielderror fieldName="user.password"></s:fielderror><br/>
	邮箱：<input type="text" name="user.email"/><br/>
		<%-- <s:fielderror fieldName="user.email"></s:fielderror> --%>
	生日：<input type="text" name="user.birthday"/><br/>
		<%-- <s:fielderror fieldName="user.birthday"></s:fielderror> --%>
		 <input type="submit" value="注册"/>
		 <input type="reset" value="重置"/>
</form>

</body>
</html>