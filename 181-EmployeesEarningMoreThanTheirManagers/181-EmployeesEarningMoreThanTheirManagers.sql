-- Last updated: 9/6/2026, 4:29:55 PM
# Write your MySQL query statement below
SELECT e.name  AS Employee From Employee e JOIN Employee m ON m.id=e.managerId WHERE e.salary>m.salary;