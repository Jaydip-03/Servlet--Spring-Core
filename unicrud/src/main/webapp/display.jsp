<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,com.jsp.unicrud.entity.*,java.util.List"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<table class="table table-striped">
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
		<% 
			List<University> list= (List<University>)request.getAttribute("alluni");
			request.setAttribute("data",list);
		%>
		<c:forEach var="i" items="${data }">
		<tr>
		<td>${i.getId()}</td>
		<td>${i.getName()}</td>
		<td>${i.getLoc()}</td>
		<td>${i.getEmail()}</td>
		<td>${i.getRank()}</td>
		<td>${i.getType()}</td>
		<td><a href="edit?id=${i.getId() }">Update</a></td>
		<td><a href="delete?id=${i.getId() }">delete</a></td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
</body>
</html>



