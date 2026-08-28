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

  <form action="update" method="post">
    <h3>${id }</h3>
     ID :<input type="number" name="id" value="${id }"  > <br>
     NAME :  <input type="text" name="name"> <br>
     <input type="submit" value="Submit">
     
  </form>

</body>
</html>