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
			<form:form action="/licenses/new" method="post" modelAttribute="license">		  
				
				<p>
				<form:label cssClass="label left" path="person">Person:</form:label>
			        <form:select cssClass="box" path="person">
						<c:forEach items="${personslist}" var="per">
							<form:option value="${per.id}"><c:out value="${per.firstName} ${per.lastName}"/></form:option>
						</c:forEach>c:forEach>
					</form:select>
				</p>
			    <p>
			        <form:label cssClass="label" path="state">State</form:label>
			        <form:input cssClass="box" path="state"/>
			        <form:errors cssClass="red" path="state"/>

			    </p>
 			    <p>
			        <form:label cssClass="label" path="expirationDate">Expiration Date</form:label>
			        <form:input type="date" cssClass="box" path="expirationDate"/>
    				<form:errors cssClass="red" path="expirationDate"/>
			    </p> 

			    <input id="btn" type="submit" value="Submit"/>	 
			</form:form>
		</div> 
</body>
</html>



