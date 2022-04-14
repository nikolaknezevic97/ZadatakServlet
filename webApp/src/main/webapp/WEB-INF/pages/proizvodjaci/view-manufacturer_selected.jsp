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
		<h1>Izabrani proizvodjac: </h1>
		<form>
					<label>IdProizvodjaca</label> <input type="text" name="idProizvodjaca"
						value="${proizvodjac.idPorizvodjaca}" readonly="readonly" />
					 <label>Pib</label>
					<input type="text" name="Pib" value="${proizvodjac.pib}"
						readonly="readonly" />
						 <label>Maricni broj</label>
					<input type="text" name="MaticniBroj" value="${proizvodjac.maticniBroj}"
						readonly="readonly" />
						 <label>Adresa</label>
					<input type="text" name="Adresa" value="${proizvodjac.adresa}"
						readonly="readonly" />
						 <label>PTT BROJ</label>
					<input type="text" name="pttBroj" value="${proizvodjac.city.ptt_broj}"
						readonly="readonly" />
						 <label>Grad</label>
					<input type="text" name="Grad" value="${proizvodjac.city.grad}"
						readonly="readonly" />
					
					<div>
						<input type="submit" value="Cancel">
					</div>
					
					<div>
						<input type="submit" value="Edit">
					</div>
	
				</form>
	</div>
	
	
	
	
</body>
</html>
