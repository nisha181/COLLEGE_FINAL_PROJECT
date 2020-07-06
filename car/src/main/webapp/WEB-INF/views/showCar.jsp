<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cars</title>
</head>
<body background="https://images.unsplash.com/photo-1521404115841-baa52edcb041?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1425&q=80">
<center>
<h1>Car Details</h1>
   <table border="2" height="50%" width="50%">
   <tr>
    <td>ID</td>
    <td>AVAILABILITY</td>
    <td>CAR NAME</td>
    <td>CAR SEAT</td>
    </tr>
    
   <tbody>
   <c:forEach items="${Car}" var="car">
   <tr>
   <td>${car.id}</td>
   <td>${car.availability}</td>
   <td>${car.name}</td>
   <td>${car.seat}</td>
   </tr>
   </c:forEach>
   </tbody>
   </table>
   <a href="/admin/update">EDIT CAR</a><br>
   <a href="/admin/logout">LOGOUT</a>
   </center>
</body>
</html>