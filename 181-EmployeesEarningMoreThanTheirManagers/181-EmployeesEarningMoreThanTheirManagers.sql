-- Last updated: 7/17/2026, 3:15:45 PM
# Write your MySQL query statement below
SELECT 
    e.name AS Employee
FROM Employee e
JOIN Employee m
    ON e.managerId = m.id
WHERE e.salary > m.salary;