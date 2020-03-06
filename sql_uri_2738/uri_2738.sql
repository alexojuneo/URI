/**
 * DESCRIÇÃO: 
 * A Universidade Tecnológica de Marte está com seu concurso aberto para Pesquisadores. 
 * Porém o computador que processava os dados dos candidatos estragou.
 * Você deve mostrar a lista dos candidatos, contendo o nome do candidato e a sua pontuação final (com duas casas decimais após a vírgula).
 * Lembre-se de mostrar a lista ordenada pela pontuação do candidato (maior pontuação no topo da lista).
 * A pontuação do candidato é o resultado da média ponderada descrita abaixo:
 * 
 * Avg = ((math * 2) + (specific * 3) + (project_plan * 5)) / 10
 * 
 */
 
select ca.name, round((((sc.math * 2) + (sc.specific * 3) + (sc.project_plan * 5))/10),2) as avg
from score sc
	inner join candidate ca on ca.id=sc.candidate_id 
order by avg desc