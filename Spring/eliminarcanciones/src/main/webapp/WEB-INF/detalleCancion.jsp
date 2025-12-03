<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Detalle de Canción</title>
</head>
<body>
    <h1>Detalle de Canción</h1>
    <ul>
        <li><strong>Título:</strong> ${cancion.titulo}</li>
        <li><strong>Artista:</strong> ${cancion.artista}</li>
        <li><strong>Álbum:</strong> ${cancion.album}</li>
        <li><strong>Género:</strong> ${cancion.genero}</li>
        <li><strong>Idioma:</strong> ${cancion.idioma}</li>
        <li><strong>Fecha de creación:</strong> ${cancion.fechaCreacion}</li>
        <li><strong>Fecha de actualización:</strong> ${cancion.fechaActualizacion}</li>

    </ul>
    <a href="/canciones">Volver a lista de canciones</a>
    <a href="/canciones/formulario/editar/${cancion.id}">
    <button>Editar Canción</button>
    <a href="/canciones/eliminar/${cancion.id}">
    <button>Eliminar Canción</button>
</a>

</a>
</body>
</html>
