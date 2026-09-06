-- Last updated: 9/6/2026, 4:28:12 PM
# Write your MySQL query statement below
SELECT class FROM Courses GROUP BY class HAVING COUNT(class) >=5;