<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<%@ page isErrorPage="true" %>    
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Welcome</title>
</head>
<body>
	<h1>Welcome, <c:out value="${user.email}" /></h1>
	<a href="/logout">Logout</a>
	
	<form action="/users/logout" method="get">
	<p>
		<input type="submit" value="Logout">
	</p>
	</form>
	
		<div id="lftpnl">
			<h2>Create an Event:</h2>
			<form:form method="post" action="/events/new" modelAttribute="event">
				<h4>
	           		 <form:label path="name">Name:</form:label>
            			<form:input type="text" path="name"/>
            	 		<form:errors cssClass="red" path="name"/>
				</h4>
				
				<h4>
					<form:label path="date">Date:</form:label>
					<form:input cssClass="fields" type="date" path="date"/>
					<form:errors cssClass="red" path="date"/>
				</h4>
				
				<h4>
	            	<form:label path="city">City:</form:label>
            		<form:input type="text" path="city"/>
            		 <form:errors cssClass="red" path="city"/>
				</h4>
				<h4>
	            	<form:label path="state">State:</form:label>
            		<form:input type="text" path="state"/>
            		 <form:errors cssClass="red" path="state"/>
				</h4>
				
				
				<input class="btn" type="submit" value="Create Event"/>
			</form:form>
			<form:errors cssClass="red" path="eventObj.*"/>
		</div>
</body>
</html>


