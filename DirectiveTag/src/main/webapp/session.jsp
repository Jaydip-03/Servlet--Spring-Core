<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
        <%
        	session.setAttribute("name", "ram");
        %>
        
        <h1>Heyyyy : <%= session.getAttribute("name") %></h1>
</body>
</html>