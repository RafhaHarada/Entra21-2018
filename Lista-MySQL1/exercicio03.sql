DROP DATABASE IF EXISTS exercicio03;
CREATE DATABASE exercicio03;
USE exercicio03;

DROP TABLE IF EXISTS champions;
CREATE TABLE champions(
	nome varchar(50),
	descricao varchar(50),
	habilidade1 varchar(50),
	habilidade2 varchar(50),
	habilidade3 varchar(50),
	habilidade4 varchar(50),
	habilidade5 varchar(50)
);

DELETE FROM champions WHERE nome <> '';
INSERT INTO champions (nome,descricao,habilidade1,habilidade2,habilidade3,habilidade4,habilidade5) VALUES
('Katarina','a Lâmina Sinistra','Voracidade','Lâmina Saltitante','Preparação','Shunpo','Lótus da Morte'),
('Yasuo','','Estilo do Errante','Tempestade de Aço','Parede de Vento','Espada Ágil','Último Suspiro'),
('Master','Yi o Espadachim Wuju','Ataque Duplo','','','',''),
('Vayne','a Caçadora Noturna','Caçadora Noturna','Rolamento','Dardos de Prata','Condenar','Hora Final'),
('Lee Sin','o Monge Cego',' Agitação','Onda Sônica / Ataque Ressonante','Proteger / Vontade de Ferro','Tempestade / Mutilar',''),
('Vi','a Defensora de Piltover','Blindagem','','Pancada Certeira','Força Excessiva','Saque e Enterrada'),
('Diana','o Escárnio da Lua','Espada de Prata Lunar','Golpe Crescente','Cascata Lívida','Colapso Minguante','Zênite Lunar'),
('Annie','a Criança Sombria','Piromania','Desintegrar','Incinerar','Escudo Fundido','Invocar: Tibbers'),
('Aatrox','','Poço de Sangue','Voo Sombrio','Sede de Sangue / Preço em Sangue','Lâminas da Aflição','Massacre');

SELECT 
		nome'Nome',
		descricao'Descricao',
		habilidade1'Habilidade 1',
		habilidade2'Habilidade 2',
		habilidade3'Habilidade 3',
		habilidade4'Habilidade 4',
		habilidade5'Habilidade 5'
		FROM champions ORDER BY nome;
-- --