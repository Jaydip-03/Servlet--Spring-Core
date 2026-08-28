<%@page import="com.jsp.bankcrud.entity.Bank"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
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
	<h1>Display Page</h1>
	<table border="2px" cellpadding="10" cellspacing="5">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>ISFC</th>
				<th>Location</th>
				<th>Update Operation</th>
				<th>Delete Operation</th>
			</tr>
		</thead>
		<tbody>

			<%
			List<Bank> list = (List<Bank>) request.getAttribute("allBanks");
			request.setAttribute("data", list);
			%>

			<c:forEach var="i" items="${data}">
				<tr>
					<td>${i.getId()}</td>
					<td>${i.getName()}</td>
					<td>${i.getISFC()}</td>
					<td>${i.getLocation()}</td>
					<td><a href="update?id=${i.getId()}">Update</a></td>
					<td><a href="delete?id=${i.getId()}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>