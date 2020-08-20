<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="deleteEmp" method="post">
<p>
Enter Employee id:
<input type="number" name="id" id="id" required>
</p>
<input type="submit" value="submit" onClick = "this.style.visibility= 'hidden';">
</form>
<h4>${msg }</h4>
</body>
</html>