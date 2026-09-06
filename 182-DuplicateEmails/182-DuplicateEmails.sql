-- Last updated: 9/6/2026, 4:29:54 PM
# Write your MySQL query statement below
Select email from Person group by  email having count(email)>1;