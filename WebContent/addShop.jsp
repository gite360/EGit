<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="GB18030" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>�̵����ϵͳ--���</title>
<script type="text/javascript">
	//var myfrom=document.getElementById("myform1");

	
	function addShop()
	{
		var myform=document.forms[0];//hehe 
		myform.action="shop/addShop";
		myform.method="post";
		myform.submit();
	}
	

</script>

</head>
<body>
<form id="myform2">
<table>

<tr bgcolor = "#dfdfff">
	<td height = "21" colspan="2">��Ʒ��Ϣ����--���</td>
</tr>
<tr>
	<td>��Ʒ���� </td>
	<td>
	<input type = "text" name = "name">
	</td>
</tr>

<tr>
	<td>��Ʒ��� </td>
	<td>
	<input type = "text" name = "code">
	</td>
</tr>

<tr>
	<td>��Ʒ���� </td>
	<td>
	<input name = "type" cols="50" rows="6"></input>
	</td>
</tr>

<tr>
	<td>��Ʒ��λ </td>
	<td>
	<input name = "unit" cols="50" rows="6"></input>
	</td>
</tr>

<tr>
	<td>��Ʒ���� </td>
	<td>
	<input name = "upperlimit" cols="50" rows="6"></input>
	</td>
</tr>


<tr>
	<td>��Ʒ���� </td>
	<td>
	<input name = "lowerlimit" cols="50" rows="6"></input>
	</td>
</tr>

<tr>
	<td>��Ʒ���� </td>
	<td>
	<input name = "unitprice" cols="50" rows="6"></input>
	</td>
</tr>

<tr>
	<td>��Ʒ������� </td>
	<td>
	<input name = "totality" cols="50" rows="6"></input>
	</td>
</tr>

<tr>
	<td>��Ʒ�ܼ� </td>
	<td>
	<input name = "totalprice" cols="50" rows="6"></input>
	</td>
</tr>


<tr>
	<td>��Ʒ������ </td>
	<td>
	<input name = "producer" cols="50" rows="6"></input>
	</td>
</tr>


<tr>
	<td>��Ʒλ�� </td>
	<td>
	<input type = "text" name = "storage">
	</td>
</tr>



<tr>
<td colspan="2"><input type="button" name="btnadd" onclick="addShop()" value="����" /></td>
</tr>

</table>
</form>
</body>
</html>