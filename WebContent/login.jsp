<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
		<title>用户登录</title>
	</head>
	<body>
	<div align = "center" >
		<form action="login" method="post">
			<table>
				<tr>
					<td>
						用户名:</td>
					<td>
						<input type="text" name="name" />
					</td>
				</tr>

				<tr>
					<td>
						密码:
					</td>
					<td>
						<input type="password" name="password" />
					</td>
				</tr>

				<tr>
					<td></td>
					<td>
						<input type="submit" value="登录" />
					</td>
				</tr>

			</table>

		</form>
		</div>
	</body>
</html>