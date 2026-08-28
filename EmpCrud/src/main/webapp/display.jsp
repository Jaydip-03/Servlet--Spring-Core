<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.List" %>
    <%@ page import="com.jsp.EmpCrud.entity.Employee" %>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
     <h1>VIEW YOUR TABELE HERE</h1>
     
     <table class="table table-striped">
        <thead>
          <tr>
           		<th>ID</th>
           		<th>Name</th>
           		<th>Age</th>
           		<th>Email</th>
           		<th>Password</th>
           		<th>Salary</th>
           		<th>role</th>
           		<th>skill</th>
           		<th>Update operation</th>
           		<th>Delete Operatio</th>
           		
           </tr>
        </thead>   
        
        <tbody>
               <%-- <%
        	List<Employee> list = (List<Employee>) request.getAttribute("emplist") ;
            request.setAttribute("data", list);
           
             %> --%>
             
             <%-- <c:forEach var="i" items="${data }">
               <tr>
                  <td>${i.getId() }</td>
                  <td>${i.getName() }</td>
                  <td>${i.getAge() } </td>
                  <td>${i.getEmail() }</td>
                  <td>${i.getPassword() }</td>
                  <td>${i.getSalary() }</td>
                  <td>${i.getRole() }</td>
                  <td>${i.getSkill() }</td>
                  <td> <a href="edit?id=${i.getId()}">update</a>  </td>
                  <td> <a href="delete?id=${i.getId()}">delete</a>  </td>
                 
                  
               </tr>
             </c:forEach> --%>
             
             <tbody>

				<c:forEach var="i" items="${emplist}">
				    <tr>
				        <td>${i.id}</td>
				        <td>${i.name}</td>
				        <td>${i.age}</td>
				        <td>${i.email}</td>
				        <td>${i.password}</td>
				        <td>${i.salary}</td>
				        <td>${i.role}</td>
				        <td>${i.skill}</td>
				
				        <td><a href="edit?id=${i.id}">update</a></td>
				        <td><a href="delete?id=${i.id}">delete</a></td>
				    </tr>
				</c:forEach>

            </tbody>
            
            

        
     </table>
</body>
</html>