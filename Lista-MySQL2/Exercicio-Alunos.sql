-- 1
SELECT nome, cpf, nick, signo, numero_favorito, nota_1, nota_2, nota_3, nota_4, cor_preferida, data_nascimento FROM alunos;

-- 2
SELECT nome FROM alunos WHERE nota_1 > 9.0;

-- -------------------------------------------------------------------------
ALTER TABLE alunos ADD media FLOAT;
UPDATE alunos SET media=(nota_1+nota_2+nota_3+nota_4)/4 WHERE media IS NULL;
-- -------------------------------------------------------------------------

-- 3
SELECT nome,nota_1,nota_2,nota_3,nota_4,media FROM alunos;

-- 4
SELECT COUNT(nome) FROM alunos WHERE signo = 'Peixes';

-- 5
SELECT SUM(nota_1) FROM alunos;

-- 6
SELECT AVG(nota_2) FROM alunos;

-- 7
SELECT nome FROM alunos WHERE nota_1 = (SELECT MIN(nota_1) FROM alunos);

-- 8
SELECT nome,nota_1,nota_2,nota_3,nota_4,LENGTH(nome) FROM alunos WHERE nome = (SELECT MAX(nome) FROM alunos);
SELECT nome,length(nome ) from alunos;

-- 9
SELECT cor_preferida, COUNT(cor_preferida) FROM alunos WHERE cor_preferida = 'Gelo';

-- 10
SELECT COUNT(nome) FROM alunos WHERE nome LIKE 'Francisco%';

-- 11
SELECT COUNT(nome) FROM alunos WHERE nome LIKE '%Luc%';

-- 12
SELECT nome,signo,data_nascimento FROM alunos WHERE signo = 'Áries';

-- 13
SELECT nome,nota_1,nota_2,nota_3,nota_4 FROM alunos WHERE media = (SELECT MAX(media) FROM alunos);

-- --------------------------------------
ALTER TABLE alunos ADD status VARCHAR(9);
-- --------------------------------------

-- 14
IF (SELECT media FROM alunos) < 5
	UPDATE alunos SET status = 'Reprovado' WHERE status is null
ELSE IF (SELECT media FROM alunos) < 7
	UPDATE alunos SET status = 'Em exame' WHERE status is null
ELSE 
	UPDATE alunos SET status = 'Aprovado' WHERE status is null;
SELECT nome, media, status FROM alunos;
	
-- 15
SELECT nome,nota_1,nota_2,nota_3,nota_4 FROM alunos WHERE media = (SELECT MIN(media) FROM alunos);

-- 16
SELECT COUNT(media) FROM alunos WHERE media > 7;

-- 17
SELECT nome,nick FROM alunos WHERE LENGTH(nick) = 5;

-- 18
SELECT nome FROM alunos WHERE cor_preferida = 'Ouro' OR cor_preferida = 'Amarelo-Torrado' AND media > 6.5;

-- 19
SELECT nome,DATE_FORMAT(data_nascimento, '%Y')'Ano' FROM alunos;

-- 20
SELECT nick,DATE_FORMAT(data_nascimento, '%m') FROM alunos WHERE DATE_FORMAT(data_nascimento, '%m') > 6;

-- 21
SELECT COUNT(nome) FROM alunos WHERE DATE_FORMAT(data_nascimento, '%Y') = 1996;

-- 22
SELECT COUNT(nome) FROM alunos WHERE data_nascimento = '1964-02-02' OR data_nascimento = '1994-02-02';

-- 23
SELECT nick,nota_4 FROM alunos WHERE nota_2 >= 5 AND nota_2 <=5.99;

-- 24
SELECT media FROM alunos WHERE nome = 'Josefina';

-- 25
SELECT nome,nick,nota_1,nota_2,nota_3,nota_4 FROM alunos WHERE nome LIKE '%Justino%' AND signo LIKE '‘A%';

-- 26
SELECT AVG(media) FROM alunos;