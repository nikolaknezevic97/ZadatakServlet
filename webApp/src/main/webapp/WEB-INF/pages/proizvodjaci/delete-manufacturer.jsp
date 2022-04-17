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
			height: 30%;
			position: absolute;
			left:35%;
			top: 25%;	
			text-align: center;		
			
		}
		
		#formaLogin h1{
			background-color: #59bfff;
			text-align: center;
			font-size: 30px;
		}
		
		#formaLogin input{
		
			border: none;
			background-color: #d9f1ff;
		}
		#formaLogin label{
		
			font-size: 30px;
			font-weight: bold;
		}
		
		
		
		#delete{
			
			background-color: #Oda2ff;
			width: 10%;
			height: 10%;
			position: relative;
			top:10px;
			right:50px;
			border:none;
			border-radius: 5px;
		
		}
		
		#delete:hover{
			
			color:white;
			background-color: green;
		
		}
		
		#back:hover{
			
			color:white;
			background-color: green;
		
		}
		#back{
			
			background-color: #Oda2ff;
			width: 10%;
			height: 10%;
			position: relative;
			bottom:17px;
			left:50px;
			border:none;
			border-radius: 5px;
		
		}
	 #polje{
	 		
	 		height: 10%;
	 		position:relative;
	 		bottom: 3px;
	 	
	 }
	</style>

</head>
<body>
	<header>
		<jsp:include page="/WEB-INF/pages/logout/logout.jsp" flush="true"/>
	</header>
	<div>
		<form action="/webApp/application/delete" method="post" id="formaLogin">
		<h1>Izbrisi proizvodjaca</h1>
		<label>IdProizvodjaca:</label> <input type="text" value="" name="idProizvodjaca" id="polje"><br>
				<input type="submit" name="Delete" value="Delete" id="delete"><br>
				<input type="submit" name="Back" value="Back" id="back"><br>
		<p>${massage}</p>
	</form>
	
	</div>
	
	
	
	
	
</body>
</html>
