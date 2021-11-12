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

<%
	// ideally the data will be dispatched from the controller(servlets)
	
	String name = "Naveen Kumar" ;
	// there 4 contexts here - page (this), request, session, application
	
	// by default or highest priority is from page scope 
	pageContext.setAttribute("name", name); 
	request.setAttribute("name", "Ashutosh");
	session.setAttribute("name", "Swati"); 
	
	
%>
<h3>Name : ${name}</h3>
<h3>Name : ${requestScope.name  }</h3>
<h3>Name : ${sessionScope.name  }</h3>
<h3>Name : ${applicationScope.name==null?"Friend" : applicationScope.name }</h3>


<form action="">
	<input type="text" name="your_name" /> 
</form>

<h4>Hello ${param.your_name==null ?"Your Name" : param.your_name}</h4>



</body>
</html>