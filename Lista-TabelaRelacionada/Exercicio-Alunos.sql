USE exercicios;

DROP TABLE IF EXISTS alunos;
CREATE TABLE IF NOT EXISTS alunos(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) UNIQUE NOT NULL,
	idade INTEGER NOT NULL
);

DROP TABLE IF EXISTS caracteristicas;
CREATE TABLE IF NOT EXISTS caracteristicas(
	id INT AUTO_INCREMENT PRIMARY KEY,
	id_alunos INTEGER NOT NULL,
	nome VARCHAR(150) NOT NULL,
	FOREIGN KEY(id_alunos) REFERENCES alunos(id)
);

INSERT INTO alunos(nome,idade) VALUES
('Alice',18),
('Sophia',4),
('Miguel',9),
('Heitor',23),
('Valentina',15),
('Joaquim',49);

INSERT INTO caracteristicas(id_alunos,nome) VALUES
((SELECT id FROM alunos WHERE nome = 'Heitor'),'Egoísta'),
((SELECT id FROM alunos WHERE nome = 'Alice'),'Organizado(a)'),
((SELECT id FROM alunos WHERE nome = 'Sophia'),'Pontual'),
((SELECT id FROM alunos WHERE nome = 'Miguel'),'Criativo(a)'),
((SELECT id FROM alunos WHERE nome = 'Heitor'),'Proativo(a)'),
((SELECT id FROM alunos WHERE nome = 'Alice'),'Altruísta'),
((SELECT id FROM alunos WHERE nome = 'Valentina'),'Pessimista'),
((SELECT id FROM alunos WHERE nome = 'Joaquim'),'Flexível modelo'),
((SELECT id FROM alunos WHERE nome = 'Sophia'),'Observadora'),
((SELECT id FROM alunos WHERE nome = 'Joaquim'),'Paciente'),
((SELECT id FROM alunos WHERE nome = 'Heitor'),'Indelicado(a)'),
((SELECT id FROM alunos WHERE nome = 'Sophia'),'Desobediente'),
((SELECT id FROM alunos WHERE nome = 'Miguel'),'Intolerante'),
((SELECT id FROM alunos WHERE nome = 'Joaquim'),'Empático(a)'),
((SELECT id FROM alunos WHERE nome = 'Sophia'),'Egoísta'),
((SELECT id FROM alunos WHERE nome = 'Heitor'),'Egoísta'),
((SELECT id FROM alunos WHERE nome = 'Joaquim'),'Altruísta'),
((SELECT id FROM alunos WHERE nome = 'Sophia'),'Sensível');

SELECT alunos.nome'Nome', caracteristicas.nome'Características'
	FROM alunos
	JOIN caracteristicas ON(caracteristicas.id_alunos = alunos.id);

SELECT COUNT(alunos.nome)'Quantidade de alunos altruístas'
	FROM alunos
	JOIN caracteristicas ON(caracteristicas.id_alunos = alunos.id)
	WHERE caracteristicas.nome = 'Altruísta';

SELECT COUNT(alunos.nome)'Quantidade de alunos',caracteristicas.nome'Características'
	FROM alunos
	JOIN caracteristicas ON(caracteristicas.id_alunos = alunos.id)
	GROUP BY caracteristicas.nome;

SELECT caracteristicas.nome 'Características da Sophia'
	FROM alunos
	JOIN caracteristicas ON(caracteristicas.id_alunos = alunos.id)
	WHERE alunos.nome = 'Sophia';