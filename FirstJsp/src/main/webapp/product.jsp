<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   
   
     <%!
     int a = 10;
     int b = 5 ;
     
     public int product() {
    	 return a * b ;
     }
     %>
     
     <h3>product of <%= a %>  and <%= b %> is <%= product() %></h3>


</body>
</html>