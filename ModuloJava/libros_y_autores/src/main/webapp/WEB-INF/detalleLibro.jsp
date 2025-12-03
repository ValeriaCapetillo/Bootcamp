<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Detalle de Libro</title>
</head>
<body>

<h1>Detalle de Libro</h1>

<c:if test="${not empty mensaje}">
    <p>${mensaje}</p>
</c:if>

<c:if test="${empty mensaje}">
    <p><strong>Libro:</strong> ${nombreLibro}</p>
    <p><strong>Autor:</strong> ${nombreAutor}</p>
</c:if>

<br>
<a href="/libros">Volver a lista de libros</a>

</body>
</html>
