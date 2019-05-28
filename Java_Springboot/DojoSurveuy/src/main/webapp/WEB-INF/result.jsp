<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>

 <script type="text/javascript" src="js/script.js"></script>
 <style>
  .container {
    display: flex;
    justify-content: center;
    height: 500px;
    width: 900px;
  }
  .results {
    border: 1px solid black;
    width: 500px;
  }
  h1 {
    text-decoration: underline;
  }
</style>
</head>
<body>

  
<div class="container">
  <div class="results">
    <h1>Submitted Info</h1>
    <p>Name: <c:out value="${name}" /></p>
    <p>Dojo Location: <c:out value="${location}" /></p>
    <p>Favorite Language: <c:out value="${language}" /></p>
    <p>Commenst: <c:out value="${comments}" /></p>
  </div>

</div>

</body>
</html>