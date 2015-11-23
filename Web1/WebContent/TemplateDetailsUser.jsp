<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Détails de l'utilisateur</h1>
<p>Id</p>
<c:out value="${requestScope.utilisateur.id}"></c:out>
<p>Nom</p>
<c:out value="${requestScope.utilisateur.firstname}"></c:out>
<p>Prénom</p>
<c:out value="${requestScope.utilisateur.lastname}"></c:out>
<p>Adresse</p>
<c:out value="${requestScope.utilisateur.address}"></c:out>
<a href ='<c:url value="/user/list"/>'>Back</a>
</body>
</html>