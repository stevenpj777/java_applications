<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css">
</head>
<body>
<h1>Product Page for <c:out value="${product.getName()}"/> </h1>
 	<div id="form">
			<form:form action="/products/new" method="post" modelAttribute="product">		  
				
				<p>
				<form:label cssClass="label left" path="name">Category:</form:label>
			        <form:select cssClass="box" path="name">
						<c:forEach items="${categorylist}" var="cat">
							<form:option value="${cat.id}"><c:out value="${cat.name}"/></form:option>
						</c:forEach>c:forEach>
					</form:select>
				</p>

			    <input id="btn" type="submit" value="Submit"/>	 
			</form:form>
			<br><br><br><br><br>
		</div>  
		
		
		     <form action="/products/${product.id}/addCategory" method="post">
            <select name="category">
            <c:forEach items="${categorylist}" var="category">
                <c:if test="${!product.categories.contains(category)}">
                    <option value="${category.id}">${category.name}</option>
                </c:if>
            </c:forEach>
            </select>
            <input type="submit" value="Add" class="btn btn-primary"/>
        </form>
		
		<br>
		
			<table class="table table-striped table-hover table-bordered tblbrd">
		    <thead>
		        <tr>
		            <th scope="col">Category</th>
		
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${categorylist}" var="cat">
		        <tr>
		            <td><a href="songs/<c:out value="${cat.id}"/>"><c:out value="${cat.name}"/></a></td>
		            
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
</body>
</html>



