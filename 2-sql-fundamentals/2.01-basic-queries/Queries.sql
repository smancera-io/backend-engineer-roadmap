SELECT name, salary FROM employee
WHERE salary > 4000000
ORDER BY salary DESC;

SELECT * FROM employee
WHERE name LIKE 'A%' OR name LIKE '%ez%';

SELECT * FROM employee
WHERE city IN ('Bogotá', 'Medellín');

SELECT * FROM employee
WHERE salary BETWEEN 3000000 AND 4500000;