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
   	 request.setAttribute("userName", request.getParameter("Username"));
    	request.setAttribute("passs", request.getParameter("password"));
    	request.setAttribute("contact", request.getParameter("contact"));
   	  
   	%>
   	
   	 <h1>Uername is : ${userName} </h1>
   	 <h1>Pass is :  ${pass} </h1>
   	 <h1>Contacttt :  ${contact} </h1>
   	 <h1>${request.getParameter("Username")} </h1>
   	 
  
</body>
</html>