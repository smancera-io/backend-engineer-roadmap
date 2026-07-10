-- Active: 1783470162528@@127.0.0.1@3306@practice_sql
/* Insert data in 'employee' table */
USE practice_sql;

/* Insert values in lookup tables */
INSERT INTO
    city (id, name)
VALUES 
    (1, 'Bogotá'),
    (2, 'Medellín'),
    (3, 'Cali'),
    (4, 'Barranquilla'),
    (5, 'Bucaramanga');

INSERT INTO
    client_type (id, name)
VALUES 
    (1, 'Business'),
    (2, 'Startup'),
    (3, 'Government');

INSERT INTO
    task_status (id, name)
VALUES 
    (1, 'To do'),
    (2, 'In progress'),
    (3, 'Completed');

INSERT INTO
    task_priority (id, name)
VALUES 
    (1, 'Low'),
    (2, 'Medium'),
    (3, 'High'),
    (4, 'Crítical');

INSERT INTO
    developer_level (id, name, base_salary)
VALUES 
    (1, 'Junior', 2500000),
    (2, 'Mid', 3800000),
    (3, 'Senior', 5200000),
    (4, 'Lead', 7000000),
    (5, 'Architect', 9000000);

INSERT INTO
    developer_specialty (id, name)
VALUES 
    (1, 'Backend'),
    (2, 'Frontend'),
    (3, 'Fullstack'),
    (4, 'DevOps');

INSERT INTO
    project_role (id, name)
VALUES 
    (1, 'Lead'),
    (2, 'Developer'),
    (3, 'Reviewer'),
    (4, 'QA');

INSERT INTO
    project_status (id, name)
VALUES 
    (1, 'Planification'),
    (2, 'In progress'),
    (3, 'Completed'),
    (4, 'On pause');

/* Insert values in main/entity tables */
INSERT INTO
    person (id, name, last_name, birth_date, phone_number, email, city)
VALUES 
    (1, 'Ana', 'Gómez', '1990-03-15', '3001234501', 'ana.gomez@mail.com', 1),
    (2, 'Juan', 'Pérez', '1988-07-22', '3001234502', 'juan.perez@mail.com', 2),
    (3, 'María', 'Ruiz', '1992-11-05', '3001234503', 'maria.ruiz@mail.com', 1),
    (4, 'Carlos', 'Díaz', '1985-02-18', '3001234504', 'carlos.diaz@mail.com', 2),
    (5, 'Sofía', 'López', '1993-09-30', '3001234505', 'sofia.lopez@mail.com', 3),
    (6, 'Diego', 'Ramírez', '1996-04-12', '3001234506', 'diego.ramirez@mail.com', 1),
    (7, 'Laura', 'Torres', '1991-06-25', '3001234507', 'laura.torres@mail.com', 1),
    (8, 'Pedro', 'Sánchez', '1997-08-14', '3001234508', 'pedro.sanchez@mail.com', 3),
    (9, 'Andrés', 'Vargas', '1994-01-09', '3001234509', 'andres.vargas@mail.com', 4),
    (10, 'Camila', 'Rojas', '1987-12-03', '3001234510', 'camila.rojas@mail.com', 2),
    (11, 'Roberto', 'Kim', '1975-05-20', '3001234511', 'roberto.kim@mail.com', 1),
    (12, 'Patricia', 'Nuñez', '1980-10-11', '3001234512', 'patricia.nunez@mail.com', 3),
    (13, 'Fernando', 'Castro', '1978-03-27', '3001234513', 'fernando.castro@mail.com', 5),
    (14, 'Isabella', 'Mendoza', '1983-07-08', '3001234514', 'isabella.mendoza@mail.com', 2);

INSERT INTO
    developer (id, level, specialty, hire_date )
VALUES 
    (1, 3, 1, '2019-01-10'),   /* Ana: Senior, Backend */ 
    (2, 2, 2, '2021-07-01'),   /* Juan: Mid, Frontend */
    (3, 3, 3, '2020-02-01'),   /* María: Senior, Fullstack */
    (4, 4, 1, '2020-01-01'),   /* Carlos: Lead, Backend */
    (5, 2, 2, '2021-06-05'),   /* Sofía: Mid, Frontend */
    (6, 1, 1, '2023-02-28'),   /* Diego: Junior, Backend */
    (7, 3, 4, '2021-06-05'),   /* Laura: Senior, DevOps */
    (8, 1, 2, '2022-01-10'),   /* Pedro: Junior, Frontend */
    (9, 2, 1, '2021-09-01'),   /* Andrés: Mid, Backend — bench, sin assignment*/ 
    (10, 4, 3, '2020-11-20');  /* Camila: Lead, Fullstack */

INSERT INTO 
    client (id, type) 
VALUES 
    (11, 1), 
    (12, 2), 
    (13, 3), 
    (14, 1);

INSERT INTO
    project (name, description, budget, start_date, estimated_completion_date, status, client)
VALUES 
    ('Sistema de Facturación', 'Plataforma de facturación electrónica', 50000000, '2023-01-15', '2024-06-30', 2, 11),
    ('App Móvil Beta', 'Aplicación móvil para clientes', 30000000, '2024-03-01', NULL, 1, 12),
    ('Migración Cloud', 'Migración de infraestructura a la nube', 80000000, '2022-05-01', '2023-11-30', 3, 13),
    ('Portal de Gobierno', 'Portal ciudadano de trámites', 45000000, '2023-06-01', NULL, 2, 14),
    ('Rediseño E-commerce', 'Rediseño de tienda en línea', 20000000, '2023-09-01', NULL, 4, 11),
    ('Proyecto Zeta', 'Nuevo proyecto en fase de definición', 15000000, '2024-05-01', NULL, 1, 12);  /* sin assignments */

INSERT INTO
    task (description, status, priority, start_date, estimated_completion_date, project, developer)
VALUES 
    ('Diseñar modelo de datos', 3, 3, '2023-01-16', '2023-01-20', 1, 1),
    ('Implementar endpoint de facturas', 2, 3, '2023-02-01', '2023-02-15', 1, 2),
    ('Configurar CI/CD', 1, 2, '2023-03-05', NULL, 1, 6),
    ('Diseñar wireframes app móvil', 2, 2, '2024-03-02', '2024-03-20', 2, 5),
    ('Definir arquitectura backend', 3, 4, '2024-03-01', '2024-03-10', 2, 3),
    ('Migrar base de datos a RDS', 3, 4, '2022-05-05', '2022-08-01', 3, 4),
    ('Optimizar consultas SQL', 3, 3, '2022-06-05', '2022-07-01', 3, 7),
    ('Implementar portal de trámites', 2, 3, '2023-06-05', NULL, 4, 1),
    ('Pruebas de carga', 1, 2, '2023-09-10', NULL, 5, 2),
    ('Rediseñar catálogo de productos', 2, 2, '2023-09-15', NULL, 5, 4);

/* Insert values in junction tables */
INSERT INTO
    assignment (project, developer, role, assignment_date)
VALUES 
    (1, 1, 1, '2023-01-15'),
    (1, 2, 2, '2023-01-20'),
    (1, 6, 2, '2023-03-01'),
    (1, 7, 3, '2023-02-01'),
    (2, 3, 1, '2024-03-01'),
    (2, 5, 2, '2024-03-05'),
    (2, 8, 2, '2024-03-10'),
    (3, 4, 1, '2022-05-01'),
    (3, 7, 2, '2022-05-10'),
    (3, 8, 2, '2022-06-01'),
    (3, 1, 3, '2022-05-15'),
    (4, 1, 2, '2023-06-01'),
    (4, 10, 1, '2023-06-01'),
    (4, 3, 2, '2023-07-01'),
    (5, 2, 2, '2023-09-01'),
    (5, 4, 2, '2023-09-05'),
    (5, 6, 2, '2023-09-10'),
    (5, 5, 2, '2023-10-01');

/* Insert values in history/transaction tables */
INSERT INTO
    developer_level_history (developer, level, salary, start_timestamp, end_timestamp)
VALUES 
    (1, 1, 2500000, '2019-01-10 09:00:00', '2020-06-01'),
    (1, 2, 3800000, '2020-06-01 09:00:00', '2022-03-15'),
    (1, 3, 5300000, '2022-03-15 09:00:00', NULL),
    (2, 2, 3900000, '2021-07-01 09:00:00', NULL), -- empate con dev5
    (3, 2, 3700000, '2020-02-01 09:00:00', '2022-08-01'),
    (3, 3, 5300000, '2022-08-01 09:00:00', NULL), -- empate con dev1
    (4, 3, 5100000, '2020-01-01 09:00:00', '2023-01-01'),
    (4, 4, 7000000, '2023-01-01 09:00:00', NULL),
    (5, 2, 3900000, '2021-06-05 09:00:00', NULL), -- empate con dev2
    (6, 1, 2600000, '2023-02-28 09:00:00', NULL),
    (7, 3, 5400000, '2021-06-05 09:00:00', NULL),
    (8, 1, 2800000, '2022-01-10 09:00:00', NULL),
    (9, 2, 3850000, '2021-09-01 09:00:00', NULL),
    (10, 4, 7200000, '2020-11-20 09:00:00', NULL);