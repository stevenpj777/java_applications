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
	<div id="container">
			<div class="top">
			<a href="/songs/new"><h2>Add New</h2></a>
			<a href="/search/topten"><h2>Top Songs</h2></a>
			<div class="formright">
				<form action="/search" method="post">
					<input class="form" type="search" name="artist" placeholder="Artist">
					<input class="form" type="submit" value="Search Artists">		
				</form>
			</div>
		</div>
		<table class="table table-striped table-hover table-bordered tblbrd">
		    <thead>
		        <tr>
		            <th scope="col">Title</th>
		            <th scope="col">Artist</th>
		            <th scope="col">Rating</th>
       	            <th scope="col">Action</th>  
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${songs}" var="song">
		        <tr>
		            <td><a href="songs/<c:out value="${song.id}"/>"><c:out value="${song.title}"/></a></td>
		            <td><c:out value="${song.artist}"/></td>
		            <td><c:out value="${song.rating}"/></td>
		            <td><a href="/songs/delete/<c:out value="${song.id}"/>">Delete</a> <a href="songs/edit/<c:out value="${song.id}"/>">Edit</a></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>

	</div>
</body>
</html>