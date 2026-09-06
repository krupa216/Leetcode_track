-- Last updated: 9/6/2026, 4:26:42 PM
# Write your MySQL query statement below
select p.product_name,s.year,s.price FROM Sales s JOIN Product p ON p.product_id=s.product_id;