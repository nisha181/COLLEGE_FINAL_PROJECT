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
<title>Edit Page</title>
</head>
<body background="https://images.unsplash.com/photo-1544550581-1bcabf842b77?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1316&q=80">
<center>
	<h1>${res}</h1>
	<form:form method="post" modelAttribute="register">
	
		<table>
			<tr>
				<td colspan=2><center>
						<font size=6><b>EDIT CAR</b></font>
					</center></td>
			</tr>

			<tr>
				<td>Car Id:</td>
				<td><form:input path="id" id="id" /></td>
				<td><form:errors path="id" /></td>
			</tr>
			<tr>
				<td>Car Name:</td>
				<td><form:input path="name" id="name" /></td>
				<td><form:errors path="name" /></td>
			</tr>
			<tr>
				<td>Seat:</td>
				<td><form:input path="seat" id="seat" /></td>
				<td><form:errors path="seat" /></td>
			</tr>

			<tr>
				<td>Availability:</td>
				<td><form:select path="availability">
						<form:options items="${availability}" />
					</form:select></td>
			</tr>


			<tr>
				<td><input type="Reset"></td>
				<td><button class="btn btn-lg btn-primary" type="submit">Edit</button></td>
			</tr>

		</table>
		
	</form:form>
	<table>
		<tr>
			<td><a href="/admin/showCarAdmin">Show Cars</a></td></tr>
			<tr><td><a href="/admin/logout">Sign Out</a>
			<td>
		</tr>
	</table>
	</center>
</body>
</html>