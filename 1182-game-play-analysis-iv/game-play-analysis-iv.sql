# Write your MySQL query statement below
with FirstLogin as (
    select player_id, min(event_date) as first_login
    from Activity
    group by player_id
)
select round( count(*) / (select count(distinct player_id) from Activity),2) as fraction
from Activity a
join FirstLogin f
on a.player_id = f.player_id
AND a.event_date = DATE_ADD(f.first_login, INTERVAL 1 DAY);