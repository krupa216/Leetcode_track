-- Last updated: 9/6/2026, 4:28:20 PM
# Write your MySQL query statement below
SELECT customer_number FROM Orders GROUP BY customer_number ORDER BY COUNT(customer_number) DESC LIMIT 1;