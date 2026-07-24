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

SELECT 
    pr.id AS project_id,
    pr.name,
    CONCAT (p.name, ' ', p.last_name) AS client,
    pr.budget,
    ps.name AS status
FROM project pr
JOIN person p ON pr.client = p.id
JOIN project_status ps ON pr.status = ps.id
JOIN assignment a ON pr.id = a.project 
GROUP BY pr.id
HAVING (
    COUNT(DISTINCT a.developer) > (
        SELECT 
            ROUND(AVG(number_developers), 1) 
        FROM (
            SELECT 
                COUNT(DISTINCT a.developer) AS number_developers
            FROM project p
            LEFT JOIN assignment a ON p.id = a.project
            GROUP BY p.id) AS unique_developers_query
    )
);

SELECT DISTINCT
    dev.id AS developer_id,
    CONCAT (p.name, ' ', p.last_name) AS developer_name,
    dl.name AS level,
    ds.name AS specialty
FROM developer dev
JOIN assignment a ON dev.id = a.developer
JOIN person p ON dev.id = p.id
JOIN developer_level dl ON dev.level = dl.id
JOIN developer_specialty ds ON dev.specialty = ds.id
WHERE a.project IN (
    SELECT 
        pr.id
    FROM project pr
    WHERE budget = (
        SELECT 
            MAX(budget)
        FROM project)
)
ORDER BY dev.id ASC;

SELECT 
    pr.id,
    pr.name,
    CONCAT (p.name, ' ', p.last_name) AS client,
    pr.budget
FROM project pr
JOIN person p ON pr.client = p.id
WHERE NOT EXISTS (
    SELECT 1
    FROM assignment a
    JOIN developer dev ON a.developer = dev.id
    JOIN developer_level dl ON dev.level = dl.id
    WHERE a.project = pr.id
    AND dl.name IN ('Senior', 'Lead', 'Architect')
);