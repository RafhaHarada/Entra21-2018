-- 1
SELECT nome, codigo, categoria, descricao, altura, peso, hp, ataque, defesa, especial_ataque, especial_defesa, velocidade FROM pokemons;

-- 2
SELECT ataque, defesa, especial_ataque, especial_defesa FROM pokemons;

-- 3
SELECT nome,categoria,ataque FROM pokemons ORDER BY ataque ;

-- --------------------------------------------------------------
ALTER TABLE pokemons ADD imc FLOAT;
UPDATE pokemons SET imc=(peso/(altura*altura)) WHERE imc IS NULL;
-- --------------------------------------------------------------

-- 4
SELECT altura'Altura',peso'Peso',imc'IMC' FROM pokemons;

-- 5
SELECT altura'Altura',peso'Peso',imc'IMC' FROM pokemons ORDER BY imc DESC;

-- ------------------------------------------------------------------
ALTER TABLE pokemons ADD lengthName INT;
UPDATE pokemons SET lengthName=LENGTH(nome) WHERE lengthName IS NULL;
-- ------------------------------------------------------------------

-- 6
SELECT nome,lengthName FROM pokemons ORDER BY nome DESC;

-- 7
SELECT nome,descricao FROM pokemons WHERE lengthName > 10;

-- 8
SELECT nome,categoria,MIN(ataque) FROM pokemons WHERE (SELECT MIN(ataque) FROM pokemons);

-- 9
SELECT nome, ataque, defesa, especial_ataque, especial_defesa FROM pokemons ORDER BY nome;

-- 10
SELECT AVG(ataque) FROM pokemons;

-- 11
SELECT SUM(ataque) FROM pokemons;

-- 12
SELECT AVG(especial_ataque) FROM pokemons WHERE nome LIKE 'P%';
