/**
 * DESCRIÇÃO: 
 * A nossa empresa está querendo fazer um novo contrato para o fornecimento de novos produtos superluxuosos, e para isso precisamos de alguns dados dos nossos produtos.
 * Seu trabalho é exibir o nome dos produtos, nome dos fornecedores e o preço, para os produtos cujo preço seja maior que 1000 e sua categoria seja ‘Super Luxury.
 * 
 */
 
select 
    pd.name,
    p.name,
    pd.price
from products pd
    inner join categories c ON c.id=pd.id_categories
    inner join providers p ON p.id=pd.id_providers
where pd.price > 1000.00 and c.name = 'Super Luxury'