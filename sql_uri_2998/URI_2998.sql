SELECT * FROM (
	SELECT
		c.name,
		c.investment,
		o.month as month_of_payback,
			(SELECT 
			(sum(profit) - (c.investment))
				FROM operations 
				WHERE client_id = c.id and month <= o.month 
				GROUP BY client_id)
			as retorno
FROM operations o 
INNER JOIN clients c on c.id=o.client_id) as tabela_final where tabela_final.retorno >= 0 and tabela_final.retorno < 700
ORDER BY tabela_final.retorno desc