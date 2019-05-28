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
<p><c:out value="${error }" /> </p>

<form class="myForm method="POST" action="/results">

  <div class="row">
    <div class="column">
      <div class="input-group">
        <label for="customer_name">Your name </label>
        <input id="customer_name" name="name">
      </div>
      <div class="input-group">
        <label for="location">Dojo Location</label>
        <select id="location" name="location">
          <option value="Seattle" selected="selected">Seattle</option>
          <option value="San Jose" >San Jose</option>
          <option value="New York" >New York</option>
          <option value="Boston" >Boston</option>
        </select>
      </div>
      <div class="input-group">
        <label for="language">Favorite Language</label>
        <select id="language" name="language">
          <option value="Python" selected="selected">Python</option>
          <option value="Java" >Java</option>
          <option value="C#" >C#</option>
          <option value="Visual Basic" >Visual Basic</option>
        </select>
      </div>
      <div class="col-125">
            <textarea id="subject" name="comments" placeholder="Write something.." style="height:200px"></textarea>
      </div>
    </div>

  </div>

  <div class="row">

    <button id="submit">Submit</button>

  </div>
</form>


<%-- <h1>Welcome, <c:out value="${dojoName}" /></h1> --%>
</body>
</html>