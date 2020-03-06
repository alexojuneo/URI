/**
 * DESCRIÇÃO: 
 * Uma Vídeo locadora contratou seus serviços para catalogar os filmes dela. 
 * Eles precisam que você selecione o código e o nome dos filmes cuja descrição do gênero seja 'Action'.
 *
 */

select m.id, m.name
from movies m
    inner join genres g ON g.id=m.id_genres
where g.description = 'Action'