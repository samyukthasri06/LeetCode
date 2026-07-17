-- Last updated: 7/17/2026, 3:15:43 PM
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;