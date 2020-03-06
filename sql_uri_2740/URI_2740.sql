/**
 * DESCRIÇÃO: 
 * A Liga Internacional de Escavação Subterrânea já é um sucesso entre os esportes alternativos,
 * porém todos que trabalham na organização do evento trabalham com escavação e não computação.
 *  Então você foi contratado para solucionar o problema da Liga.
 * 
 * Selecione os três primeiros colocados da lista com a frase inicial Podium:
 * e também, os dois últimos times que serão rebaixados para série B com a frase inicial Demoted:
 * 
 */
 
(select concat ('Podium: ', team) as name
from league
order by position asc limit 3)

UNION ALL

select name from (select * from (select concat ('Demoted: ', team) as name, position
from league
order by position desc limit 2) as leaguel order by position asc) as leag;