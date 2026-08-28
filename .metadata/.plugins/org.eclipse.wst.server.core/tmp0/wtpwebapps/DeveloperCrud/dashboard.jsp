<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ page isELIgnored="false" %>

<%
if(session.getAttribute("dev") == null){
    response.sendRedirect("login.jsp");
}
%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Dashboard</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-dark text-white">

<nav class="navbar navbar-dark bg-black px-4">

<h3>Developer Dashboard 🚀</h3>

<a href="logout"
   class="btn btn-danger">
   Logout
</a>

</nav>

<div class="container mt-5">

<h1>
Welcome ${dev.name}
</h1>

<br>

<a href="viewData"
   class="btn btn-primary">
   View Developers
</a>

</div>

</body>
</html>