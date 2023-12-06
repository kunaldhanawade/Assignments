<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Choose Products</h1>
	<form action="SecondServ" method="post">
		<c:forEach var="i" items="${requestScope.pnames}">
			<input type="checkbox" name="ck" value="${i}">${i}
			<br/>
		</c:forEach>
		<br/>
		<input type="submit" value="Add To Cart">
	</form>
</body>
</html>