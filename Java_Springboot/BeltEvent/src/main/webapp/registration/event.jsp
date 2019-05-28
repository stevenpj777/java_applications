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
			<form:form action="/createEvent" method="post" modelAttribute="event">		  
				
	
			    <p>
			        <form:label cssClass="label" path="name">Name</form:label>
			        <form:input cssClass="box" path="name"/>
			        <form:errors cssClass="red" path="name"/>
			    </p>
 			    <p>
			        <form:label cssClass="label" path="date"> Date</form:label>
			        <form:input type="date" cssClass="box" path="date"/>
    				<form:errors cssClass="red" path="date"/>
			    </p> 
			    <p>
			        <form:label cssClass="label" path="city">City</form:label>
			        <form:input cssClass="box" path="city"/>
			        <form:errors cssClass="red" path="city"/>
			    </p>
			   	<p>
			        <form:label cssClass="label" path="state">State</form:label>
			        <form:input cssClass="box" path="state"/>
			        <form:errors cssClass="red" path="state"/>
			    </p>

			    <input id="btn" type="submit" value="Submit"/>	 
			</form:form>
		</div>  
</body>
</html>



