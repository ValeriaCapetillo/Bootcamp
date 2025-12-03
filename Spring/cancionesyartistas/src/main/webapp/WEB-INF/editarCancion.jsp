<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Canción</title>
</head>
<body>

<h1>Editar Canción</h1>

<form:form action="/canciones/procesa/editar/${cancion.id}" method="post" modelAttribute="cancion">

    <div>
        <form:label path="titulo">Título:</form:label>
        <form:input path="titulo"/>
        <form:errors path="titulo" cssClass="error"/>
    </div>

    <!-- SELECT DE ARTISTAS -->
    <div>
        <label for="idArtista">Artista:</label>
        <select name="idArtista" id="idArtista">
            <c:forEach items="${artistas}" var="artista">
                <option value="${artista.id}"
                    <c:if test="${cancion.artista != null && cancion.artista.id == artista.id}">
                        selected
                    </c:if>>
                    ${artista.nombre} ${artista.apellido}
                </option>
            </c:forEach>
        </select>
    </div>

    <div>
        <form:label path="album">Álbum:</form:label>
        <form:input path="album"/>
        <form:errors path="album" cssClass="error"/>
    </div>

    <div>
        <form:label path="genero">Género:</form:label>
        <form:input path="genero"/>
        <form:errors path="genero" cssClass="error"/>
    </div>

    <div>
        <form:label path="idioma">Idioma:</form:label>
        <form:input path="idioma"/>
        <form:errors path="idioma" cssClass="error"/>
    </div>

    <button type="submit">Actualizar Canción</button>

</form:form>

<br>
<a href="/canciones">Volver a lista de canciones</a>

</body>
</html>
