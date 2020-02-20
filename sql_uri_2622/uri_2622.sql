select c.name
from customers c 
    inner join legal_person lp ON lp.id_customers=c.id