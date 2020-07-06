<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html SYSTEM "about:legacy-compat">

<html lang="en">

<head>

<meta charset="utf-8">

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<title>Admin Login Page</title>
</head>
<body background="https://images.unsplash.com/photo-1576478435785-059ed7bc976d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1334&q=80">
<h1>${msg}</h1>
	<form:form method="post" modelAttribute="register">
		<center><table>
			<tr>
				<td colspan=2><center>
						<font size=6><b>Login Page</b></font>
					</center></td>
			</tr>

			<tr>
				<td>Admin Id:</td>
				<td><form:input path="id" id="id" /></td>
				<td><form:errors path="id" /></td>
			</tr>
			<tr>
				<td>Admin Name:</td>
				<td><form:input path="adminName" id="adminName" /></td>
				<td><form:errors path="adminName" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="password" id="password" /></td>
				<td><form:errors path="password" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" id="email" /></td>
				<td><form:errors path="email" /></td>
			</tr>
			
			
			<tr>
				<td><input type="reset" value="reset"></td>
				<td><button class="btn btn-lg btn-primary"
						type="submit">Login</button></td>
			</tr>

		</table></center>
	</form:form>


</body>
</html>