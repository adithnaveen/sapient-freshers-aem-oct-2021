<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%!
	public void jspInit() {
		System.out.println("I'm in initof JSP first  "); 
	}

%>

<body>
	<h2>Welcome to JSP </h2>
	<%
		Date date = new Date(); 
		out.println("Date is " + date);
	%>
</body>
</html>


<%!

	public void jspDestroy() {
		System.out.println("Hi i'm in Destroy of JSP first ");
	}
%>
	
	
	