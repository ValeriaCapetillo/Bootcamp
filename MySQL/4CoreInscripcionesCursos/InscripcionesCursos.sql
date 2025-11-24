CREATE DATABASE Inscripciones_a_cursos;
USE Inscripciones_a_cursos;

CREATE TABLE estudiantes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    edad INT
);

CREATE TABLE cursos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    duracion INT -- en horas
);

CREATE TABLE inscripciones (
    id_estudiante INT,
    id_curso INT,
    PRIMARY KEY (id_estudiante, id_curso),
    FOREIGN KEY (id_estudiante) REFERENCES estudiantes(id),
    FOREIGN KEY (id_curso) REFERENCES cursos(id)
);

-- Poblamiento tablas con estudiantes
INSERT INTO estudiantes (nombre, edad) VALUES
('Leonardo DiCaprio', 22),
('Emma Watson', 19),
('Lionel Messi', 25),
('Taylor Swift', 20),
('Keanu Reeves', 29),
('Zendaya', 18);

-- Poblamiento cursos
INSERT INTO cursos (nombre, duracion) VALUES
('Matemática', 60),
('Programación', 90),
('Historia', 45),
('Física', 75);

-- Poblamiento inscripciones en al menos dos cursos
INSERT INTO inscripciones (id_estudiante, id_curso) VALUES
(1, 1), (1, 2),
(2, 1), (2, 3),
(3, 2), (3, 4),
(4, 1), (4, 4),
(5, 3), (5, 2);

-- Consultamos todos los estudiantes y sus cursos concatenados.
SELECT estudiantes.nombre,
       GROUP_CONCAT(cursos.nombre SEPARATOR ', ') AS cursos_inscritos
FROM estudiantes
JOIN inscripciones ON estudiantes.id = inscripciones.id_estudiante
JOIN cursos ON inscripciones.id_curso = cursos.id
GROUP BY estudiantes.id, estudiantes.nombre;


-- Consultaremos qué estudiantes están inscritos en 'Programación'
SELECT estudiantes.nombre AS 'Estudiantes en programación'
FROM estudiantes
JOIN inscripciones ON estudiantes.id = inscripciones.id_estudiante
JOIN cursos ON inscripciones.id_curso = cursos.id
WHERE cursos.nombre = 'Programación';

-- Consulta los cursos en los que está inscrito 'Keanu Reeves'
SELECT cursos.nombre AS 'Cursos de Keanu'
FROM cursos
JOIN inscripciones ON cursos.id = inscripciones.id_curso
JOIN estudiantes ON inscripciones.id_estudiante = estudiantes.id
WHERE estudiantes.nombre = 'Keanu Reeves';

-- Número de estudiantes por curso
SELECT cursos.nombre, COUNT(inscripciones.id_estudiante) AS '#estudiantes por curso'
FROM cursos
LEFT JOIN inscripciones ON cursos.id = inscripciones.id_curso
GROUP BY cursos.id, cursos.nombre;

-- Estudiantes que no están inscritos en ningún curso
SELECT estudiantes.nombre AS 'ESTUDIANTES SIN CURSO'
FROM estudiantes
LEFT JOIN inscripciones ON estudiantes.id = inscripciones.id_estudiante
WHERE inscripciones.id_curso IS NULL;




