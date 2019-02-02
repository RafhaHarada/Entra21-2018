USE exercicios;

DROP TABLE IF EXISTS pessoas;
CREATE TABLE IF NOT EXISTS pessoas(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(200) UNIQUE NOT NULL,
	cpf VARCHAR(11) NOT NULL
);

DROP TABLE IF EXISTS carros;
CREATE TABLE IF NOT EXISTS carros(
	id INT AUTO_INCREMENT PRIMARY KEY,
	id_pessoa INTEGER NOT NULL,
	marca VARCHAR(150) NOT NULL,
	modelo VARCHAR(150) NOT NULL,
	ano_lancamento INTEGER NOT NULL,
	ano_fabricacao INTEGER NOT NULL,
	motor VARCHAR(150) NOT NULL,
	cor VARCHAR(100) NOT NULL,
	preco DECIMAL(9,2),
	FOREIGN KEY(id_pessoa) REFERENCES pessoas(id)
);

INSERT INTO pessoas(nome,cpf) VALUES
('Abraão Nobre','95232829483'),
('Severino Braga','87677033300'),
('Samuel Faria','98927203429'),
('Florêncio Robalo','36263517425');

INSERT INTO carros(id_pessoa,marca,modelo,ano_lancamento,ano_fabricacao,motor,cor,preco)
VALUES
((SELECT id FROM pessoas WHERE nome = 'Abraão Nobre'),
'Volkswagen','Gol',2010,2009,'8v Power Flex','Vermelho',18000),
((SELECT id FROM pessoas WHERE nome = 'Severino Braga'),
'Fiat','Brava',2000,1999,'SX 1.6 16V','Cinza',9000),
((SELECT id FROM pessoas WHERE nome = 'Samuel Faria'),
'Renault','Clio',1997,1996,'1.0 8v','Verde',5500),
((SELECT id FROM pessoas WHERE nome = 'Florêncio Robalo'),
'Volkswagen','Golf',1994,1994,'2.0 120cv','Azul',17000);

SELECT carros.marca'Marca',carros.modelo'Modelo',carros.ano_lancamento'Ano de Lançamento',ano_fabricacao'Ano de Lançamento',motor'Motor',carros.cor'Cor',preco'Preço',pessoas.nome'Dono'
	FROM pessoas
	JOIN carros ON(carros.id_pessoa = pessoas.id);

SELECT pessoas.nome'Nome',carros.marca'Marca',carros.modelo'Modelo',carros.ano_lancamento'Ano de Lançamento',carros.cor'Cor'
	FROM pessoas
	JOIN carros ON(carros.id_pessoa = pessoas.id)
	WHERE pessoas.nome = 'Samuel Faria';

