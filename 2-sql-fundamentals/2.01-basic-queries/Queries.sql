SELECT name, salary FROM employee
WHERE salary > 4000000
ORDER BY salary DESC;

SELECT * FROM employee
WHERE name LIKE 'A%' OR name LIKE '%ez%';