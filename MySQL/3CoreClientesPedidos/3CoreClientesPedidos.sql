CREATE DATABASE ventas_core;
USE ventas_core;

-- Creación de tablas
CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    direccion VARCHAR(150),
    telefono VARCHAR(20)
);

CREATE TABLE pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT,
    fecha DATE,
    total INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);

-- Poblamiento tablas
INSERT INTO clientes (nombre, direccion, telefono)
VALUES
('Alexis Sánchez', 'Av. Matta 123', '912345678'),
('Mon Laferte', 'Calle Lastarria 456', '934567890'),
('Ben Brereton', 'Pasaje Larraín 789', '956789012'),
('Cami Gallardo', 'Ruta Austral 101', '978901234'),
('Tonka Tomicic', 'Camino Peumo 202', '990123456');

INSERT INTO pedidos (cliente_id, fecha, total)
VALUES
(1, '2025-11-01', 19990),
(2, '2025-11-02', 32990),
(3, '2025-11-03', 15990),
(2, '2025-11-04', 28990),
(4, '2025-11-05', 24990),
(5, '2025-11-06', 11990),
(3, '2025-11-07', 13990),
(1, '2025-11-08', 43990),
(5, '2025-11-09', 22990),
(2, '2025-11-10', 9990);

-- Consulta todos los clientes y sus pedidos
SELECT clientes.nombre, pedidos.id, pedidos.fecha, pedidos.total
FROM clientes
JOIN pedidos ON clientes.id = pedidos.cliente_id;

-- Consultamos todos los pedidos para un cliente específico (cliente 2)
SELECT pedidos.*
FROM pedidos
WHERE cliente_id = 2;

-- Consultamos el total de pedidos por cada cliente
SELECT clientes.nombre, COUNT(pedidos.id) AS cantidad_pedidos
FROM clientes
LEFT JOIN pedidos ON clientes.id = pedidos.cliente_id
GROUP BY clientes.id, clientes.nombre;

-- Eliminar un cliente específico y sus pedidos asociados (cliente 4)
DELETE FROM pedidos WHERE cliente_id = 4;
DELETE FROM clientes WHERE id = 4;

-- Consulta: Tres clientes que han realizado más pedidos, orden descendente
SELECT clientes.nombre, COUNT(pedidos.id) AS cantidad_pedidos
FROM clientes
JOIN pedidos ON clientes.id = pedidos.cliente_id
GROUP BY clientes.id, clientes.nombre
ORDER BY cantidad_pedidos DESC
LIMIT 3;
