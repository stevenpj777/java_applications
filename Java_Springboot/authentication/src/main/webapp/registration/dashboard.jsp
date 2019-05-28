<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<link rel="stylesheet" href="/css/main.css">
	<title>Songs</title>
	<style>
	.top {
	display: flex;
	}
	</style>
<body>

	<h1>Welcome, <c:out value="${user.name}" /></h1>
	<div id="container">
			<div class="top">
			<a href="/songs/new"><h2>Add New</h2></a>

		</div>
		<table class="table table-striped table-hover table-bordered tblbrd">
		    <thead>
		        <tr>
		            <th scope="col">Title</th>
		            <th scope="col">Show</th>
		            <th scope="col">Rating</th>
       	            <th scope="col">Action</th>  
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${songs}" var="song">
		        <tr>
		            <td><a href="songs/<c:out value="${song.id}"/>"><c:out value="${song.title}"/></a></td>
         		    <td><a href="songs/<c:out value="${song.id}"/>"><c:out value="${song.title}"/></a></td>
		           
		            <td><c:out value="${song.artist}"/></td>
		            <td><c:out value="${song.rating}"/></td>
		            <td><a href="/shows/delete/<c:out value="${song.id}"/>">Delete</a> <a href="shows/edit/<c:out value="${song.id}"/>">Edit</a></td>
		           <td><a href="/shows/delete/<c:out value="${song.id}"/>">Delete</a> <a href="shows/<c:out value="${song.id}"/>/edit">Edit</a></td>
		            
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>

	</div>
</body>
</html>