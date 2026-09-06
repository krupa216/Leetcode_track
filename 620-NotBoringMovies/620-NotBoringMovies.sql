-- Last updated: 9/6/2026, 4:28:06 PM
# Write your MySQL query statement below
select * from Cinema where  description !="boring" AND id%2!=0 ORDER BY rating DESC;