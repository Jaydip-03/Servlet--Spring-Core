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
        <%
        	session.setAttribute("username", "peter") ;
        %>
        
        <h1>USERNAME ISSSS : <%= session.getAttribute("username") %> </h1>
        
        <h2> ${username}</h2>
</body>
</html>