<%@page import="com.naveen.service.RegistrationService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String uName = request.getParameter("uname");
	String password = request.getParameter("password");
	// you can take other parameters 
	 
	if(uName.equals("sapient") && password.equals("india")){
%>

	<jsp:forward page="success.jsp">
		<jsp:param value="SAPIENT-NEW-COMPANY" name="COMPANY"/>
	</jsp:forward>
	
<%
		// forward to success page 
		
	}else {
		// show error message and allow user to reg again
		// include failure page 
%>
	<h2>Sorry Couldn't Register</h2>
	<jsp:include page="registration-form2.html"/>
<%		
	}
%>
</body>
</html>