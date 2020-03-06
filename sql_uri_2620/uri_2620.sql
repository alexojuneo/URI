/**
 * DESCRIÇÃO: 
 * A auditoria financeira da empresa está pedindo para nós um relatório do primeiro semestre de 2016.
 * Então exiba o nome dos clientes e o número do pedido para os clientes que fizeram pedidos no primeiro semestre de 2016.
 * 
 */
 
select c.name, o.id
from customers c
	inner join orders o on o.id_customers=c.id 	
where o.orders_date between '2016-01-01' and '2016-06-30'
