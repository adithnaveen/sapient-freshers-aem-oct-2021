<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
	<td>User Name </td>
	<td>Password </td>
</tr>

<tr>
	<td>${param.uname }</td>
	<td>${param.password }</td>
</tr>

</table>
<h3>Passed from login-validate -> ${param.COMPANY }</h3>
</body>
</html>