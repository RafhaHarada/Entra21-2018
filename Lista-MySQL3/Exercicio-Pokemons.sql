-- 1
UPDATE pokemons 
	SET categoria = 'Seed' WHERE codigo >= 50 AND codigo <= 100;
SELECT codigo,categoria FROM pokemons WHERE codigo >= 40 AND codigo <= 110;

-- 2
UPDATE pokemons 
	SET ataque = 29 WHERE nome LIKE '%inj%';
SELECT nome, ataque FROM pokemons WHERE nome LIKE '%inj%';

-- 3
UPDATE pokemons
	SET velocidade = 2 WHERE velocidade = 5;
SELECT nome, velocidade FROM pokemons WHERE velocidade >=4 AND velocidade <=6 ORDER BY velocidade;

-- 4
UPDATE pokemons
	SET categoria = 'Manipulate' WHERE codigo = 100;
SELECT codigo,categoria FROM pokemons WHERE codigo = 100;

-- 5
UPDATE pokemons
	SET nome = REPLACE(nome,'R','c') WHERE nome LIKE 'R%';
SELECT nome FROM pokemons WHERE nome LIKE 'C%' AND nome LIKE 'c%';

-- 6
UPDATE pokemons
	SET altura = 0.51, peso = 0.7 WHERE altura = 0.5;
SELECT altura, peso FROM pokemons WHERE altura = 0.51;

-- 7
UPDATE pokemons
	SET codigo=1, defesa=1, ataque=1, especial_ataque=3, especial_defesa=4
		WHERE especial_defesa = 3 AND especial_ataque = 4;
SELECT codigo,defesa,ataque,especial_ataque, especial_defesa FROM pokemons 
	WHERE especial_defesa = 3 AND especial_ataque = 4;

-- 8
UPDATE pokemons
	SET nome = SUBSTRING(nome,1,10) WHERE LENGTH(nome) > 10;
SELECT nome FROM pokemons WHERE LENGTH(nome = 10);

-- 9
UPDATE pokemons
	SET categoria = 'Water' WHERE descricao LIKE '%flames%';
SELECT nome,categoria FROM pokemons WHERE descricao LIKE '%flames%';

-- 10
UPDATE pokemons
	SET codigo = 151 WHERE codigo = 155;
SELECT codigo FROM pokemons WHERE codigo > 150 AND codigo < 160;

-- 11
UPDATE pokemons
	SET nome = 'Naruto', ataque = 1 WHERE nome = 'Kabuto';
SELECT nome,ataque FROM pokemons WHERE nome = 'Naruto';

-- 12
UPDATE pokemons
	SET nome = 'Sasuke', especial_ataque = 8002, ataque = 8001 
		WHERE nome = 'Mew' OR nome = 'Mewtwo';
SELECT nome,especial_ataque,ataque FROM pokemons WHERE nome = 'Sasuke';

-- 13
UPDATE pokemons
	SET descricao='Lorem ipsum', nome = 'Tyranitar', categoria='Wood Gecko' 
		WHERE codigo %2 = 0;
SELECT nome, categoria, descricao FROM pokemons /* WHERE codigo %2 = 0*/;
