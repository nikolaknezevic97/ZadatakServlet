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
		
		#formaLogin{
			background-color: #03254c;
			color: white;
			width: 35%;
			height: 40%;
			position: absolute;
			left:35%;
			top: 25%;	
			text-align: center;		
			
		}
		
		#formaLogin h1{
			background-color: #59bfff;
			text-align: center;
		}
		
		#formaLogin input{
		
			border: none;
			background-color: #d9f1ff;
		}
		#formaLogin label{
		
			font-size: 20px;
		}
		
		#cancel{
			
			background-color: #Oda2ff;
			width: 10%;
			height: 10%;
			position: relative;
			top:10px;
			right:10px;
			border:none;
			border-radius: 5px;
		
		}
		
		#cancel:hover{
			
			color:white;
			background-color: green;
		
		}
		
		#edit:hover{
			
			color:white;
			background-color: green;
		
		}
		#edit{
			
			background-color: #Oda2ff;
			width: 10%;
			height: 10%;
			position: relative;
			top:10px;
			left:10px;
			border:none;
			border-radius: 5px;
		
		}
	</style>

</head>
<body>
<header>
		<jsp:include page="/WEB-INF/pages/logout/logout.jsp" flush="true"/>
	</header>
	<div>
						
		
		<form action="/webApp/application/edit" method="post" id="formaLogin">
		<h1>Izabrani proizvodjac: </h1>
					<label>IdProizvodjaca: </label> <input type="text" name="idProizvodjaca"
						value="${proizvodjac.idProizvodjaca}" readonly="readonly" /> <br>
					<label>PIB</label> <input type="text" name="pib"
						value="${proizvodjac.pib}" readonly="readonly" /> <br>
						<label>Maticni broj: </label> <input type="text" name="maticniBroj"
						value="${proizvodjac.maticniBroj}" readonly="readonly" /> <br>
					<label>Adresa</label> <input type="text" name="adresa"
						value="${proizvodjac.adresa}" readonly="readonly" /> <br>
						<label>Ptt broj: </label> <input type="text" name="ptt_broj"
						value="${proizvodjac.city.ptt_broj}" readonly="readonly" /> <br>						
					
						<input type="submit" value="Cancel" name="Cancel" id="cancel">			
						
						<input type="submit" value="Edit" name="Edit" id="edit">
					
	
				</form>
	</div>
	
	
	
	
</body>
</html>
