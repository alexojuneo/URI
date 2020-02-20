(select concat ('Podium: ', team) as name
from league
order by position asc limit 3)

UNION ALL

select name from (select * from (select concat ('Demoted: ', team) as name, position
from league
order by position desc limit 2) as leaguel order by position asc) as leag;