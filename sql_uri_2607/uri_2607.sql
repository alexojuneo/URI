/**
 * DESCRIÇÃO: 
 * Todos os meses a empresa pede um relatório das cidades que os fornecedores estão cadastrados. 
 * Dessa vez não vai ser diferente, faça uma consulta no Banco de Dados que retorne todas as cidades dos fornecedores, mas em ordem alfabética.
 *
 */
 
select distinct 
    city 
from providers 
order by city asc