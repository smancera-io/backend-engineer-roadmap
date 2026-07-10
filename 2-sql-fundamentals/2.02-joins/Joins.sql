SELECT 
    CONCAT (p.name, " ", p.last_name) AS developer, 
    devl.name AS level,
    devl.base_salary
FROM developer dev 
JOIN person p ON dev.id = p.id
JOIN developer_level devl ON dev.level = devl.id
ORDER BY devl.base_salary DESC;

SELECT * 
FROM proyect pr
LEFT JOIN assignment a ON pr.id = a.proyect
WHERE a.proyect IS NULL;

SELECT
    dev.id,
    CONCAT (p.name, " ", p.last_name) AS developer
FROM developer dev 
JOIN person p ON dev.id = p.id
LEFT JOIN assignment a ON a.developer = dev.id
WHERE a.developer IS NULL;