<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.c1{
    visibility:hidden;
}
</style>
</head>
<body>
<form action="update" method="post">
<c:forEach var="l" items="${list}">
<p>
<input type="hidden" id="id" name="id" value='<c:out value="${l.id}"></c:out>' required>
</p>
<p>Name:
<input type="text" name="name" value='<c:out value="${l.name}"></c:out>' required>
</p>
<p>Gender:
<label class="c1">
<input type="radio" id="male" name="gender" value="${l.gender}" checked>
</label>
<input type="radio" id="male" name="gender" value="male">
<label for="male">Male</label>
<input type="radio" id="female" name="gender" value="female">
<label for="female">Female</label>
<input type="radio" id="other" name="gender" value="other">
<label for="other">Other</label>
</p>
<p>Designation:
<input type="text" name="designation" id="designation" value='<c:out value="${l.designation}"></c:out>' required>
</p>
<p>Salary:
<input type="number" name="salary" id="salary" value='<c:out value="${l.salary}"></c:out>' required>
</p>
<p>City:
<input type="text" name="city" id="city" value='<c:out value="${l.city}"></c:out>' required>
</p>
<p>Email Id:
<input type="email" name="email" id="email" value='<c:out value="${l.email}"></c:out>' required>
</p>
<p>Mobile number:
<input type="number" name="mobile" id="mobile" value='<c:out value="${l.mobile}"></c:out>' required>
</p>
</c:forEach>
<p>
<input type="submit" value="Update">
</form>
</body>
</html>