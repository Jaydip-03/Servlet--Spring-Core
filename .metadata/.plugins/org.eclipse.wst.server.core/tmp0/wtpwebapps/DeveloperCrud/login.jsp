<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Login</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    background: linear-gradient(135deg,#667eea,#764ba2);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.card-box{
    width:400px;
    padding:30px;
    border-radius:20px;
    background:white;
    box-shadow:0 20px 40px rgba(0,0,0,0.3);
}

</style>

</head>

<body>

<div class="card-box">

<h2 class="text-center mb-4">Login 🔐</h2>

<form action="loginDev" method="post">

<input type="email"
       name="email"
       placeholder="Enter Email"
       class="form-control mb-3"
       required>

<input type="password"
       name="password"
       placeholder="Enter Password"
       class="form-control mb-3"
       required>

<button class="btn btn-dark w-100">
    Login
</button>

</form>

</div>

</body>
</html>