/**
 * DESCRIÇÃO: 
 * Uma empresa de investimentos deseja calcular o payback de seus clientes ao descobrir qual será o mês em que o acumulado das operações do empreendimento
 * equivalem ou são superiores ao investimento inicial.
 * Por exemplo, o cliente Lucas investiu 1000$ e apenas no terceiro mês obteve o seu payback,
 * já que a soma de todas as suas operações foi superior ao seu investimento.
 * Por outro lado, o cliente Daniel não conseguiu atingir seu payback já que seu investimento foi de 500$ e a soma de todas as suas operações foi 230$. 
 * Você precisa mostrar o nome do cliente, o investimento inicial, qual o mês do payback e o valor do retorno (valor acumulado - valor investimento inicial).
 * Além disso, você deve mostrar o resultado ordenado do maior para o menor retorno.
 *
 */
 
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