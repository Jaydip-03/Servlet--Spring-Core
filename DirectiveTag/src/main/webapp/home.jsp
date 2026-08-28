<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.time.LocalDate" %>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <h1>current date: <%= LocalDate.now() %></h1>
      
      <% List<Integer> list = Arrays.asList(10,20,30);
             for(int ele: list) {
      %>
      
    
    	  
    	  <h3><%= ele %></h3>  
    	  
    	  <%
             }
    	  %>    
    	  
    	  
    	  
    	  
    	 <% 
    	 List<String> fruits = Arrays.asList("mango", "banana", "cherrry", "avacado");
    	   for(String fruit : fruits) {  
    	 %>
    	 
    	 <%= fruit %>
    	 
    	 <%} %>
    	 
    	 
    	 
    	 
    	 
</body>
</html>