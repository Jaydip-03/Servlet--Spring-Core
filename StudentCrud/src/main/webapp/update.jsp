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
       <h2>Update Employee</h2>
    <form action="update" method="post">

    <input type="hidden" name="id" value="${std.id}">
    
    Name: <input type="text" name="name" value="${std.name}">
    
    <input type="submit" value="update">

</form>
</body>
</html>