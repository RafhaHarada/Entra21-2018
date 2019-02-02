USE exercicios;

DROP TABLE IF EXISTS clientes;
CREATE TABLE IF NOT EXISTS clientes(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	sexo CHAR(1) NOT NULL
);

DROP TABLE IF EXISTS celulares;
CREATE TABLE IF NOT EXISTS celulares(
	id INT AUTO_INCREMENT PRIMARY KEY,
	id_cliente INTEGER NOT NULL,
	valor VARCHAR(100) NOT NULL,
	ativo BOOLEAN DEFAULT TRUE,
	FOREIGN KEY(id_cliente) references clientes(id)
);

DROP TABLE IF EXISTS emails;
CREATE TABLE IF NOT EXISTS emails(
	id INT AUTO_INCREMENT PRIMARY KEY,
	id_cliente INTEGER NOT NULL,
	valor VARCHAR(100) NOT NULL,
	ativo BOOLEAN DEFAULT TRUE,
	FOREIGN KEY(id_cliente) references clientes(id)
);

DROP TABLE IF EXISTS contas_a_pagar;
CREATE TABLE IF NOT EXISTS contas_a_pagar(
	id INT AUTO_INCREMENT PRIMARY KEY,
	id_cliente INTEGER NOT NULL,
	valor REAL UNSIGNED NOT NULL,
	data_vencimento DATE,
	valor_pago REAL DEFAULT 0,
	status VARCHAR(100) DEFAULT 'Pagar',
	ativo BOOLEAN DEFAULT TRUE,
	FOREIGN KEY(id_cliente) references clientes(id)
);

DROP TABLE IF EXISTS contas_a_receber;
CREATE TABLE IF NOT EXISTS contas_a_receber(
	id INT AUTO_INCREMENT PRIMARY KEY,
	id_cliente INTEGER NOT NULL,
	valor_a_receber REAL,
	data_pagamento DATE,
	valor_recebido REAL DEFAULT 0,
	data_recebimento DATE,
	status VARCHAR(100) DEFAULT 'Receber',
	ativo BOOLEAN DEFAULT TRUE,
	FOREIGN KEY(id_cliente) references clientes(id)
);

INSERT INTO clientes(nome,sexo) VALUES
('Germana','F'),
('Salvador','M'),
('Úrsula','F'),
('Aluísio','M');

INSERT INTO emails(id_cliente,valor) VALUES
(2,'bernardodiegoalves-77@vianetfone.com.br'),
(1,'a68341ef3b@emailna.life'),
(3,'zpgkmkem@boximail.com'),
(1,'ger@bol.com'),
(2,'gabrieldiegofernandodarocha_@uoul.com'),
(3,'iancauearaujo_@10clic.com.br'),
(2,'germana@gmail.com'),
(1,'salvador@hotmail.com');

INSERT INTO celulares (id_cliente,valor) VALUES
(1,'(79) 99973-5114'),
(2,'(27) 98390-6475'),
(1,'(55) 98587-4266'),
(4,'(14) 98387-5333'),
(3,'(92) 98983-2809'),
(4,'(55) 98616-2303');

INSERT INTO contas_a_pagar(id_cliente,data_vencimento,valor) VALUES
((SELECT id FROM clientes WHERE clientes.nome = 'Germana'),'2018-06-15',500.00),
((SELECT id FROM clientes WHERE clientes.nome = 'Salvador'),'2018-06-29',320.50),
((SELECT id FROM clientes WHERE clientes.nome = 'Úrsula'),'2018-06-07',450.00),
((SELECT id FROM clientes WHERE clientes.nome = 'Aluísio'),'2018-08-27',1300.00),
((SELECT id FROM clientes WHERE clientes.nome = 'Aluísio'),'2018-10-10',777.00),
((SELECT id FROM clientes WHERE clientes.nome = 'Úrsula'),'2018-10-14',8001.00),
((SELECT id FROM clientes WHERE clientes.nome = 'Salvador'),'2018-11-25',232.12),
((SELECT id FROM clientes WHERE clientes.nome = 'Úrsula'),'2018-09-13',104.23),
((SELECT id FROM clientes WHERE clientes.nome = 'Germana'),'2018-07-17',65.00),
((SELECT id FROM clientes WHERE clientes.nome = 'Aluísio'),'2018-10-06',98.83),
((SELECT id FROM clientes WHERE clientes.nome = 'Salvador'),'2018-12-12',12.17),
((SELECT id FROM clientes WHERE clientes.nome = 'Salvador'),'2018-12-23',6.25);

INSERT INTO contas_a_receber(id_cliente,data_pagamento,valor_a_receber)
VALUES
((SELECT id FROM clientes WHERE clientes.nome = 'Úrsula'),'2018-12-08',78.97),
((SELECT id FROM clientes WHERE clientes.nome = 'Salvador'),'2018-11-24',700.00),
((SELECT id FROM clientes WHERE clientes.nome = 'Germana'),'2018-10-09',45.87),
((SELECT id FROM clientes WHERE clientes.nome = 'Germana'),'2019-01-04',39.50),
((SELECT id FROM clientes WHERE clientes.nome = 'Aluísio'),'2018-11-30',123.45),
((SELECT id FROM clientes WHERE clientes.nome = 'Úrsula'),'2018-09-07',987.65),
((SELECT id FROM clientes WHERE clientes.nome = 'Salvador'),'2018-07-06',456.00);

SELECT clientes.nome'Nome',emails.valor'E-mails'
	FROM emails
	JOIN clientes ON(emails.id_cliente = clientes.id);

SELECT clientes.nome'Nome',emails.valor'E-mails'
	FROM emails
	JOIN clientes ON(emails.id_cliente = clientes.id)
	ORDER BY clientes.nome, emails.valor;

SELECT clientes.nome'Nome',emails.valor'Maior E-mails'
	FROM emails
	JOIN clientes ON(emails.id_cliente = clientes.id)
	GROUP BY clientes.nome
	ORDER BY MAX(emails.valor);

SELECT clientes.nome'Nome',celulares.valor'Celulares'
	FROM celulares
	JOIN clientes ON(celulares.id_cliente = clientes.id);

SELECT clientes.nome'Nome',celulares.valor'Celulares'
	FROM celulares
	JOIN clientes ON(celulares.id_cliente = clientes.id)
	WHERE ativo = TRUE;

UPDATE contas_a_pagar
	SET contas_a_pagar.valor_pago = 100,
		contas_a_pagar.data_vencimento = CURDATE()-1,
		contas_a_pagar.status = 'Pago'
	WHERE contas_a_pagar.id_cliente = (SELECT id FROM clientes WHERE clientes.nome = 'Salvador');

SELECT contas_a_pagar.valor_pago,contas_a_pagar.data_vencimento,contas_a_pagar.status 
	FROM contas_a_pagar
	WHERE contas_a_pagar.id_cliente = (SELECT id FROM clientes WHERE clientes.nome = 'Salvador');

UPDATE contas_a_pagar
	SET contas_a_pagar.valor_pago = 700,contas_a_pagar.data_vencimento = CURDATE(),contas_a_pagar.status = 'Pago'
	WHERE contas_a_pagar.id_cliente = (SELECT id FROM clientes WHERE clientes.nome = 'Salvador') 
		AND contas_a_pagar.valor = 700;

SELECT clientes.nome'Nome',contas_a_pagar.valor'Conta a Pagar',contas_a_pagar.data_vencimento'Data de Vencimento',contas_a_pagar.valor_pago'Valor Pago'
	FROM contas_a_pagar
	JOIN clientes ON(contas_a_pagar.id_cliente = clientes.id);

SELECT clientes.nome'Nome',contas_a_pagar.valor'Conta a Pagar', DATE_FORMAT(contas_a_pagar.data_vencimento,'%m')'Mês de Vencimento'
	FROM contas_a_pagar
	JOIN clientes ON(contas_a_pagar.id_cliente = clientes.id);

SELECT SUM(contas_a_pagar.valor)'Valor Total',clientes.nome'Nome'
	FROM contas_a_pagar
	JOIN clientes ON(contas_a_pagar.id_cliente = clientes.id)
	GROUP BY clientes.nome
	ORDER BY SUM(contas_a_pagar.valor);

UPDATE contas_a_receber 
	JOIN clientes ON (clientes.id=contas_a_receber.id_cliente)
	SET contas_a_receber.valor_recebido = 1000
	WHERE clientes.sexo = 'F';

UPDATE contas_a_receber
	JOIN clientes ON (contas_a_receber.id_cliente = clientes.id)
	SET contas_a_receber.data_recebimento = CURDATE()+1
	WHERE clientes.nome LIKE 'A%' OR clientes.nome LIKE 'S%';

SELECT clientes.nome'Nome',SUM(contas_a_receber.valor_a_receber)'Valor Total a Receber'
	FROM contas_a_receber
	JOIN clientes ON(contas_a_receber.id_cliente = clientes.id)
	GROUP BY clientes.nome;

SELECT clientes.nome'Nome',COUNT(contas_a_receber.valor_a_receber)'Contas a Receber'
	FROM contas_a_receber
	JOIN clientes ON(contas_a_receber.id_cliente = clientes.id)
	GROUP BY clientes.nome;