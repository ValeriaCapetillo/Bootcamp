<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Detalle de Receta</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <h1>Detalle de la receta: ${nombreReceta}</h1>
    <c:choose>
        <c:when test="${!noEncontrada}">
            <ul>
                <c:forEach var="ingrediente" items="${ingredientes}">
                    <li>${ingrediente}</li>
                </c:forEach>
            </ul>
        </c:when>
        <c:otherwise>
            <p>La receta no se encuentra en nuestra lista.</p>
        </c:otherwise>
    </c:choose>
    <a href="/recetas">Volver</a>
</body>
</html>
