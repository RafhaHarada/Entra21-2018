DROP DATABASE IF EXISTS exemplo_web_01;
CREATE DATABASE IF NOT EXISTS exemplo_web_01;
USE exemplo_web_01;

CREATE TABLE alimentos(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100),
	preco DOUBLE,
	quantidade SMALLINT,
	descricao VARCHAR(100)
);
