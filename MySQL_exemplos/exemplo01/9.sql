UPDATE alunos SET nome = 'Frank' WHERE nome = 'Logan';
SELECT * FROM alunos;



SELECT * FROM gordices;
UPDATE gordices SET 
	nome = 'X-Calabresa',
	preco = 22
	WHERE nome = 'X-Calabria';
SELECT nome, preco FROM gordices;
DELETE FROM gordices WHERE preco <=15;
SELECT nome, preco FROM gordices;