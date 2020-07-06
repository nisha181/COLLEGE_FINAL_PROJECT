<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book here</title>
</head>
<body background="https://images.unsplash.com/photo-1555621228-167aa92154f7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1400&q=80">
<center>
	<form action="/customer/bookCar" method="post">
		<h1>ENTER YOUR ID</h1>
		<input type="text" name="id" placeholder="Enter car id"> <input
			type="submit" value="submit">
		<td><input type="reset" value="reset"></td>
	</form>

	<h1>Car Details</h1>
	<table border="2" height="50%" width="50%">
		<tr>
			<td>ID</td>
			<td>AVAILABILITY</td>
			<td>CAR NAME</td>
			<td>CAR SEAT</td>
		</tr>

		<tbody>
			<tr>
				<td>${Car.id}</td>
				<td>${Car.availability}</td>
				<td>${Car.name}</td>
				<td>${Car.seat}</td>
			</tr>
		</tbody>
	</table>
	<a href="/customer/booking?CarId=${Car.id}">Booking</a><br>
	<a href="/customer/showall">Show Cars</a><br>
	<a href="/customer/logout">Sign Out</a>
	</center>
</body>
</html>