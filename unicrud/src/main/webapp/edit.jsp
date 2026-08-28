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
	<form action="edit" method="post">
	Id:<input type="text" name="id" value="${id }"><br>
	Name:<input type="text" name="name"><br>
	<input type="submit" value="update">
	</form>
</body>
</html>