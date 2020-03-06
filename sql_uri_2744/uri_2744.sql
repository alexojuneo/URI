/**
 * DESCRIÇÃO: 
 * Você foi contratado para dar consultoria a uma empresa.
 * Analisando o banco de dados você notou que as senhas gravadas dos usuários estão em formato de texto,
 * sendo que isso pode gerar uma falha de segurança, uma vez que elas não estão criptografadas.
 * 
 * Por tanto você deve selecionar o id, a senha atual e a senha transformada em MD5 de cada usuário na tabela account.
 *
 */
 
select id, password, md5(password) as MD5
from account;
