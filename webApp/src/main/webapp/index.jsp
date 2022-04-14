<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

<style>
	
	#forma{
		background-color: aqua;
		position: absolute;
		top:30%;
		left:40%;
	}
	body{
		margin: none;
		background: blue;
		
	}

</style>
</head>
<body>

	
	<div id="forma">
	<h2>Prijavite se na nasu aplikaciju</h2>
		<form action="/webApp/application/menu" method="post">
			<div>
				<p style="color:red;">${error_message}</p>
			</div>			
			username:
			<div>
				<input type="text" name="username" value="">
			</div>			
			password:
			<div>
				<input type="password" name="password" value="">
			</div>	<br>
			<div>
				<input type="submit" name="login" value="Prijavi se">
			</div>
		</form>
	</div>
</body>
</html>
