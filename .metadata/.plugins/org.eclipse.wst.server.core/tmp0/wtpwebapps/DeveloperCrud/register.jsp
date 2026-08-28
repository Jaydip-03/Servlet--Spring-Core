< <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <form action="registerDev"  method="post">
    Name : <input type="text" name="name"> <br><br>
     Email  : <input type="email" name="email"> <br><br>
     Pass : <input type="password" name="password" class="form-control mb-3" placeholder="Password" required> <br><br>
      Position: <input type="text" name="position"> <br><br>
       YearsOf EXP: <input type="text" name="yoe"> <br><br>
       <input type="submit" value="regester">
  </form>

</body>
</html>  -->


<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Developer Register</title>

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

<h2 class="text-center mb-4">Register 🚀</h2>

<form action="registerDev" method="post">

<input type="text"
       name="name"
       placeholder="Enter Name"
       class="form-control mb-3"
       required>

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

<input type="text"
       name="position"
       placeholder="Position"
       class="form-control mb-3"
       required>

<input type="number"
       name="yoe"
       placeholder="Years Of Experience"
       class="form-control mb-3"
       required>

<button class="btn btn-primary w-100">
    Register
</button>

</form>

</div>

</body>
</html>