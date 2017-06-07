<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserisci nuova opera</title>
</head>
<body>
<h1>Adesso puoi inserire una nuova opera</h1>
<form action="controllerOpere" method="post">
	<div>Titolo:<input type="text" name="titolo"/></div>
	<div>Tecnica:<input type="text" name="tecnica"/></div>
	<div>Dimensione:<input type="text" name="dimensione"/></div>
	<div>Anno di realizzazione:<input type="text" name="dataRealizzazione"/></div>
<input type="submit" name="submit" value="invia"/></form>
</body>
</html>