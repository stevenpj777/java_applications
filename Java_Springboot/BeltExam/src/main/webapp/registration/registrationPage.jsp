<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<%@ page isErrorPage="true" %>    

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
</head>
<body>
    <h1>Register!</h1>
    
 <%--    <p><form:errors path="user.*"/></p> --%>
    
    <form:form method="POST" action="/registration" modelAttribute="user">
         <p>
            <form:label path="firstName">First Name:</form:label>
            <form:input type="text" path="firstName"/>
             <form:errors cssClass="red" path="firstName"/>
        </p>
        <p>
            <form:label path="lastName">Last Name:</form:label>
            <form:input type="text" path="lastName"/>
             <form:errors cssClass="red" path="lastName"/>
        </p>
        <p>
            <form:label path="email">Email:</form:label>
            <form:input type="email" path="email"/>
             <form:errors cssClass="red" path="email"/>
        </p>
         <p>
            <form:label path="city">City:</form:label>
            <form:input type="text" path="city"/>
             <form:errors cssClass="red" path="city"/>
        </p>        <p>
            <form:label path="state">State:</form:label>
            <form:input type="text" path="state"/>
             <form:errors cssClass="red" path="state"/>
        </p>
        <p>
            <form:label path="password">Password:</form:label>
            <form:password path="password"/>
             <form:errors cssClass="red" path="password"/>
        </p>
        <p>
            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
            <form:password path="passwordConfirmation"/>
             <form:errors cssClass="red" path="passwordConfirmation"/>
        </p>
        <input type="submit" value="Register!"/>
    </form:form>
    
</body>
</html>