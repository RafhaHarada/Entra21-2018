-- 1
DELETE FROM pokemons WHERE categoria = 'Seed';

-- 2
DELETE FROM pokemons WHERE nome LIKE 'Nid%';

-- 3
DELETE FROM pokemons WHERE categoria LIKE 'Snow%';

-- 4
DELETE FROM pokemons WHERE ataque = 2 OR defesa = 1;

-- 5
DELETE FROM pokemons WHERE especial_ataque %2 = 0;

-- 6
DELETE FROM pokemons WHERE LENGTH(nome) = 10;

-- 7
DELETE FROM pokemons WHERE LENGTH(categoria) < 4;

-- 8
DELETE FROM pokemons WHERE velocidade %2 != 0;

-- 9
DELETE FROM pokemons WHERE nome LIKE 'Uno%' 
			OR nome LIKE 'CHARM%';

-- 10
DELETE FROM pokemons WHERE WHERE categoria LIKE 'Flower'
			AND codigo >= 45 
			AND codigo <= 200;

-- 11
DELETE FROM pokemons WHERE descricao LIKE '%shell%';

-- 12
DELETE FROM pokemons WHERE peso >= 100;

-- 13
DELETE FROM pokemons WHERE altura < 1;

-- 14
DELETE FROM pokemons WHERE especial_defesa > 3;

-- 15
DELETE FROM pokemons WHERE LENGTH(descricao) > 150;

-- 16
DELETE FROM pokemons WHERE descricao LIKE '%good%';

-- 17
DELETE FROM pokemons WHERE codigo %2 = 0;

-- 18
DELETE FROM pokemons WHERE nome = 'Lileep';

-- 19
DELETE FROM pokemons WHERE especial_ataque = 5;

-- 20
DELETE FROM pokemons WHERE codigo < 100;