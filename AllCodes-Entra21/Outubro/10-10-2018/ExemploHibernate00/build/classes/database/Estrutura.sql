DROP DATABASE IF EXISTS exemplo_hibernate_00;
CREATE DATABASE IF NOT EXISTS exemplo_hibernate_00;
USE exemplo_hibernate_00;

CREATE TABLE sistemas(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(100)
);

CREATE TABLE alunos(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(100),
	nota1 double,
	nota2 double,
	nota3 double,
	nota4 double,
	quantidade_faltas int
);