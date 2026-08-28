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
      	String email = request.getParameter("email");
        String pass = request.getParameter("passs") ;
        
        request.setAttribute("email", email);
        request.setAttribute("pass", pass) ;
      %>
      
      
     <h1>Email :  ${email}</h1>
     <h1>Password :  ${pass}</h1>
      
      
</body>
</html>