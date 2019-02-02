DROP DATABASE IF EXISTS bancoAlunos;
CREATE DATABASE IF NOT EXISTS bancoAlunos;
USE bancoAlunos;

CREATE TABLE alunos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    matricula VARCHAR(100),
    nota1 DOUBLE,
    nota2 DOUBLE,
    nota3 DOUBLE,
    media DOUBLE,
    frequencia TINYINT UNSIGNED,
    status VARCHAR(100)
);