/**
 * DESCRIÇÃO: 
 * O setor financeiro precisa de um relatório sobre os fornecedores dos produtos que vendemos.
 * Os relatórios contemplam todas as categorias, mas por algum motivo, os fornecedores dos produtos cuja categoria é a executiva, não estão no relatório.
 * Seu trabalho é retornar os nomes dos produtos e dos fornecedores cujo código da categoria é 6.
 * 
 */
 
select pd.name, pv.name
from products pd
	inner join providers pv on pv.id=pd.id_providers
	inner join categories c on c.id=pd.id_categories 
where c.id = 6