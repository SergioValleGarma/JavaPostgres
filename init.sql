-- Crear base de datos si no existe
CREATE DATABASE empleadosdb;

-- Conectar a la base de datos
\c empleadosdb;

-- Crear tabla de empleados
CREATE TABLE IF NOT EXISTS empleados (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    departamento VARCHAR(100),
    salario DECIMAL(10,2)
);

-- Insertar datos de ejemplo
INSERT INTO empleados (nombre, apellido, email, departamento, salario) VALUES
('Juan', 'Pérez', 'juan.perez@empresa.com', 'TI', 50000.00),
('María', 'Gómez', 'maria.gomez@empresa.com', 'RH', 45000.00),
('Carlos', 'López', 'carlos.lopez@empresa.com', 'Ventas', 48000.00),
('Ana', 'Martínez', 'ana.martinez@empresa.com', 'Marketing', 52000.00)
ON CONFLICT (email) DO NOTHING;