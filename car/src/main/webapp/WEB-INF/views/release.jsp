<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="https://images.unsplash.com/photo-1564894276431-2191d73af114?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1400&q=80">
<center>

   <form action="releaseCar" method="post">
   <h1>RELEASE CAR</h1>
   <h3>ENTER CAR ID</h3>
   <input type="text" name="id">
   <input type="submit" value="submit">
   </form>
   <a href="/customer/showall">Show Cars</a><br>
   <a href="/customer/bookcar">Book Car</a><br>
   <a href="/customer/logout">Sign Out</a>
   <h1>${msg}</h1>
   </center>
</body>
</html>