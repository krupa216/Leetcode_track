-- Last updated: 9/6/2026, 4:29:50 PM
# Write your MySQL query statement below
SELECT name AS Customers FROM customers c LEFT JOIN orders o ON c.id=o.customerId WHERE o.customerId IS NULL;