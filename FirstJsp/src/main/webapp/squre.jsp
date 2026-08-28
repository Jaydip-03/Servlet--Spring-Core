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
       		 int a = 10 ;
       
             public  int squre() {
            	 return ( a * a) ;
             }
       %>
       
       <%!
       		
       %>
       <h2>squre is <% out.print(a); %> is <% out.print(squre()); %> </h2>

</body>
</html>