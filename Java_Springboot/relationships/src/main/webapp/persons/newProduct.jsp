<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Product</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css">
</head>
<body>

<div id="form">
			<form:form action="/products/new" method="post" modelAttribute="product">		  
				
				<p>
			        <form:label cssClass="label" path="name">Name</form:label>
			        <form:input cssClass="box" path="name"/>
			        <form:errors cssClass="red" path="name"/>
				</p>
			    <p>
			        <form:label cssClass="label" path="description">Description</form:label>
			        <form:input type="textarea" cssClass="textarea" path="description"/>
			        <form:errors cssClass="red" path="description"/>

			    </p>
 			    <p>
			        <form:label cssClass="label" path="price">Price</form:label>
			        <form:input cssClass="box" path="price"/>
    				<form:errors cssClass="red" path="price"/>
			    </p> 

			    <input id="btn" type="submit" value="Submit"/>	 
			</form:form>
		</div> 
</body>
</html>