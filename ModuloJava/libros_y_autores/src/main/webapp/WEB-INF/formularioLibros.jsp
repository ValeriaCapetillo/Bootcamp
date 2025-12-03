<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar Libro</title>
    <style>
        form div {
            margin-bottom: 10px;
        }
        label {
            display: inline-block;
            width: 150px;
        }
        input {
            padding: 5px;
        }
        button {
            padding: 5px 10px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<h1>Agregar Libro</h1>

<form action="/procesa/libro" method="post">
    <div>
        <label for="nombreLibro">Nombre del libro:</label>
        <input type="text" id="nombreLibro" name="nombreLibro" required>
    </div>

    <div>

