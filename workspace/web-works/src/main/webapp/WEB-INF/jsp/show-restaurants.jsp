<%@page import="com.naveen.beans.Restaurant"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="2">
		<thead>
			<tr><td>Restaurant Name</td> <td>Restaurant City</td></tr>
		</thead>
		<core:forEach items="${RESTAURANTS}" var="r" >
			<tr>
				<td>${r.restName}</td>
				<td>${r.city }</td>
			</tr>
		</core:forEach>
	</table>
</body>
</html>