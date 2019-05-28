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
    <style>
    	.container {
    	width: 600px;
    	}
	   .myForm {
	   	 justify-content: center;
	        align-items: center;
	   		width: 300px;
	       display: flex;
    		flex-direction: column;
	   }
   
    </style>
</head>
<body>
<p><c:out value="${error }" /> </p>

<div class="container">
	<form class="myForm" method="POST" action="/code">
		<p>What is the code?</p>
	   <input type="text" name="code">
	    <button>Try code</button>
	</form>
	
	
</div>

<%-- <h1>Welcome, <c:out value="${dojoName}" /></h1> --%>
</body>
</html>