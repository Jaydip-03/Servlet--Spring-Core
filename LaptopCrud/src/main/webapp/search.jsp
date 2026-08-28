<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
    
       
       <table  class="table table-success table-striped">
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
				    <tr>
				        <td>${la.id}</td>
				        <td>${la.name}</td>
				        <td>${la.price}</td>
				        <td>${la.ram}</td>
				        <td>${la.rom}</td>
				        <td>${la.version}</td>
				        <td>${la.color}</td>
				        <td>${la.weight}</td>
				
				        <td><a href="update?id=${la.id }" >update</a></td>
				        <td><a href="delete?id=${la.id }"  >delete</a></td>
				    </tr>

            </tbody>
          
     </table>
     
     
     <a href="home.jsp">Home</a>
</body>
</html>