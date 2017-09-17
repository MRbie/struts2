<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆之后显示管理员信息</title>
</head>
<body>

<h1>欢迎您：${loginInfo.adminName }</h1>
<table cellpadding="10" cellspacing="10" align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>密码</th>
    </tr>
    
    <!-- 从request中取出放到request的值 -->
    <s:iterator var="admin" value="#request.all" status="lu">
        <tr>    
            <td>
                <s:property value="#lu.count"/>
            </td>
            <td>
                <s:property value="#admin.adminName"/>
            </td>
            <td>
                <s:property value="#admin.adminPassword"/>
            </td>

        </tr>
    </s:iterator>
    
</table>
</body>
</html>