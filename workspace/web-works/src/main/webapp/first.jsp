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
	

	
	<table border="1">
		<tr>
			<td>PIZZA</td>
			<td>100</td>
			<td><img alt="pizza" src="./assessts/pizza.jpg" width="100" height="100"></td>	
			<td><button>Add To Cart </button></td>		
		</tr>
	</table>
</body>
</html>


<%!

	public void jspDestroy() {
		System.out.println("Hi i'm in Destroy of JSP first ");
	}
%>
	
	
	