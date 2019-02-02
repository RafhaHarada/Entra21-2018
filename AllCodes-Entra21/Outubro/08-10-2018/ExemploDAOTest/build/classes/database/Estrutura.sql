/**
 * Author: Rafael Alipio Harada (rafhaharada@gmail.com)
 * Created: 08/10/2018
 */

DROP DATABASE IF EXISTS con;
CREATE DATABASE IF NOT EXISTS con;
USE con;

CREATE TABLE macarroes(
    id INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(100) NOT NULL,
    marca VARCHAR(100) NOT NULL,
    peso DOUBLE NOT NULL,
    aldente BOOLEAN NOT NULL,
    po BOOLEAN NOT NULL
);