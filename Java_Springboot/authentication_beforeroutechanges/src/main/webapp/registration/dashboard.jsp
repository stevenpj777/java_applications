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
	.button {
	  font-size: 20px;
  color: white;
  font-weight: bold;
  margin-top: 20px;
  vertical-align: top;
  padding-top: 10px;
  width: 175px;
  background-color: blue;
   display: inline-block;
   padding: 5px;
   border-radius: 5px;
   text-align: center;
   text-decoration: none;
	}


	</style>
<body>

	<h1>TV Shows <c:out value="${user.name}" /></h1>
	<div id="container">

		<table class="table table-striped table-hover table-bordered tblbrd">
		    <thead>
		        <tr>
		            <th scope="col">Title</th>
		            <th scope="col">Show</th>
<!--        	            <th scope="col">Action</th>  
 -->		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${songs}" var="song">
		        <tr>
<%-- 		            <td><a href="songs/<c:out value="${song.id}"/>"><c:out value="${song.title}"/></a></td>
		             --%>
		          	<td><a href="shows/<c:out value="${song.id}"/>"><c:out value="${song.title}"/></a></td>
		           
		            <td><c:out value="${song.artist}"/></td>
<%-- 		            <td><a href="/songs/delete/<c:out value="${song.id}"/>">Delete</a> <a href="songs/edit/<c:out value="${song.id}"/>">Edit</a></td>
 --%>		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
	</div>
	<div>
		<a class="button" href="/songs/new"><h2>Add New</h2></a>
	
	</div>
</body>
</html>