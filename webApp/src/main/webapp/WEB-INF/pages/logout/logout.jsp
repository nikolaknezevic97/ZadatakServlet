<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<html>
<head>
	<style>
		#logout {
			background-color: #3d3d3d;
			color: white;
			width:100%;
			height:7%; 
		}
		
		#logout a{
			text-decoration: none;
			color: yellow;
			position: absolute;
			left:90%;
		}
		#logout a:hover {
			
			color: blue;
		}
		#logout a:active {
			
			color: red;
		}
		#logout h3{
			font-family: Arial sans-serif;
			color: white;
			width: 15%;
			
		}
		#logout h3:hover {
			
			background-color: green;
			color: yellow;	
			
		}
		#menuBack{
		
			background-color:red;
			position: absolute;
			right: 50%;
			top: 100%;
		}
		
	</style>


</head>
<body>
	<c:url value="/application/logoutUser" var="urlLogout"></c:url>
	<div id="logout">
	
	<h3>Prijavljeni ste kao: ${sessionScope.loginUserSession.username}  <a href="${urlLogout}">Odjavite se</a></h3>
	
	</div>
	
	


</body>

</html>
