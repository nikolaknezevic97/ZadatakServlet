<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<style>
		body{
			background-color: #062474;
			color: gray;
			margin:0;
		}
	#menu{
		
		width: 100%;
		height: 15%;
		text-align: center;
		position: absolute;
		
		background-color:#8cd3ff; 
	}
	#menu a{
		text-decoration:none;
		padding-right: 20px;
		color: #009dff;
		font-size:20px;
		
	}
	#menu h2{
		text-decoration:none;
		padding-right: 20px;
		color: #02055A;
		font-family: Arial sans-serif;
		font-weight: bold;
		font-size: 35px;
	}
	#menu a:hover{
		text-decoration:none;
		font-size:25px;
		color: purple;
		font-weight: bold;
	}
	#menu a:active{
		color:red;
	}
	</style>

</head>
<body>
	<header>
		<jsp:include page="/WEB-INF/pages/logout/logout.jsp" flush="true"/>
	</header>
	<div id="menu">
	<h2>Dobrodosli na meni na nasoj aplikaciji</h2>
	<a href="/webApp/application/viewManufacturer">Prikaz svih proizvodjaca</a>
	<a href="/webApp/application/newManufacturer">Unos novog proizvodjaca</a>
	<a href="/webApp/application/deleteManufacturer">Izbrisi proizvodjaca</a>
	<a href="/webApp/application/viewCity">Prikaz svih gradova</a>
	<a href="/webApp/application/viewCityInsert">Unos novog grada</a>
	<a href="/webApp/application/viewCityDelete">Izbrisi grad</a>
	
	<h1 style="color:white;">${Poruka}</h1>
	</div>
</body>
</html>
