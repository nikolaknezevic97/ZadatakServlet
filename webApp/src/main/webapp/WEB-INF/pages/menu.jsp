<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<style>
		body{
			background-color: lightgreen;
			color: gray;
			margin:0;
		}
	
	
	</style>

</head>
<body>
	<div id="menu">
	<h2>Dobrodosli na meni na nasoj aplikaciji</h2>
	<a href="/webApp/application/viewManufacturer">Prikaz svih proizvodjaca</a>
	<a href="/webApp/application/newManufacturer">Unos novog proizvodjaca</a>
	<a href="/webApp/application/deleteManufacturer">Izbrisi proizvodjaca</a>
	<p>${massage}</p>
	<p>${Poruka}</p>
	</div>
</body>
</html>
