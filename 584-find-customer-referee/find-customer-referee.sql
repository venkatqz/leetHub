# Write your MySQL query statement below
select c.name
from customer c
-- JOIN customer d ON c.referee_id = d.id
where c.referee_id!=2 OR c.referee_id is Null;