<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Libros</title>
</head>
<body>

<h1>Lista de Libros</h1>

<ul>
    <c:forEach var="libro" items="${libros}">
        <li>
            <a href="/libros/${libro}">${libro}</a>
        </li>
    </c:forEach>
</ul>

<br>

<a href="/libros/formulario">Agregar nuevo libro</a
