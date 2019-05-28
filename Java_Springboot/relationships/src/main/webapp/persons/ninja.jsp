x<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Ninja</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css">
</head>
<body>

<div id="form">
			<form:form action="/ninjas/new" method="post" modelAttribute="ninja">		  
				
				<p>
				<form:label cssClass="label left" path="dojo">Dojo:</form:label>
			        <form:select cssClass="box" path="dojo">
						<c:forEach items="${dojoslist}" var="per">
							<form:option value="${per.id}"><c:out value="${per.name}"/></form:option>
						</c:forEach>c:forEach>
					</form:select>
				</p>
			    <p>
			        <form:label cssClass="label" path="firstName">First Name</form:label>
			        <form:input cssClass="box" path="firstName"/>
			        <form:errors cssClass="red" path="firstName"/>

			    </p>
   			    <p>
			        <form:label cssClass="label" path="lastName">Last Name</form:label>
			        <form:input cssClass="box" path="lastName"/>
			        <form:errors cssClass="red" path="lastName"/>

			    </p>
  			    <p>
			        <form:label cssClass="label" path="age">Age</form:label>
			        <form:input cssClass="box" path="age"/>
			        <form:errors cssClass="red" path="age"/>

			    </p>

			    <input id="btn" type="submit" value="Submit"/>	 
			</form:form>
		</div> 
</body>
</html>