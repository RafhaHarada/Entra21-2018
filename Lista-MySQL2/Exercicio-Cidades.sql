-- 1
SELECT estado,cidade FROM cidades;

-- 2
SELECT cidade FROM cidades WHERE cidade LIKE 'A%';

-- 3
SELECT cidade FROM cidades WHERE cidade LIKE '%apar%';

-- 4
SELECT cidade FROM cidades WHERE cidade LIKE 'W%';

-- 5
SELECT estado,cidade FROM cidades WHERE cidade LIKE '%tuba' ORDER BY estado DESC;

-- 6
SELECT cidade FROM cidades WHERE LENGTH(cidade) > 15 ORDER BY LENGTH(cidade);

-- 7
SELECT cidade FROM cidades;

-- 8
SELECT COUNT(cidade) FROM cidades WHERE estado = 'SC';

-- 9
SELECT cidade,LENGTH(cidade) FROM cidades WHERE LENGTH(cidade) = 10;