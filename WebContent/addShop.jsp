<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="GB18030" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商店管理系统--添加</title>
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
	<td height = "21" colspan="2">商品信息管理--添加</td>
</tr>
<tr>
	<td>商品名称 </td>
	<td>
	<input type = "text" name = "name">
	</td>
</tr>

<tr>
	<td>商品编号 </td>
	<td>
	<input type = "text" name = "code">
	</td>
</tr>

<tr>
	<td>商品类型 </td>
	<td>
	<input name = "type" cols="50" rows="6"></input>
	</td>
</tr>

<tr>
	<td>商品单位 </td>
	<td>
	<input name = "unit" cols="50" rows="6"></input>
	</td>
</tr>

<tr>
	<td>商品上限 </td>
	<td>
	<input name = "upperlimit" cols="50" rows="6"></input>
	</td>
</tr>


<tr>
	<td>商品下限 </td>
	<td>
	<input name = "lowerlimit" cols="50" rows="6"></input>
	</td>
</tr>

<tr>
	<td>商品单价 </td>
	<td>
	<input name = "unitprice" cols="50" rows="6"></input>
	</td>
</tr>

<tr>
	<td>商品库存总量 </td>
	<td>
	<input name = "totality" cols="50" rows="6"></input>
	</td>
</tr>

<tr>
	<td>商品总价 </td>
	<td>
	<input name = "totalprice" cols="50" rows="6"></input>
	</td>
</tr>


<tr>
	<td>商品生产者 </td>
	<td>
	<input name = "producer" cols="50" rows="6"></input>
	</td>
</tr>


<tr>
	<td>商品位置 </td>
	<td>
	<input type = "text" name = "storage">
	</td>
</tr>



<tr>
<td colspan="2"><input type="button" name="btnadd" onclick="addShop()" value="增加" /></td>
</tr>

</table>
</form>
</body>
</html>