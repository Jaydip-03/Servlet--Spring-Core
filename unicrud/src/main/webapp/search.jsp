<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.jsp.unicrud.entity.*"%>
    <%@ page import="com.jsp.unicrud.entity.University"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- required meta tag -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

<table border="2px" cellpadding="10" cellspacing="5">
		<thead>
		<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Location</th>
		<th>Email</th>
		<th>Rank</th>
		<th>Type</th>
		<th>Update</th>
		<th>Delete</th>
		</tr>
		
	</thead>
	<tbody>
		
		<tr>
		<td>${uni.getId()}</td>
		<td>${uni.getName()}</td>
		<td>${uni.getLoc()}</td>
		<td>${uni.getEmail()}</td>
		<td>${uni.getRank()}</td>
		<td>${uni.getType()}</td>
		<td><a href="edit?id=${uni.getId() }">Update</a></td>
		<td><a href="delete?id=${uni.getId() }">delete</a></td>
		
	</tbody>
	</table>

</body>
</html>