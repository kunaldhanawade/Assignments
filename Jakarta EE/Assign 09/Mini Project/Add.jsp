<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddServlet" method="post">
		Enter student name: <input type="text" name="name">
		<br><br>
		Enter student address: <input type="text" name="address">
		<br><br>
		Select persistence store: 
		<select name="persistenceStore">
			<option value="file">File</option>
			<option value="database">Database</option>
		</select>
		<br><br>
		<input type="submit">
	</form>
</body>
</html>