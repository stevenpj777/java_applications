<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css">
</head>
<body>

<div id="form">
			<form:form action="/persons/new" method="post" modelAttribute="person">		  
			    <p>
			        <form:label cssClass="label" path="lastName">First Name</form:label>
			        <form:input cssClass="box" path="lastName"/>
			        <form:errors cssClass="red" path="lastName"/>

			    </p>
			    <p>
			        <form:label cssClass="label" path="firstName">Last Name</form:label>
			        <form:input cssClass="box" path="firstName"/>
    				<form:errors cssClass="red" path="firstName"/>
			    </p>

			    <input id="btn" type="submit" value="Submit"/>	 
			</form:form>
		</div> 
</body>
</html>