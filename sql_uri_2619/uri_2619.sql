select 
    pd.name,
    p.name,
    pd.price
from products pd
    inner join categories c ON c.id=pd.id_categories
    inner join providers p ON p.id=pd.id_providers
where pd.price > 1000.00 and c.name = 'Super Luxury'