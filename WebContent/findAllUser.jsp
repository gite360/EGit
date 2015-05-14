<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030" errorPage="error.jsp"%>
<%@page import="java.util.*" %>
<%@page import="com.jialin.entity.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>查看用户</title>
<% request.setCharacterEncoding("gb2312");
   List<User> userList = (List<User>)session.getAttribute("userlist");
%>
</head>
<body>
<script type="text/javascript">
   function deleteuser(id){
      alert("您没有权限 delete");
   }

   function deleteuser(name){
	      alert("您没有权限 delete");
	   }

   function edituser(id){
	  alert("您没有权限edit");   
   }

</script>
<div>
	<table>
	<table bgcolor = "#9999dd" border="1" width="400">
<tr>
<td><div align="center">ID</div></td>
<td><div align="center">用户名</div></td>
<td><div align="center">邮箱</div></td>


</tr>

<%
if(userList!=null && userList.size()>0){
	for(int i=0;i<userList.size();i++){
		User user = userList.get(i);
		int id = user.getId();
		String name = user.getName();
%>
   <tr id = "<%=i%>>">
       <td><%=user.getId()%></td>
       <td><%=user.getName()%></td>
       <td><%=user.getPassword()%></td>
       
   </tr>
<%
	}
	
}

%>
	
	</table>
</div>
</body>
</html>