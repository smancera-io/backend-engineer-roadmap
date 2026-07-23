/* Query to get developer with salary over the average */
SELECT 
    p.id, 
    CONCAT(p.name, ' ', p.last_name) AS developer, 
    dl.base_salary
FROM
    person p
    JOIN developer dev ON p.id = dev.id
    JOIN developer_level dl ON dev.level = dl.id
WHERE
    dl.base_salary > (
        SELECT AVG(base_salary)
        FROM developer_level
    );

/* Query to get developers with current salaries above the average salary for their level */
SELECT
    p.id, 
    CONCAT(p.name, ' ', p.last_name) AS developer, 
    dlh.salary AS last_salary
FROM person p
JOIN developer dev ON p.id = dev.id
JOIN developer_level_history dlh ON dev.id = dlh.developer
WHERE dlh.start_timestamp = (
    SELECT MAX(start_timestamp)
    FROM developer_level_history dlh2
    WHERE dlh.developer = dlh2.developer
) AND dlh.salary > (
    SELECT AVG(salary)
    FROM developer_level_history dlh3
    WHERE dlh3.level = dev.level
    AND dlh3.start_timestamp = (
        SELECT MAX(start_timestamp)
        FROM developer_level_history dlh4
        WHERE dlh4.developer = dlh3.developer
    )
)
ORDER BY salary DESC;