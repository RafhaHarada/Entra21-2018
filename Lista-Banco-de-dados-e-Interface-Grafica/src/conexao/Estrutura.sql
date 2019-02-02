--@author Rafael Alipio Harada

DROP DATABASE IF EXISTS exercicio_DB_GUI;
CREATE DATABASE IF NOT EXISTS exercicio_DB_GUI;
USE exercicio_DB_GUI;

CREATE TABLE alunos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    codigo_matricula VARCHAR(100),
    nota_1 FLOAT UNSIGNED,
    nota_2 FLOAT UNSIGNED,
    nota_3 FLOAT UNSIGNED,
    media FLOAT UNSIGNED,
    frequencia TINYINT UNSIGNED,
    status VARCHAR(100)
);