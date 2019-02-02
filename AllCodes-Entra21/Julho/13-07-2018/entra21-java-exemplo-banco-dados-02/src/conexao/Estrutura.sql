DROP DATABASE IF EXISTS exemplo_banco_dados_02;

CREATE DATABASE IF NOT EXISTS exemplo_banco_dados_02;

USE exemplo_banco_dados_02;

CREATE TABLE alunos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    nota1 DOUBLE,
    nota2 DOUBLE,
    nota3 DOUBLE,
    nota4 DOUBLE,
    materia VARCHAR(45),
    descricao TEXT
);