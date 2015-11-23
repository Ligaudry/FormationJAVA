<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="org.exemple.model.Utilisateur"%>


<fmt:setBundle basename="message" var="bun"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste des utilisateurs</title>
</head>
<body>
<h1>Liste des utilisateurs</h1>
<!-- <form> -->
<!--   <input type="radio" name="sex" value="xml" checked>XML -->
<!--   <br> -->
<!--   <input type="radio" name="sex" value="json">JSON -->
<!--   <br> -->
<!--   <input type="radio" name="sex" value="json">AUTRE -->
<!-- </form> -->

<table>
	<tr>
		<th><fmt:message bundle="${bun}" key="id"></fmt:message></th>
		<th><fmt:message bundle="${bun}" key="firstname"></fmt:message></th>
		<th><fmt:message bundle="${bun}" key="lastname"></fmt:message></th>
		<th><fmt:message bundle="${bun}" key="address"></fmt:message></th>
	</tr> 
	<c:forEach var="user" items="${sessionScope.list}">
		<tr>
			<td> | <c:out value = "${user.id}"> </c:out></td>
			<td> | <c:out value = "${user.firstname}"> </c:out></td>
			<td> | <c:out value = "${user.lastname}"> </c:out></td>
			<td> | <c:out value = "${user.address}"> </c:out></td>
			<td> | <a href = '<c:url value="/user/detail?id=${user.id}&?format=xml" />'> details </a> </td>
		</tr>
	</c:forEach>
	
	</table>
	
	<c:if test="${empty sessionScope.user.id}"><jsp:include page="TemplateFormulaire.jsp"></jsp:include></c:if>
	<c:if test="${not empty sessionScope.user.id}"> Bienvenue <c:out value = "${sessionScope.user.firstname}"></c:out></c:if>
	
</body>
</html>