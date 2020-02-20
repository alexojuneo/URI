select ca.name, round((((sc.math * 2) + (sc.specific * 3) + (sc.project_plan * 5))/10),2) as avg
from score sc
	inner join candidate ca on ca.id=sc.candidate_id 
order by avg desc