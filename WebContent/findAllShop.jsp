<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="GB18030" errorPage="error.jsp"%>
<%@page import="java.util.*"%>
<%@page import="com.jialin.entity.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>�鿴�û�</title>
		<%
			request.setCharacterEncoding("utf-8");
			List<Shop> userList = (List<Shop>) session.getAttribute("shoplist");
		%>
	</head>
	<body>
		<script type="text/javascript">
   function deleteShop(id){
      alert("��û��Ȩ��delete id =="+id);
      var myform=document.forms[0];
	  myform.action="shop/deleteShop?id=\'"+id+"\'";
	  myform.method="post";
	  myform.submit();
   }

   function editShop(id){
	  alert("��û��Ȩ��edit id =="+id);   
   }

</script>
		<div>
			<table>
				<tr bgcolor="#9999dd" border="1" width="400">
					<td>
						<div align="center">
							ID
						</div>
					</td>
					<td>
						<div align="center">

							��Ʒ����

						</div>
					</td>
					<td>
						<div align="center">
							��Ʒ���
						</div>
					</td>
					<td>
						<div align="center">

							��Ʒ����

						</div>
					</td>
					<td>
						<div align="center">
							��Ʒ��λ

						</div>
					</td>
					<td>
						<div align="center">
							��Ʒ����

						</div>
					</td>

					<td>
						<div align="center">
							��Ʒ����

						</div>
					</td>


					<td>
						<div align="center">
							��Ʒ����

						</div>
					</td>

					<td>
						<div align="center">
							�������

						</div>
					</td>

					<td>
						<div align="center">
							�ܼ�

						</div>
					</td>

					<td>
						<div align="center">
							������

						</div>
					</td>

					<td>
						<div align="center">
							�洢λ��

						</div>
					</td>



				</tr>

				<%
					if (userList != null && userList.size() > 0) {
						for (int i = 0; i < userList.size(); i++) {
							Shop shop = userList.get(i);
							int id = shop.getId();
				%>
				<tr id="<%=i%>>" bgcolor="#ffffdd" border="1" width="400">
					<td><%=shop.getId()%></td>
					<td><%=shop.getName()%></td>
					<td><%=shop.getCode()%></td>
					<td><%=shop.getType()%></td>
					<td><%=shop.getUnit()%></td>
					<td><%=shop.getUpperlimit()%></td>
					<td><%=shop.getLowerlimit()%></td>
					<td><%=shop.getUnitprice()%></td>
					<td><%=shop.getTotality()%></td>
					<td><%=shop.getTotalprice()%></td>
					<td><%=shop.getProducer()%></td>
					<td><%=shop.getStorage()%></td>
					
					

				</tr>
				<%
					}

					}
				%>

			</table>
		</div>
	</body>
</html>