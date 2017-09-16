<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册的页面</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/user_register2.action" method="post">
	账号：<input type="text" name="user.name"/><br/>
	密码：<input type="password" name="user.password"/><br/>
	年龄：<input type="text" name="user.age"/><br/>
	生日：<input type="text" name="user.birthday"/><br/>
		 <input type="submit" value="注册"/>
		 <input type="reset" value="重置"/>
</form>

</body>
</html>