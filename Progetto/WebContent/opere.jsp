<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Opere</title>
</head>
<body>
	<h1>Lista opere</h1>
	<a href="homePage.jsp">Home</a>
	<form action = "controllerOpere" method="get">
		<ul><c:forEach items="${opere}" var="opera">
			<div>
			<li>Titolo:${opera.titolo}</li>
			<li>Tecnica:${opera.tecnica}</li>
			<li>Dimensione:${opera.dimensione}</li>
			<li>Data realizzazione:${opera.dataRealizzazione}</li>
			</div>
		</c:forEach>
		</ul>
		<input type="submit" name="deleteAllOpere" value="Elimina tutte le opere">
	</form>
</body>
</html>