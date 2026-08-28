<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<%-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <form action="updateDev" method="post">
       Id : <input type="hidden" name="id" value="${dev1.id }"> <br>
       Nmae : <input type="text" name="name" value="${dev1.name }"> <br>
       <input type="submit" value="submit"> 
       
    </form>

</body>
</html> --%>


<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Update</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">

<style>

body{
    background:linear-gradient(135deg,#667eea,#764ba2);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.box{
    width:400px;
    background:white;
    padding:30px;
    border-radius:20px;
    box-shadow:0 20px 40px rgba(0,0,0,0.3);
}

</style>

</head>

<body>

<div class="box">

<h2 class="text-center mb-4">
Update Developer ✏️
</h2>

<form action="updateDev"
      method="post">

<input type="hidden"
       name="id"
       value="${dev.id}">

<input type="text"
       name="name"
       value="${dev.name}"
       class="form-control mb-3">

<input type="email"
       name="email"
       value="${dev.email}"
       class="form-control mb-3">

<input type="password"
       name="password"
       value="${dev.password}"
       class="form-control mb-3">

<input type="text"
       name="position"
       value="${dev.position}"
       class="form-control mb-3">

<input type="number"
       name="yoe"
       value="${dev.yogExp}"
       class="form-control mb-3">

<button class="btn btn-warning w-100">
    Update
</button>

</form>

</div>

</body>

</html>