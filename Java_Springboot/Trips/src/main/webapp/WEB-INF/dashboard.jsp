<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css">
<title>Events</title>
</head>
<body>
	<div id="container">
		<h1>Welcome, <c:out value="${user.lastName}"/></h1>
		<a href="/logout"><h2>Logout</h2></a>
		<h2>Here are some of the events in your state:</h2>
		<c:if test="${trips.size() == 0}"><h5>There are currently no events in your area...</h5></c:if>
        <c:if test="${trips.size() > 0}">
			<table class="table table-striped table-bordered table-hover">
				<thead>
	  				<tr>
	    				<th>Name</th>
					    <th>Date</th>
					    <th>Location</th>
					    <th>Host</th>
					    <th>Action/Status</th>
	  				</tr>
				</thead>
				<tbody>
					<c:forEach items="${trips}" var="trip">
	  				<tr>
	  					<td><a href="/events/${trip.id}"><c:out value="${trip.name}"/></a></td>
					    <td><fmt:formatDate pattern ="MMMM dd, yyyy" value ="${trip.date}"/></td>
					    <td><c:out value="${trip.location}"/></td>
					    <td><c:out value="${trip.user.firstName}"/></td>
                        <c:choose>
                        <c:when test="${trip.user == user}">
                            <td>*Attending* | <a href="/events/${trip.id}/edit">Edit</a> | <a href="events/${trip.id}/delete">Delete</a></td>
                        </c:when>
                        <c:otherwise>
                            <c:set var="attending" value="${false}"/>
                            <c:forEach items="${trip.getJoinedUsers()}" var="attendee">
                                <c:if test="${attendee == user}">
                                    <c:set var="attending" value="${true}"/>
                                </c:if>
                            </c:forEach>
                            <c:choose>
                                <c:when test="${attending == false}">
                                    <td><a href="/events/${trip.id}/join">Join</a></td>
                                </c:when>
                                <c:otherwise>
                                    <td>*Attending* | <a href="events/${trip.id}/cancel">Cancel</a></td>
                                </c:otherwise>
                            </c:choose>
                        </c:otherwise>
                        </c:choose>  
	  				</tr>
	  				</c:forEach>
				</tbody>
			</table>
		</c:if>

		<div>
			<h2>Create an Event:</h2>
			<form:form method="post" action="/addevent" modelAttribute="eventObject">
				<h4>
					<form:label path="name">Name:</form:label>
					<form:input cssClass="fields" type="text" path="name"/>
				</h4>
				<h4>
					<form:label path="date">Date:</form:label>
					<form:input cssClass="fields" type="date" path="date"/>
				</h4>
				<h4>
					<form:label path="location">Location:</form:label>
					<form:select cssClass="state" path="state">
						<c:forEach items="${states}" var="state">
							<form:option value="${state}"><c:out value="${state}"/></form:option>
						</c:forEach>
					</form:select>
					<form:input type="text" path="location"/>
				</h4>
				<form:hidden path="user" value="${user.id}"/>
				<input type="submit" value="Create"/>
			</form:form>
			<form:errors path="eventObject.*"/>
		</div>
		<div>
		</div>
	</div>
</body>
</html>