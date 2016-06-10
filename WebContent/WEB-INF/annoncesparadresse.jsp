<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Annonces par adresse</title>
</head>
<body>
	<table>
	    <tr>
	        <th>Nom</th>
	        <th>Categorie</th> 
	        <th>Adresse</th>                     
	    </tr>
	    <c:forEach items="${annonces}" var="annonce">
			<tr>
				<td>${annonce.getNom()}</td>
				<td>${annonce.getCategorie().getSujet()}</td>
				<td>${annonce.getAdresse()}</td>
			</tr>      
		</c:forEach>
	</table>
	<a href="<c:url value="/Accueil"/>">Retour à l'accueil</a>
</body>
</html>