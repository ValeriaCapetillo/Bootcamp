<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
        
        <div>
            <form:label path="artista">Artista:</form:label>
            <form:input path="artista"/>
            <form:errors path="artista" cssClass="error"/>
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
