<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
登录页 
<form action="Person_login.action">
	<table>
	<tr><th></th><th></th></tr>
	  <tr><th>用户名</th><th><input type="text" name="sysUser.userName" /></th></tr>
	  <tr><th>密码</th><th><input type="password" name="sysUser.userPwd"/></th></tr>
	  <tr><th></th><th><input type="submit" value="登录"/></th></tr>
	</table>
</form>
</body>
</html>