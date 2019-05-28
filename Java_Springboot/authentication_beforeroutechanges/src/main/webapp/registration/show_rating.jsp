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
<title><c:out value="${song.title}"/></title>

<style>


.purchase a !important; {
  font-size: 20px;
  color: white;
  font-weight: bold;
  margin-top: 20px;
  vertical-align: top;
  padding-top: 10px;
  width: 125px;
  background-color: orange;
   display: inline-block;
   padding: 5px;
   border-radius: 5px;
   text-align: center;
   text-decoration: none;
}

.bottom !important {
display: flex;

}

</style>
<!-- 
</head> -->
<body>
	<div id="container">

		<h1 class="gap"><c:out value="${song.title}"/></h1>
<%--  		<h1 class="gap"><c:out value="${song.artist}"/>Network</h1>
 --%> 		<h1>Network<c:out value="${song.artist}"/></h1>
 		
<%-- 		<h1 class="gap"><c:out value="${song.rating}"/></h1>
 --%>		<a class="purchase" href="/songs/edit/<c:out value="${song.id}"/>"><h1 class="gap">Edit</h1></a>
<%-- 		<a href="/songs/delete/<c:out value="${song.id}"/>"><h1 class="gap">Delete</h1></a>
 --%>	</div>
	
	<div class="bottom">
			<h2>Leave a rating</h2>
			<div class="formright">
				<form action="/rating" method="post">
					<input class="form" type="search" name="artist" placeholder="">
					<input class="form" type="submit" value="Rate!">		
				</form>
			</div>
	</div>
</body>
</html>