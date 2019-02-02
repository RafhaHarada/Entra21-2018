-- 1
DELETE FROM alunos WHERE nome LIKE '%Francisco%';

-- 2
DELETE FROM alunos WHERE YEAR(data_nascimento) AS '1994';

-- 3
DELETE FROM alunos WHERE signo = 'Gêmeos';

-- 4
DELETE FROM alunos WHERE nome LIKE 'Reinaldo%';

-- 5
DELETE FROM alunos WHERE nome LIKE '%Carvalho';

-- 6
DELETE FROM alunos WHERE MONTH(data_nascimento) AS '07';

-- 7
DELETE FROM alunos WHERE nota_1 > nota_2 AND nota_4 < nota_3;

-- 8
DELETE FROM alunos WHERE cpf LIKE '145%';

-- 9
DELETE FROM alunos WHERE cor_preferida = 'Bordo' AND signo = 'Capricórnio'
		OR cor_preferida = 'Cinza-claro' AND signo = 'Aquários';

-- 10
DELETE FROM alunos WHERE (nota_1+nota_2+nota_3+nota_4)/4 < 4;

-- 11
DELETE FROM alunos WHERE DAY(data_nascimento) AS '28';