<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="js/script.js"></script>
</head>
<body>

<div class="container">
	<div class="box">
		<a href="/date">Date Template</a>
	</div>
	<div class="box">
		<a href="/time">Time Template</a>
	</div>
</div>

<h1>Welcome, <c:out value="${dojoName}" /></h1>
</body>
</html>