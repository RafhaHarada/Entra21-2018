-- Soma os registros da coluna preço
SELECT SUM(preco) FROM gordices;

-- Média os registros da coluna preço
SELECT AVG(preco) FROM gordices;

-- Retorna o registro com o menor preço
SELECT nome, MIN(preco) FROM gordices
WHERE preco = (SELECT MIN(preco) FROM gordices);

-- Retorna o registro com o maior preço
SELECT nome, MAX(preco) FROM gordices
WHERE preco = (SELECT MAX(preco) FROM gordices);