SGA - Sistema de gerenciamento de alunos
tarefa feita para avaliação na Faculdade de Ferraz de Vasconcelos. apresentação dia 05/12/2023

Banco de dados para apoio:

DROP DATABASE if EXISTS estudantes; CREATE DATABASE estudantes; USE estudantes;

CREATE TABLE estudante( id BIGINT PRIMARY KEY AUTO_INCREMENT, idade INT NOT NULL, nome VARCHAR(30) NOT NULL, curso VARCHAR(30) NOT NULL, email VARCHAR (40) NOT NULL, cpf VARCHAR (11) NOT NULL, senha VARCHAR (200) NOT NULL );

CREATE TABLE administrador ( id BIGINT PRIMARY KEY AUTO_INCREMENT, idade INT NOT NULL, nome VARCHAR(30) NOT NULL, email VARCHAR(30) NOT NULL, cpf VARCHAR(11) NOT NULL, senha VARCHAR (200) NOT NULL );

CREATE TABLE curso ( id BIGINT PRIMARY KEY AUTO_INCREMENT, nome_curso VARCHAR(30) NOT NULL, carga_horaria VARCHAR(30) NOT NULL, qtt_alunos INT NOT NULL, materias INT NOT NULL );

CREATE TABLE func_secretaria( id BIGINT PRIMARY KEY AUTO_INCREMENT, idade INT NOT NULL, nome VARCHAR(30) NOT NULL, email VARCHAR (40) NOT NULL, cpf VARCHAR (11) NOT NULL, senha VARCHAR (200) NOT NULL );

CREATE TABLE materia ( id BIGINT PRIMARY KEY AUTO_INCREMENT, nome_materia VARCHAR(30) NOT NULL, modalidade VARCHAR (200) NOT NULL, curso VARCHAR(300) NOT NULL, professor VARCHAR(30) NOT NULL );

INSERT INTO estudante (id, idade, nome, curso, email, cpf,senha) VALUES (1, 23, 'Pablo Mcdonald', 'Biologia Química', 'pb@gmail.com', '11223344556', '12345');

INSERT INTO administrador(id,idade,nome,email,cpf,senha) VALUES (1,25, 'Pedro Dedoni', 'phdedoni_adm@gmail.com', '11223344556', '12345');

INSERT INTO materia(id,nome_materia,modalidade,curso,professor) VALUES(1,'biologia','Presencial','Biologia Medicinal','Aldair Souza');

INSERT INTO curso(id,nome_curso, carga_horaria,qtt_alunos, materias) VALUES (1,'Biologia Marinha','600 Horas', 120, 24);

INSERT INTO func_secretaria(id,idade,nome,email,cpf,senha) VALUES(1,45,'Maria Beltrão','mahri@gmail.com','11223344559','12345');

SELECT * FROM estudante; SELECT * FROM administrador; SELECT * FROM curso; SELECT * FROM func_secretaria; SELECT * FROM materia;
