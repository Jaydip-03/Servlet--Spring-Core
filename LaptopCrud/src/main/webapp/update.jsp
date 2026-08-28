<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Update Laptop</h2>
    
    <form action="update" method="post">

    <input type="hidden" name="id" value="${lap.id}">
    
    Name: <input type="text" name="name" value="${lap.name}">
    
    <input type="submit" value="update">
</body>
</html>