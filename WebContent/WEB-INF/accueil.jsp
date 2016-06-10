<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Annonces</title>
</head>
<body>
	<table>
	    <tr>
	        <th>Categorie</th>                    
	    </tr>
	    <c:forEach items="${categories}" var="categorie">
			<tr>
				<td>${categorie.getSujet()}</td>
			</tr>      
		</c:forEach>
	</table>
	<form id="categorie" name="categorie" method="post" action="AnnoncesParCategorie">
		<label for="input_categorie">Rechercher par categorie : </label>
		<input type="text" name="input_categorie" id="input_categorie" ></input>
        <input type="submit" value ="envoyer"/>
	</form>
	<form id="nom" name="nom" method="post" action="AnnoncesParNom">
		<label for="input_nom">Rechercher par nom : </label>
		<input type="text" name="input_nom" id="input_nom" ></input>
        <input type="submit" value ="envoyer"/>
	</form>
	<form id="adresse" name="adresse" method="post" action="AnnoncesParAdresse">
		<label for="input_adresse">Rechercher par adresse : </label>
		<input type="text" name="input_adresse" id="input_adresse" ></input>
        <input type="submit" value ="envoyer"/>
	</form>
</body>
</html>