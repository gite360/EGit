<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>����</title>
		<style type="text/css">
div#container {
	width: 500px
}

div#header {
	background-color: #99bbbb;
}

li {
	width: 100px;
	background-color: #99bbbb;
}

div#menu {
	background-color: #ffff99;
	height: 200px;
	width: 100px;
	float: left;
}

div#content {
	background-color: #EEEEEE;
	height: 200px;
	width: 400px;
	float: left;
}

div#footer {
	background-color: #99bbbb;
	clear: both;
	text-align: center;
}

h1 {
	margin-bottom: 0;
}

h2 {
	margin-bottom: 0;
	font-size: 14px;
}

ul {
	margin: 0;
}

li {
	list-style: none;
}
</style>
	</head>
	<body>

<table>
<tr bgcolor = "#dfdfff">
	<td height = "21" colspan="2">�û�����</td>
</tr>

<tr>
	<td>1 </td>
	<td>
	<a href="findAllUser" target="showframe" id="menu_classroom">��ʾ�û�</a>
	 </td>
</tr>
<tr>
	<td>2 </td>
	<td>
	<a href="addUser.jsp" target="showframe" id="menu_classroom">����û� </a>
	</td>
</tr>
<tr bgcolor = "#dfdfff">
	<td height = "21" colspan="2">��Ʒ����</td>
</tr>
<tr>
	<td>1 </td>
	<td>
	<a href="addShop.jsp" target="showframe" id="menu_classroom">�����Ʒ </a>
	</td>
</tr>

<tr>
	<td>2 </td>
	<td>
	<a href="./shop/findAllShop" target="showframe" id="menu_classroom">�鿴��Ʒ </a>
	</td>
</tr>
<tr>
	<td>3 </td>
	<td>
	<a href="upload.jsp" target="showframe" id="menu_classroom">�ϴ��ļ�</a>
	</td>
</tr>
</table>

</body>
</html>