<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Single Student Data</title>
<style type="text/css">
table {
	border-collapse: collapse;
}
</style>
</head>

<body>
	<h1 align="center">Welcome........${stdData.fname}</h1>

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
	</table>


</body>
</html>