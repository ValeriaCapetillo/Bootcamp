<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Canciones</title>
</head>
<body>

<h1>Lista de Canciones</h1>

<table border="1">
    <thead>
        <tr>
            <th>Título</th>
            <th>Autor</th>
            <th>Álbum</th>
            <th>Género</th>
            <th>Idioma</th>
            <th>Detalle</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach var="cancion" items="${canciones}">
            <tr>
                <td>${cancion.titulo}</td>

                <td>
                    <c:if test="${not empty cancion.artista}">
                        ${cancion.artista.nombre} ${cancion.artista.apellido}
                    </c:if>
                </td>

                <td>${cancion.album}</td>
                <td>${cancion.genero}</td>
                <td>${cancion.idioma}</td>

                <td>
                    <a href="/canciones/detalle/${cancion.id}">Detalle</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<br>

<!-- ACCIONES -->
<a href="/canciones/formulario/agregar/0">➕ Agregar nueva canción</a><br>
<a href="/artistas">🎤 Ir a artistas</a><br><br>

<form action="/artistas/formulario/agregar/1" method="get">
    <button type="submit">Agregar nuevo artista</button>
</form>

</body>
</html>
