/**
 * DESCRIÇÃO: 
 * O setor de vendas quer fazer uma promoção para todos os clientes que são pessoas jurídicas.
 * Para isso você deve exibir o nome dos clientes que sejam pessoa jurídica.
 * 
 */
 
select c.name
from customers c 
    inner join legal_person lp ON lp.id_customers=c.id