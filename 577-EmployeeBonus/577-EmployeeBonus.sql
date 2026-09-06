-- Last updated: 9/6/2026, 4:28:24 PM
# Write your MySQL query statement below
SELECT Employee.name,Bonus.bonus FROM Employee LEFT JOIN Bonus On Employee.empID=Bonus.empID 
WHERE bonus<1000 OR Bonus IS NULL;