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
			width: 15%;
			height: 40%;
			position: relative;
			top:25px;
			right:50px;
			border:none;
			border-radius: 5px;
		
		}
		
		#cancel:hover{
			
			color:white;
			background-color: green;
		
		}
		
		#delete:hover{
			
			color:white;
			background-color: green;
		
		}
		#delete{
			
			background-color: #Oda2ff;
			width: 15%;
			height: 40%;
			position: relative;
			top:10px;
			left:50px;
			border:none;
			border-radius: 5px;
		
		}	
	</style>

</head>
<body>
<header>
		<jsp:include page="/WEB-INF/pages/logout/logout.jsp" flush="true"/>
	</header>
	<article>
			<div>
			<form action="/webApp/application/DeleteCity" id="formaLogin">
					<h1>Obrisati grad</h1>
					<label>Postanski broj</label> <input type="text" name="ptt_broj"/> 				
					<div>
						<input type="submit" value="Cancel" name="Cancel" id="cancel">
					</div>
					
					<div>
						<input type="submit" value="Delete" name="Delete" id="delete">
					</div>
						<h2 style="color:red;">${poruka}</h2>
				</form>
			</div>
		</article>
	
	
</body>
</html>
