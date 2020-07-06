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
<title>Customer Login Page</title>
</head>
<body background="https://images.unsplash.com/photo-1560031572-fc4148a0b929?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80">
<center>
	<h1>${msg}</h1>
	<form method="post" action="login">
		<tr>
			<td><a href="/customer/sign-up">New User</a></td>
		</tr>
		<tr>
			<table>

				<td colspan=2><center>
						<font size=6><b>Login</b></font>
					</center></td>
				</tr>

				<tr>
					<td>UserName/Email:</td>
					<td><input type="text" name="user" id="userName" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="text" name="password" id="password" /></td>
				</tr>
				<tr>
					<td><button class="btn btn-lg btn-primary" type="submit"
							value="Sign In">Login</button></td>
					<td><input type="reset" value="reset"></td>
				</tr>

			</table>
	</form>
</center>

</body>
</html>