<%@ include file="./header.jspf" %>

<h3>New user registration form</h3>
<hr>
<form action="register" method="post">
	<table>
		<tr>
			<td>Enter Name </td>
			<td><input type="text" name="name" ></td>
		</tr>
		<tr>
			<td>Enter Email</td>
			<td><input type="text" name="email" ></td>
		</tr>
		<tr>
			<td>Enter Password</td>
			<td><input type="password" name="password" ></td>
		</tr>
		
		<tr>
			<td><button>Register</button></td>
			<td><input type="reset" /> </td>
		</tr>
	</table>
</form>