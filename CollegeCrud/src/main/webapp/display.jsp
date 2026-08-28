<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.List" %>
    <%@ page import="com.jsp.CollegeCrud.entity.College"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		<table>
		<thead>
		    <tr>
		       <th>ID</th>
		       <th>NAME</th>
		       <th>UNIVERSITY</th>
		       <th>LOCATION</th>
		       <th>DEPTCOUNT</th>
		       <th>UPDATE COLLEGE</th>
		       <th>DELETE COLLGE</th>
		       
		       
		    </tr>
		</thead>
		<tbody>
		     <c:forEach var="i" items="${list}">
				    <tr>
				        <td>${i.id}</td>
				        <td>${i.name}</td>
				        <td>${i.university}</td>
				        <td>${i.loc}</td>
				        <td>${i.deptCount}</td>
				        <td><a href="update?id=${i.id }">update</a></td>
				        <td><a href="delete?id=${i.id }">delete</a></td>
				    </tr>
				</c:forEach>
		</tbody>
		
		</table>
		
		<a href="home.jsp">Home</a>

</body>
</html>