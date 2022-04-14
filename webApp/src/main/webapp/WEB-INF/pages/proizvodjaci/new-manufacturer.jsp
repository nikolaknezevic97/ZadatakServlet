<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<style>
		table{
			border: 1px solid black;
			background-color: yellow;
			font-family:Arial;
		}
		th,td{
		border: 1px solid black;
		
		}
		
		body{
			margin:0;
			padding: auto;
			background-color: #add8e6;
		}
		
		#tabela{
			
			position:absolute;
			top:30%;
			left:30%
		}
	
	</style>

</head>
<body>
	<div>
	<form action="/webApp/application/confirm" method="post">
		<h1>Unesi novog proizvodjaca</h1>
		IdProizvodjaca: <input type="text" value="" name="idProizvodjaca"><br>
		Pib: <input type="text" value="" name="pib"><br>
		Maticni broj: <input type="text" value="" name="maticniBroj"><br>
		Adresa: <input type="text" value="" name="Adresa"><br>
		PTT Broj: <input type="text" value="" name="pttBroj"><br>
		Naziv grada: <input type="text" value="" name="nazivGrada"><br>
		<input type="submit" name="Submit" value="Submit"><br>
		<p>${poruka}</p>
	</form>
	</div>
	
	
	
	
	
</body>
</html>
