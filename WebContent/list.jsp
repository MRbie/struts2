<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件下载的页面</title>
</head>
<body>



<center>
<table cellpadding="10" cellspacing="10">
    <tr>
        <td>编号</td>
        <td>文件名</td>
        <td>操作</td>
    </tr>
    <!-- 循环遍历显示要下载的文件 -->
    <c:forEach items="${list }" var="fileName" varStatus="fn">
        <tr>
            <td>${fn.count}</td>
            <td>${fileName }</td>
            <td>
                <!-- 构建一个url -->
                <!-- 显示要下载的文件的路径以及下载链接 -->
                <c:url var="url" value="file_download">
                    <c:param name="fileName" value="${fileName }"></c:param>
                </c:url>
                <a href="${url }">下载</a>
            </td>
        </tr>
    </c:forEach>
</table>

</center>
</body>
</html>