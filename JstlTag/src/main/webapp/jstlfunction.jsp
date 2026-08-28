<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isELIgnored="false"%>
<%@ page import="java.util.Arrays"%>
<%@ page import="java.util.List"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

     	<c:set var="str" value="Peter"></c:set>
     	<c:out value="${fn:length(str) }"></c:out>
     	
     	<h2>------------------------------------------------------------------</h2>
     	
     	<c:set var="c" value="html"></c:set>
     	<c:out value="${fn:toUpperCase(c)}"></c:out>
     	
     	<h2>-------------------------------------------------------------------</h2>
     	
     	<c:set var="pet" value="OSTRICHH"></c:set>
     	<c:out value="${fn:toLowerCase(pet) }"></c:out>
     	
     	<h2>--------------------------------------------------------------------</h2>
     	
     	<%-- <c:set var="car" value="porschee911gtrrs"></c:set>
     	<c:out value="${fn.indexOf(car, 'v') }"></c:out> --%>
     	
     	 <h2>------------------------------------------------------------</h2>
     	<c:set var="k" value="app leee"></c:set>
     	<c:out value="${fn:replace(k, 'app', 'mago') }"></c:out> 
     	
</body>
</html>