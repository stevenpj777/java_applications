<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<%@ page isErrorPage="true" %>    

    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
    <h1>Login</h1>
    <p><c:out value="${error}" /></p>
    <form method="post" action="/login">
        <p>
            <label for="email">Email</label>
            <input type="text" id="email" name="email"/>
           <form:errors cssClass="red" path="email"/>
            
        </p>
        <p>
            <label for="password">Password</label>
            <input type="password" id="password" name="password"/>
             <form:errors cssClass="red" path="password"/>
            
        </p>
        <input type="submit" value="Login!"/>
    </form>    
</body>
</html>