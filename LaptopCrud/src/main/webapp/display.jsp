<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.List" %>
    <%@ page import="com.jsp.LaptopCrud.entity.Laptop" %>
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
       
       <table class="table table-striped">
        <thead>
          <tr>
           		<th>ID</th>
           		<th>Name</th>
           		<th>PRICE</th>
           		<th>RAM</th>
           		<th>ROM</th>
           		<th>VERSION</th>
           		<th>COLOR</th>
           		<th>WEIGHT</th>
           		<th>Update operation</th>
           		<th>Delete Operatio</th>
           		
           </tr>
        </thead>   
        
        <tbody>

				<c:forEach var="i" items="${list}">
				    <tr>
				        <td>${i.id}</td>
				        <td>${i.name}</td>
				        <td>${i.price}</td>
				        <td>${i.ram}</td>
				        <td>${i.rom}</td>
				        <td>${i.version}</td>
				        <td>${i.color}</td>
				        <td>${i.weight}</td>
				
				        <td><a href="update?id=${i.id }" >update</a></td>
				        <td><a href="delete?id=${i.id }"  >delete</a></td>
				    </tr>
				</c:forEach>

            </tbody>
          
     </table>
     
     
     <a href="home.jsp">Home</a>

</body>
</html>