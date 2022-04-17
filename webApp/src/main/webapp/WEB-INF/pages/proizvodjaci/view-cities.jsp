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
<header>
		<jsp:include page="/WEB-INF/pages/logout/logout.jsp" flush="true"/>
	</header>
	<article>
			<div id="tabela">
			<h2>Lista svih gradova <a href="/webApp/application/menu">Nazad</a></h2>
				<table>
					<thead>
						<tr>
							<th>PTT BROJ</th>
							<th>NAZIV GRADA</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="city" items="${cities}">
							<tr>
								<th>${city.ptt_broj}</th>
								<th>${city.naziv}</th>
								<th>
								<a href="/webApp/application/viewCity/view?ptt_broj=${city.ptt_broj}">Pogledaj detalje</a>
								</th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</article>
	
	
</body>
</html>
