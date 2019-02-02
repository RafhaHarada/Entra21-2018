DROP DATABASE IF EXISTS exercicio02;
CREATE DATABASE exercicio02;
USE exercicio02;

DROP TABLE IF EXISTS enderecos;
CREATE TABLE enderecos(
	estado char(2) DEFAULT '',
	cidade varchar(140) DEFAULT '',
	bairro varchar(120) DEFAULT '',
	cep char(10) DEFAULT '',
	logradouro varchar(250) DEFAULT '',
	numero smallint DEFAULT 00,
	complemento text DEFAULT ''
);

DELETE FROM enderecos WHERE estado <> '';
INSERT INTO enderecos (estado,cidade,bairro,cep,logradouro,numero,complemento) VALUES
('AC','Rio Branco','Ayrton Senna','69.911-866','Estrada Deputado José Rui da Silveira Lino',282,'Casa'),
('SC','Biguaçu','Fundos','88.161-400','',995,''),
('MG','Santa Luzia','Padre Miguel','33.082-050','Rua Buenos Aires',371,'Apartamento'),
('BA','','São Tomé de Paripe','40.800-361','Travessa Luís Hage',685,''),
('MG','Ipatinga','Vila Celeste','','Rua Antônio Boaventura Batista',645,''),
('RS','Passo Fundo','Nenê Graeff','99.030-250','',154,''),
('AM','Manaus','Petrópolis','69.079-300','Rua Coronel Ferreira Sobrinho',264,'Fundos'),
('TO','Gurupi','Muniz Santana','77.402-130','Rua Adelmo Aires Negri',794,''),
('AC','','Preventório','','Beco da Ligação II',212,'Bloco B'),
('AP','Santana','Comercial','68.925-073','Rua Calçoene',648,''),
('PB','Cabedelo','Camalaú','58.103-052','Rua Siqueira Campos',249,'');

SELECT 
		estado'UF',
		cidade'Cidade',
		bairro'Bairro',
		cep'CEP',
		logradouro'Logradouro',
		numero'Número',
		complemento'complemento'
		FROM enderecos;