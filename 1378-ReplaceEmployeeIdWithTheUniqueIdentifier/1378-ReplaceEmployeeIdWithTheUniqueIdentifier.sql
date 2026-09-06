-- Last updated: 9/6/2026, 4:25:50 PM
# Write your MySQL query statement below
Select e.unique_id, s.name From Employees s LEFT JOIN EmployeeUNI e ON s.id=e.id;