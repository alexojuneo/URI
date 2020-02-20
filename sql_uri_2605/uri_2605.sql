select pd.name, pv.name
from products pd
	inner join providers pv on pv.id=pd.id_providers
	inner join categories c on c.id=pd.id_categories 
where c.id = 6