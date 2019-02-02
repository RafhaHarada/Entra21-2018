DROP TABLE IF EXISTS gordices;
CREATE TABLE gordices(
	nome 		VARCHAR(100)/*DEFAULT 'X-CALABRESA'*/,
	preco 		DOUBLE,
	quantidade 	SMALLINT UNSIGNED,
	ativo 		BOOLEAN DEFAULT TRUE
);

DELETE FROM gordices WHERE preco >= 0;
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

INSERT INTO gordices (nome,preco,quantidade)
VALUE
('Coxinha de Abacate',5,1);

INSERT INTO gordices (nome,preco,quantidade)
VALUE
('Pizza de Abacate',15,1);