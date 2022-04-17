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
			background-color:#03254c ;
		}
		
		#tabela{
			
			position:absolute;
			top:30%;
			left:30%
		}
		
		#formaLogin{
			background-color: grey;
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
		
		#save{
			
			background-color: #Oda2ff;
			width: 10%;
			height: 10%;
			position: relative;
			top:10px;
			right:10px;
			border:none;
			border-radius: 5px;
		
		}
		
		#save:hover{
			
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
		<form action=/webApp/application/save id="formaLogin">
		<h1>Editovanje proizvodjaca</h1>
		<label>IdProizvodjaca: </label> <input type="text" name="idProizvodjaca"
						value="${proizvodjac.idProizvodjaca}"  readonly="readonly"/> <br>
					<label>PIB</label> <input type="text" name="pib"
						value="${proizvodjac.pib}"  /> <br>
						<label>Maticni broj: </label> <input type="text" name="maticniBroj"
						value="${proizvodjac.maticniBroj}"  /> <br>
					<label>Adresa</label> <input type="text" name="adresa"
						value="${proizvodjac.adresa}" /> <br>
						ZipCode:<select class="form-select" aria-label="Default select example" name="cityEdit">
					<c:forEach items="${cities}" var="c">
						<option value="${c.ptt_broj}" name="cityOption">${c.ptt_broj}</option>
					
					</c:forEach>
					</select><br>
					<input type="submit" value="Save" name="Save" id="save"/>
					<input type="submit" value="Back" name="Back" id="back"/>
		</form>
	</div>
	
	
	
	
</body>
</html>
