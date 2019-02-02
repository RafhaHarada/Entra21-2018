-- 1
UPDATE alunos
	SET nota_1 = 9.9 WHERE SUBSTRING(data_nascimento,1,4) = '1996';
SELECT SUBSTRING(data_nascimento,1,4)'Ano', nota_1 FROM alunos WHERE SUBSTRING(data_nascimento,1,4) = '1996';

-- 2
UPDATE alunos
	SET nota_2 = 1.3 WHERE nome LIKE 'Urbano%';
SELECT nome,nota_2 FROM alunos WHERE nome LIKE 'Urbano%';

-- 3
UPDATE alunos
		SET numero_favorito = ROUND((500 + 5)*RAND()+5) WHERE numero_favorito %2 != 0;
SELECT numero_favorito FROM alunos WHERE numero_favorito < 501;

-- 4
UPDATE alunos
	SET signo = 'Áries', numero_favorito = 100,cor_preferida = 'Preto',nome = 'Marcela' WHERE signo = 'Peixes';
SELECT nome,signo,numero_favorito,cor_preferida,count(nome) FROM alunos WHERE cor_preferida = 'Preto';

-- 5
UPDATE alunos
	SET cor_preferida = 'Azul', nota_2 = 9.3 WHERE cor_preferida = 'Cáqui';
SELECT cor_preferida,nota_2 FROM alunos WHERE cast(nota_2 AS DECIMAL(10,6)) = 9.3;
-- 6
UPDATE alunos
	SET cpf = '10194731189' WHERE cpf = '101.947.311-89';
SELECT cpf FROM alunos WHERE cpf ='10194731189' ;

-- 7
UPDATE alunos
	SET nota_1 = 1,nota_2 = 1,nota_3 = 1,nota_4 = 1 WHERE (nota_1 +nota_2 + nota_3 + nota_4)/4 < 4;
SELECT nota_1,nota_2,nota_3,nota_4,CAST((nota_1 + nota_2 + nota_3 + nota_4)/4 AS DECIMAL(10,2))'Media' FROM alunos WHERE (nota_1 +nota_2 + nota_3 + nota_4)/4 < 4;

-- 8
UPDATE alunos
	SET nick = 'Ninjutsu' WHERE nick = 'Fueusn';
SELECT nick FROM alunos WHERE nick = 'Ninjutsu';

-- 9
UPDATE alunos
	SET nick = 'Dobermann', cor_preferida = 'Rosa' WHERE nick = 'Saxiol';
SELECT nick,cor_preferida FROM alunos WHERE nick = 'Dobermann';

-- 10
UPDATE alunos
	SET data_nascimento = date_add(data_nascimento,INTERVAL - 1 day) WHERE data_nascimento LIKE '%-31%';
SELECT COUNT(data_nascimento) FROM alunos WHERE data_nascimento LIKE '%-30%';

-- 11
UPDATE alunos
	SET nick = 'Roxolandia', cor_preferida = 'Roxo' WHERE cor_preferida = 'Roxo' OR cor_preferida = 'Coral';
SELECT nick,cor_preferida FROM alunos WHERE cor_preferida = 'Roxo';

-- 12
UPDATE alunos
	SET data_nascimento = REPLACE(data_nascimento,SUBSTRING(data_nascimento,6,2),07) WHERE SUBSTRING(data_nascimento,6,7) = 06;
SELECT data_nascimento,SUBSTRING(data_nascimento,6,2) FROM alunos WHERE SUBSTRING(data_nascimento,6,2) = 07;