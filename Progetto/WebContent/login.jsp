<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina autenticazione</title>
</head>
<body>
	<h1>Inserisci userName e password per accedere al sistema</h1>
	<form action = "login" method="post">
	<div>Username:<input type="text" name="user"/></div>
	<div>Password:<input type="password" name="password"/></div>
	<input type="submit" name="submit"/>
	</form>

</body>
</html>