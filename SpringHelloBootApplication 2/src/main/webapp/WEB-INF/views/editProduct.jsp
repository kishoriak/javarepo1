<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/SpringMVCDemo/updateProduct">
Product Id: <input type="text" name="pid" value="${prod.pid }">
   Product Name: <input type="text" name="pname" value="${prod.pname}">
   Product price :<input type="text" name="price" value="${prod.price}">
   <input type="submit" name="btn" value="update">
    
</form>
</body>
</html>