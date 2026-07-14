
/* Query to get employees with a salary more than 4.000.000 */
SELECT name, salary FROM employee
WHERE salary > 4000000
ORDER BY salary DESC;

/* Query to get employees with 'A' OR 'ez' in their names */
SELECT * FROM employee
WHERE name LIKE 'A%' OR name LIKE '%ez%';

/* Query to get employees in 'Bogota' OR 'Medellin' */
SELECT * FROM employee
WHERE city IN ('Bogotá', 'Medellín');

/* Query to get employees with a salay between 3.000.000 AND 4.500.000 */
SELECT * FROM employee
WHERE salary BETWEEN 3000000 AND 4500000;

/* Query to get cities */
SELECT DISTINCT city FROM employee;

/* Query to get top 3 salaries */
SELECT salary FROM employee
ORDER BY salary DESC, department ASC
LIMIT 3;