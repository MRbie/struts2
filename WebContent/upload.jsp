<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传的页面</title>
</head>
<body>

<form action="${pageContext.request.contextPath }/fileUploadAction" method="post" enctype="multipart/form-data">
	文件名：<input type="text" name="fileFileName"/><br/>
          文件：    <input type="file" name="file1"/><br/>
          <input type="submit" value="上传文件">

</form>


</body>
</html>