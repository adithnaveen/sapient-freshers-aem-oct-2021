<%@ include file="./header.jspf"%>

<h3>Existing users please login here</h3>
<hr>

<form action="login" method="post">
	<table>
		<tr>
			<td>Enter Email</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td>Enter Password</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td colspan="2"><button>Login</button></td>
		</tr>
	</table>
</form>