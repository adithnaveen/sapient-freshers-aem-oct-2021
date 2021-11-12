<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--  include file directive can only include static files -->
<%@ include file="./multiplication-form2.html" %>

<%
	int value = Integer.parseInt(request.getParameter("val")); 
%>
<h2>Your Mulitplication Values Go Here </h2>
<table>
<%
	// 10 x 1 = 10
	for(int i=1; i<=10; i++) {
%>
	<tr><td><%=value %> X  <%=i %> = <%= value * i %></td></tr> 
<%
	}
%>
</table>
</body>
</html>