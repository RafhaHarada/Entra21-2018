DROP DATABASE IF EXISTS exemplo00;
CREATE DATABASE exemplo00;
USE exemplo00;

CREATE TABLE alunos(
	nome VARCHAR(100),
	idade TINYINT
);

/*
TIPOS PARA INTEIROS
TINYINT: -128...127
SMALLINT: -32768...32767
MEDIUMINT: -8388608...8388607
INT: -2147483648...2147483647
LONG: -2^63...2^63-1
*/

DELETE FROM alunos WHERE nome <> '';
INSERT INTO alunos VALUE ('Henrique',21);
INSERT INTO alunos VALUE ('Leonardo',21);
INSERT INTO alunos VALUE ('Gustavo',22);
INSERT INTO alunos VALUE ('Lucas',16);
INSERT INTO alunos VALUE ('Daiana',22);
INSERT INTO alunos VALUE ('Logan',18);
INSERT INTO alunos VALUE ('Daiana',22);
INSERT INTO alunos VALUE ('Guilherme',17);

#SELECT * FROM alunos;

SELECT * FROM alunos;
SELECT * 
	FROM alunos 
	WHERE idade < 18;

SELECT * 
	FROM alunos 
	WHERE idade > 17;

SELECT * 
	FROM alunos 
	WHERE idade >= 18;


#////////////////////////////////////////////////////////////////
	DROP TABLE IF EXISTS gordices;
CREATE TABLE gordices(
	nome 		VARCHAR(100)/*DEFAULT 'X-CALABRESA'*/,
	preco 		DOUBLE,
	quantidade 	SMALLINT UNSIGNED,
	ativo 		BOOLEAN DEFAULT TRUE
);

INSERT INTO gordices (nome,preco,quantidade)VALUES
('X-Calabria',17.0,1),
('Pizza Calabresa',58,60),
('Batata Recheada Calabresa',12,1),
('Pastel de Calabresa',5,1),
('Kalzone de Calabresa',6.5,1),
('Porção de Calabresa com Cebola',15,1),
('Coxinha de Calabresa',3.5,1),
('X-Bacon',15.75,1),
('Pizza de Bacon',15,20),
('Coxinha de Bacon',3.5,1);

SELECT nome 'Nome', preco 'Preço do Produto'
	FROM gordices
	ORDER BY nome ASC;

SELECT nome 'Nome', preco 'Preço do Produto'
	FROM gordices
	ORDER BY nome DESC;

SELECT preco, nome, quantidade
	FROM gordices
	ORDER BY preco ASC, nome ASC;

#Busca na coluna de nome onde contem o texto calabresa no final

SELECT *
	FROM gordices
	WHERE nome LIKE '%Calabresa';

#Busca na coluna de nome onde contem o texto calabresa no comeco

SELECT *
	FROM gordices
	WHERE nome LIKE 'C%';

#Busca na coluna de nome onde contem o texto calabresa no final e no comeco

SELECT *
	FROM gordices
	WHERE nome LIKE '%Calabresa%';




UPDATE alunos SET nome = 'Frank' WHERE nome = 'Logan';
SELECT * FROM alunos;



Select * FROM gordices;
UPDATE gordices SET 
	nome = 'X-Calabresa',
	preco = 22
	WHERE nome = 'X-Calabria';
Select * FROM gordices;