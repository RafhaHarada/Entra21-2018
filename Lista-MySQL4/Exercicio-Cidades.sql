-- 1
DELETE FROM cidades WHERE estad0 = 'RS';

-- 2
DELETE FROM cidades WHERE estado = 'AC' AND cidade LIKE 'R%';

-- 3
DELETE FROM cidades WHERE cidade LIKE '%goas';

-- 4
DELETE FROM cidades WHERE cida LIKE '%irmãos%';

-- 5
DELETE FROM cidades WHERE estado = 'MG';

-- 6
DELETE FROM cidades WHERE cidade = 'Douradina';