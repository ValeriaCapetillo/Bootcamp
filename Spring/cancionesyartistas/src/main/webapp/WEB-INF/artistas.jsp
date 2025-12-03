<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Artistas</title>
</head>
<body>
    <h1>Lista de artistas</h1>

    <ul>
        <c:forEach items="${artistas}" var="artista">
            <li>
                <a href="/artistas/detalle/${artista.id}">
                    ${artista.nombre} ${artista.apellido}
                </a>
            </li>
        </c:forEach>
    </ul>
        <form action="/artistas/formulario/agregar/1" method="get">
            <button type="submit">Agregar nuevo artista</button>
        </form>
    <a href="/canciones">Ir a canciones</a>
</body>
</html>
