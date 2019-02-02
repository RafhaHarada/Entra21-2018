-- 1
UPDATE cidades SET estado = 'SS' WHERE estado = 'sc';
SELECT estado,cidade FROM cidades WHERE estado = 'SS';

-- 2
UPDATE cidades
	SET cidade = 'Brumenau', estado = 'SC' WHERE cidade = 'Blumenau';
SELECT cidade, estado FROM cidades WHERE estado = 'SC';

-- 3
UPDATE cidades
	SET cidade = 'Batata' WHERE cidade LIKE 'Bata%';
SELECT cidade,estado FROM cidades WHERE cidade LIKE 'Bata%';

-- 4
UPDATE cidades
	SET cidade = REPLACE(cidade, 'Belo', 'Lindo') WHERE cidade LIKE '%Belo%';
SELECT cidade, estado FROM cidades WHERE cidade LIKE '%Lindo%';

-- 5
UPDATE cidades
	SET estado = 'SC' WHERE cidade LIKE 'Indaia%';
SELECT cidade,estado FROM cidades WHERE estado = 'SC';

-- 6
UPDATE cidades
	SET estado = 'SC' WHERE cidade LIKE '%Timbó%';
SELECT cidade,estado FROM cidades WHERE estado = 'SC';

-- 7
UPDATE cidades
	SET cidade = REPLACE(cidade,'José', 'Josué') WHERE cidade LIKE '%José%';
SELECT cidade FROM cidades WHERE cidade LIKE '%Josué%';

-- 8
UPDATE cidades
	SET estado = 'PS' WHERE estado = 'SP';
SELECT estado,cidade FROM cidades WHERE estado = 'PS';

-- 9
UPDATE cidades
	SET cidade = 'Qualquer Texto' WHERE LENGTH(cidade) = 10;
SELECT cidade FROM cidades WHERE LENGTH(cidade) = 14;

-- 10
UPDATE cidades
	SET cidade = 'It' WHERE cidade LIKE 'It%';
SELECT cidade FROM cidades WHERE cidade LIKE 'It%';

-- 11
UPDATE cidades
	SET estado = 'TO' WHERE cidade LIKE '%ã';

SELECT cidade,estado FROM cidades WHERE ASCII(RIGHT(cidade,1)) = 195;