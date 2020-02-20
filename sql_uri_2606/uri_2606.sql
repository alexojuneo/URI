select p.id, p.name
from products p
    inner join categories c on c.id=id_categories
where c.name LIKE 'super%'
