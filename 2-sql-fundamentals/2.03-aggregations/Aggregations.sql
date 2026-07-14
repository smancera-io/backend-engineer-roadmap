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
GROUP BY devl.id, devl.name