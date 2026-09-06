-- Last updated: 9/6/2026, 4:30:06 PM
# Write your MySQL query statement below
SELECT MAX(salary) as SecondHighestSalary FROM Employee WHERE salary<(SELECT MAX(salary) FROM Employee);