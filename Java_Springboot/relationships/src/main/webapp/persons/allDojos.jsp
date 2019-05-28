

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css">
<title>Search</title>
</head>
<body>
	<Div class="container">
		<h1><c:out value="${dojo.name}"/></h1>
		<table class="table table-striped table-hover table-bordered tblbrd blkbrd">
		    <thead>
		        <tr>
		            <th scope="col">First Name</th>
		            <th scope="col">Last Name</th>
		            <th scope="col">Age</th>
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${ninjas}" var="ninja">
		        <tr>
		            <td><a href="songs/<c:out value="${ninja.id}"/>"><c:out value="${ninja.firstName}"/></a></td>
		            <td><c:out value="${ninja.lastName}"/></td>
		             <td><c:out value="${ninja.age}"/></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
	</Div>
</body>
</html>