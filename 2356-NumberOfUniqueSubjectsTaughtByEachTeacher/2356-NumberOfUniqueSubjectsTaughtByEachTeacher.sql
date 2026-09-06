-- Last updated: 9/6/2026, 4:24:40 PM
# Write your MySQL query statement below
SELECT teacher_id,COUNT(DISTINCT subject_id)AS cnt FROM Teacher GROUP BY teacher_id;