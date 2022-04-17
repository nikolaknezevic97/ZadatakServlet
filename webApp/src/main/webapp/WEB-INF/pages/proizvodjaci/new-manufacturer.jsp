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
		
		#submit{
			
			background-color: #Oda2ff;
			width: 10%;
			height: 10%;
			position: relative;
			top:10px;
			right:10px;
			border:none;
			border-radius: 5px;
		
		}
		
		#submit:hover{
			
			color:white;
			background-color: green;
		
		}
		
		#Nazad:hover{
			
			color:white;
			background-color: green;
		
		}
		#Nazad{
			
			background-color: #Oda2ff;
			width: 10%;
			height: 10%;
			position: relative;
			top:10px;
			left:20px;
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
	<form action="/webApp/application/confirm" method="post" id="formaLogin">
		<h1>Unesi novog proizvodjaca</h1>
		IdProizvodjaca: <input type="text" value="" name="idProizvodjaca"><br>
		Pib: <input type="text" value="" name="pib"><br>
		Maticni broj: <input type="text" value="" name="maticniBroj"><br>
		Adresa: <input type="text" value="" name="Adresa"><br>
		ZipCode:<select class="form-select" aria-label="Default select example" name="cityPtt">
					<c:forEach items="${cities}" var="c">
						<option value="${c.ptt_broj}" name="cityOptionPtt">${c.ptt_broj}</option>					
					</c:forEach>		
				</select><br>
		<input type="submit" name="Submit" value="Submit" id="submit">
		<input type="submit" name="Nazad" value="Nazad" id="Nazad"></a>
		<p>${poruka}</p>
	</form>
	
	</div>
	
	
	
	
	
</body>
</html>
