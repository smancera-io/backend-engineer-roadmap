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

SELECT 
    p.name AS proyect_name,
    p.start_date, 
    CONCAT (pe1.name, " ", pe1.last_name) AS developer1,
    CONCAT (pe2.name, " ", pe2.last_name) AS developer2
FROM assignment a1
JOIN assignment a2 ON a1.proyect = a2.proyect
    AND a1.id < a2.id
JOIN proyect p ON a1.proyect = p.id
JOIN person pe1 ON a1.developer = pe1.id
JOIN person pe2 ON a2.developer = pe2.id;