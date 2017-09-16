<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

</body>
</html>