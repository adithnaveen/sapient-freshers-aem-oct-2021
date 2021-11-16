<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="my-custom-tag-library" prefix="nav"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
.bordered-table {
	border: 5px solid #dee2e6;
	margin-bottom: 1rem;
	color: #212529;
	margin-bottom: 1rem;
	border-collapse: collapse;
}

.bordered-table tr {
	display: table-row;
	border: 2px solid blue;
	vertical-align: inherit;
	border-color: inherit;
}

.bordered-table td, .bordered-table th {
	border: 1px solid #dee2e6;
	padding: .75rem;
}
</style>

</head>
<body>
	<h1>Welcome to JSP Custom Tags</h1>

	<!--  empty tag -->
	<nav:date />
	<br />
	<nav:date pattern="d/M/yyyy" />
	<br />
	<nav:date pattern="yyyy/MM/dd" />
	<br />
	<nav:date pattern="EEEE MMMM d, hh-mm-ss" />
	<br />

	<%-- 
		TODO 
	<nav:food-item id="101" /> --%>


 <nav:table border="5" delim=";" cssClass="bordered-table">
id;name;city;email;state
101;Naveen;Bengaluru;naveen@probits.in;karnataka
102;Arujn;Hyderabad;arjun@gmail.com;Telangana
103;Yogesh;Delhi;yogesh@example.com;Delhi
</nav:table>

	<br />
	<br />
	<br />
	<nav:table border="1">
		<%@ include file="./records.csv"%>
	</nav:table>
<hr /> 
  <nav:restaurant rid="102"/>
</body>
</html>