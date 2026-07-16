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