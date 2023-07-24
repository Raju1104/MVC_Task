<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Data Page</title>
<style type="text/css">
table {
	border-collapse: collapse;
}
</style>
</head>
<body>
	<h1 align="center">Student Details</h1>

	<table border="1" align="center">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age:</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Address</th>
			<th>Date of Admission</th>

		</tr>
		<c:forEach var="stdData" items="${std}">
			<tr>
				<td>${stdData.id}</td>
				<td>${stdData.fname}</td>
				<td>${stdData.lname}</td>
				<td>${stdData.age}</td>
				<td>${stdData.email}</td>
				<td>${stdData.mobile}</td>
				<td>${stdData.address}</td>
				<td>${stdData.admission}</td>
			</tr>



		</c:forEach>
	</table>
</body>
</html>
>
