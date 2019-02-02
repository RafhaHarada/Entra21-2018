/**
 * Author:  Alunos
 * Created: 08/10/2018
 */
DROP DATABASE IF EXISTS con;
CREATE DATABASE IF NOT EXISTS con;
USE con;

CREATE TABLE filme(
    id INT PRIMARY KEY AUTO_INCREMENT,
    ano TINYINT NOT NULL,
    ator_principal VARCHAR(100) NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    diretor VARCHAR(100) NOT NULL,
    dublado BOOLEAN NOT NULL,
    faixa_etaria VARCHAR(100) NOT NULL,
    faturamento DOUBLE NOT NULL,
    idioma_original VARCHAR(100) NOT NULL,
    legendado BOOLEAN NOT NULL,
    nome VARCHAR(100) NOT NULL,
    orcamento DOUBLE NOT NULL,
    tempo_filme SMALLINT NOT NULL
);