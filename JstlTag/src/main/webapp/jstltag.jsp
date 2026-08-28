<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ page import="java.util.Arrays"%>
<%@ page import="java.util.List"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  this is used to create variable inside jsp -->
	<c:set var="a" value="20"></c:set>

	<!-- this is udes to print varibvale value on browser -->
	<c:out value="${a }"></c:out>


	<h2>-- --- -- -- --- -- --- --- ---- ---- ---- --- ---- ---- ---</h2>


	<%
	request.setAttribute("name", "Peter");
	%>

	<c:out value="${name}"></c:out>


	<h2>-- --- -- -- --- -- --- --- ---- ---- ---- --- ---- ---- ---</h2>

	<%
	session.setAttribute("password", "root");
	%>
	<h3>
		<c:out value="${password }"></c:out>
	</h3>


	<h2>-- --- -- -- --- -- --- --- ---- ---- ---- --- ---- ---- ---</h2>


	<c:set var="a" value="50"></c:set>
	<c:set var="b" value="20"></c:set>

	<c:if test="${a > b }">
		<h2>
			<c:out value="${a}"></c:out>
			: is biggerrr
		</h2>
	</c:if>


	<h2>-- --- -- -- --- -- --- --- ---- ---- ---- --- ---- ---- ---</h2>


	<c:set var="e" value="30"></c:set>
	<c:set var="f" value="50">
	</c:set>
	<c:set var="g" value="60"></c:set>

	<c:choose>
		<c:when test="${e > f }">
			<h3>
				<c:out value="${e }"></c:out>
			</h3>
		</c:when>

		<c:otherwise>
			<h3>
				<c:out value="${f }"></c:out>
			</h3>
		</c:otherwise>
	</c:choose>


	<h2>-- --- -- -- --- -- --- --- ---- ---- ---- --- ---- ---- ---</h2>


	<%
	List<String> list = Arrays.asList("Red", "Yello", "Blue", "Black");
	request.setAttribute("list", list);
	%>

	<c:forEach var="s" items="${list }">
		<c:out value="${s  }"></c:out>
	</c:forEach>

	<h2>-- --- -- -- --- -- --- --- ---- ---- ---- --- ---- ---- ---</h2>


	<c:forEach var="i" begin="1" end="5">
		<h3>
			<c:out value="${i }"></c:out>
		</h3>
	</c:forEach>
	
	
	




</body>
</html>