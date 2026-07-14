/* JOIN and GROUPBY to get avg, and total budget.Besides, quantity of proyects for each client */
SELECT 
    CONCAT(p.name, " ", p.last_name) AS client,
    COUNT(pr.id) AS quantity_proyects,
    SUM(pr.budget) AS total_budget, 
    ROUND(AVG(pr.budget), 2) AS average_budget
FROM project pr
JOIN person p ON pr.client = p.id
GROUP BY pr.client
ORDER BY total_budget DESC;

SELECT 
    devl.name AS level,
    COUNT(dev.id) AS total_developers
FROM developer_level devl
LEFT JOIN developer dev ON devl.id = dev.level
GROUP BY devl.id, devl.name;

SELECT 
    CONCAT(per.name, ' ', per.last_name) AS developer,
    MAX(dlh.salary) AS max_salary,
    MIN(dlh.salary) AS min_salary,
    (MAX(dlh.salary) - MIN(dlh.salary)) AS increment
FROM developer_level_history dlh
JOIN developer dev ON dlh.developer = dev.id
JOIN person per ON dev.id = per.id
GROUP BY dev.id, per.name, per.last_name
HAVING (MAX(dlh.salary) - MIN(dlh.salary)) > 1000000
ORDER BY increment DESC;

SELECT 
    ps.name AS status,
    COUNT(*) AS proyects,
    ROUND(AVG(p.budget), 2) AS avg_budget
FROM project_status ps
JOIN project p ON ps.id = p.status
GROUP BY ps.id
ORDER BY COUNT(*) DESC;

SELECT 
    pr.name AS role_name,
    COUNT(*) AS total_assignments
FROM project_role pr
JOIN assignment a ON pr.id = a.role
GROUP BY a.role
HAVING COUNT(*) > 3
ORDER BY COUNT(*) DESC;