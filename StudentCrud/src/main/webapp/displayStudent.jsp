<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.List" %>
    <%@ page import="com.jsp.StudentCrud.entity.Student" %>
    
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

   <table  class="table table-striped">
   <thead>
   		<tr>
   		  <th>ID</th>
   		  <th>NAME</th>
   		  <th>EMAIL</th>
   		  <th>MARKS</th>
   		  <th>DEPARTMET</th>
   		</tr>
   
   </thead>
   <tbody>
       <c:forEach var="i" items="${studList }">
       <tr>
         <td>${i.id }</td>
         <td>${i.name }</td>
         <td>${i.email }</td>
         <td>${i.marks}</td>
         <td>${i.deparment}</td>
         <td><a href="update?id=${i.id}">update</a></td>
       </tr>
       </c:forEach>
       
   </tbody>
   </table>
     
</body>
</html>