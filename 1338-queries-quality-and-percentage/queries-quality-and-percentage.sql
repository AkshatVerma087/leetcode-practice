# Write your MySQL query statement below

select q.query_name, 
round( sum(q.rating / q.position) / count(q.query_name) ,2) as quality, 
round((
    ifnull((select count(*) 
    from Queries 
    where rating < 3
    and query_name = q.query_name
    group by query_name), 0)
    / count(q.query_name)) * 100.0, 2) as poor_query_percentage
from Queries q
group by q.query_name;
