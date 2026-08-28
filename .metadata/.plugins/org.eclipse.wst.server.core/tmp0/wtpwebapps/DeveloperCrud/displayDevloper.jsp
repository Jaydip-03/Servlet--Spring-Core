<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%--  <%@ page import="java.util.List" %>
    <%@ page import="com.jsp.DeveloperCrud.entity.Developer" %>
    <%@ page isELIgnored="false" %>	
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
    
<%-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

   <div class="container mt-5">
   <h2 class="mb-4">Developer List 📊</h2>
   
   
   <table class="table table-hover shadow">
     <thead class="table-dark">
         <tr>
           <th>ID</th>
           <th>NAME</th>
           <th>EMAIL</th>
           <th>POSITION</th>
           <th>EOE</th>
           <th>UPDATE</th>
           <th>DELETE</th>
         </tr>
         
     </thead>
     
     <tbody>
      
      
        <c:forEach var="e" items="${li }">
           <tr>
            <td>${e.id }</td>
            <td>${e.name }</td>
            <td>${e.email}</td>
            <td>${e.position }</td>
            <td>${e.yogExp }</td>
            <td><a href="updateDev?id=${e.id }">update</a></td>
            <td><a href="deleteDev?id=${e.id }">delete</a></td>
             </tr>
        </c:forEach>
         
     
     </tbody>
   </table>
   
   </div>

</body>
</html> --%>





<%@ page isELIgnored="false" %>

<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Developers</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">

<style>

body{
    background:#0f172a;
    color:white;
}

.table-box{
    margin-top:50px;
    background:white;
    padding:20px;
    border-radius:20px;
    box-shadow:0 20px 40px rgba(0,0,0,0.3);
}

</style>

</head>

<body>

<div class="container mt-4">

    <div class="table-box">

        <nav class="navbar navbar-dark bg-dark rounded px-4 py-3 mb-4">

            <h3 class="text-white mb-0">
                Developer Management 🚀
            </h3>

            <form action="searchDev"
                  method="get"
                  class="d-flex">

                <input type="text"
                       name="name"
                       placeholder="Search Developer..."
                       class="form-control"
                       required>

                <button class="btn btn-success ms-2">
                    Search
                </button>

                <a href="viewData"
                   class="btn btn-info ms-2">
                    Show All
                </a>

            </form>

            <div>

                <a href="dashboard.jsp"
                   class="btn btn-primary me-2">
                    Dashboard
                </a>

                <a href="login.jsp"
                   class="btn btn-danger">
                    Logout
                </a>

            </div>

        </nav>

        <table class="table table-hover table-striped">

            <thead class="table-dark">

                <tr>
                    <th>ID</th>
                    <th>NAME</th>
                    <th>EMAIL</th>
                    <th>POSITION</th>
                    <th>YOE</th>
                    <th>UPDATE</th>
                    <th>DELETE</th>
                </tr>

            </thead>

            <tbody>

                <c:forEach var="d" items="${list}">

                    <tr>

                        <td>${d.id}</td>
                        <td>${d.name}</td>
                        <td>${d.email}</td>
                        <td>${d.position}</td>
                        <td>${d.yogExp}</td>

                        <td>
                            <a href="updateDev?id=${d.id}"
                               class="btn btn-warning btn-sm">
                                Edit
                            </a>
                        </td>

                        <td>
                            <a href="deleteDev?id=${d.id}"
                               class="btn btn-danger btn-sm"
                               onclick="return confirm('Are you sure you want to delete this developer?')">
                                Delete
                            </a>
                        </td>

                    </tr>

                </c:forEach>

                <c:if test="${empty list}">
                    <tr>
                        <td colspan="7"
                            class="text-center text-danger fw-bold">
                            No Developer Found ❌
                        </td>
                    </tr>
                </c:if>

            </tbody>

        </table>

    </div>

</div>

</body>

</html>