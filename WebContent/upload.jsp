<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="uploadAction/upload" method="post" enctype="multipart/form-data">
<table>
	<tr>
		<td>请选择你要上传的文件：</td>
		<td><s:file name="file"></s:file></td>
	</tr>
	<tr>
		<td><input type="submit" value="提交"> </td>
	</tr>
</table>
</form>
</body>
</html>