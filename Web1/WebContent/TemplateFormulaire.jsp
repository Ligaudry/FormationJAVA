<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%out.println(request.getAttribute("monTitre"));%></title><!-- déconseillé pour après -->
</head>
<body>
<p>Votre identifiant s'il vous plaît ?</p>
<form action='Login' method='post'>
<input type='text' name='identity'>
<input type='submit' value='Envoyer'>
</form>
</body>
</html>