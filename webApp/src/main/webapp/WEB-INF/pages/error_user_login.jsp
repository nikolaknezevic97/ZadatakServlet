<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ERROR PAGE!!!</title>
</head>
<body>
	
	<div>
		<p style="color:red">Korisnik se vec prijavio!!!</p>
	</div>
	
		<c:url value="/application/logout" var="urlLogout"></c:url>
		<a href="${urlLogout}">Vratite se na pocetnu stranu</a>
</body>
</html>