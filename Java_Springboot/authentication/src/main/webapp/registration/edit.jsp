<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
</head>
<body>
	<div id="container">
	<div id="top">
		<a href="/songs"><h1 class="shift">Dashboard</h1></a>
		<a href="/songs/delete/<c:out value="${song.id}"/>"><h1 class="shift">Delete</h1></a>
	</div>
		<form:form action="/songs/${song.id}" method="post" modelAttribute="song">
		    <input type="hidden" name="_method" value="put">
			    <p>
			        <form:label cssClass="label" path="title">Show</form:label>
			        <form:input cssClass="box" path="title"/>
			        <form:errors cssClass="red" path="title"/>

			    </p>
			    <p>
			        <form:label cssClass="label" path="artist">Network</form:label>
			        <form:input cssClass="box" path="artist"/>
    				<form:errors cssClass="red" path="artist"/>
			    </p>
<%-- 			    <p>
			        <form:label cssClass="label" path="rating">Rating</form:label>
			        <form:input cssClass="box" path="rating"/>
     		 		<form:errors cssClass="red" path="rating"/>
			    </p> --%>
		    <input id="btn" type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>