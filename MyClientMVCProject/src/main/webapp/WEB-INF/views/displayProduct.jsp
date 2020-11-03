<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> List of Products</h1>
<table border='2'>
  <tr><th>Prod id</th><th>Product name</th><th>Price</th><th>Description</th></tr>
<c:forEach var="p" items="${plist}">
<tr><td>${p.pid}</td><td>${p.pname}</td><td>${p.price}</td><td>${p.pdesc}</td><td>
<a href="deleteproduct/${p.pid}">delete</a>/
<a href="editproduct/${p.pid}">edit</a>

</td></tr>
</c:forEach>
</table>
<a href="showform">Add Product</a>
</body>
</html>