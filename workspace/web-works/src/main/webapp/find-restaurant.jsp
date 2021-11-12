<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!
	Connection connection = null;

	public void jspInit() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection
						("jdbc:mysql://localhost/sap_aem", "root", "kanchan@1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void jspDestroy() {
		try {
			connection.close(); 
		}catch(Exception e) {
			e.printStackTrace(); 
		}
	}%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
	int rId = Integer.parseInt(request.getParameter("rid")); 
	String sql ="select rname, city from restaurant"; 
	PreparedStatement ps = connection.prepareStatement(sql); 
	// ps.setInt(1, rId); 
 	ResultSet rs = ps.executeQuery(); 
	
%>
<body>
	<table>
		<thead>
			<tr>Restaurant Name</tr>
			<tr>City</tr>
		</thead>
		
		<%
			while(rs.next()) {
				%>
					<tr>
						<td><%=rs.getString(1) %></td>
						<td><%=rs.getString(2) %></td>
					</tr>
				<%
			}
		%>
		
	</table>
</body>
</html>













