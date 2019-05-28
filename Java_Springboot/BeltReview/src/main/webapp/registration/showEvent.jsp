<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<%@ page isErrorPage="true" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${event.name}</h1>
	

	<p>Date: ${event.date }</p>
	<p>Location: ${event.city }, ${event.state}</p>
	<p>People attending: ${event.users.size() }</p>
	
 <table>
  <tr>
    <th>Name:</th>
    <th>Location:</th>
  </tr>
  <c:forEach items="${event.users}" var="user">
      <tr>
          <td>${user.name}</td>
          <td>${user.city}, ${user.state}</td>
      </tr>
  </c:forEach>
</table>

<h1>Message Wall</h1>

 <c:forEach items="${event.messages}" var="msg">
  <p>${msg.text}</p>
  </c:forEach> 

  <h3>Add Message</h3>
  <form:form action="/events/messages/new" method="post" modelAttribute="message">
      <h4>
          <form:label path="text">Text:</form:label>
          <form:input type="text" path="text"/>
          <form:errors cssClass="red" path="text"/>
      </h4>
  </form:form>   
	 
</body>
</html>