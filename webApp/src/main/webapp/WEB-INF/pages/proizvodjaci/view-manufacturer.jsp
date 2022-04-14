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
	
	<article>
			<div id="tabela">
			<h2>Lista svih proizvodjaca</h2>
				<table>
					<thead>
						<tr>
							<th>ID_PROIZVODJACA</th>
							<th>PIB</th>
							<th>MATICNI BROJ</th>
							<th>ADRESA</th>
							<th>GRAD</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="proizvodjac" items="${proizvodjaci}">
							<tr>
								<th>${proizvodjac.idProizvodjaca}</th>
								<th>${proizvodjac.pib}</th>
								<th>${proizvodjac.maticniBroj}</th>
								<th>${proizvodjac.adresa}</th>
								<th>${proizvodjac.city}</th>
								<th>
									<a href="/simplewebapp/application/city/view/${city.zipCode}">Pogledaj map</a>
									<br/>
									<a href="/simplewebapp/application/city/view?zipCode=${city.zipCode}">Pogledaj url</a>
									<br/>
									
									<c:url var="urlView" value="/application/city/view">
										<c:param name="zipCode" value="${city.zipCode}" ></c:param>
									</c:url>
									<a href="${urlView}">Pogledaj c-url</a>
								</th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</article>
	</main>
	
	
	
</body>
</html>
