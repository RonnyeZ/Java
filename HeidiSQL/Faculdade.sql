CREATE DATABASE faculdade;

// Criando tabela Aluno
CREATE TABLE aluno (
	matricula VARCHAR(10) PRIMARY KEY, 
	nome VARCHAR(200), 
	telefone VARCHAR(13)
);

// Criando tabela Professor
CREATE TABLE professor (
	matricula VARCHAR(10) PRIMARY KEY,
	nome VARCHAR(200),
	telefone VARCHAR(13),
	titulacao VARCHAR(20)
);

// Criando tabela Cursos
CREATE TABLE cursos (
	codigo_curso VARCHAR(6) PRIMARY KEY,
	nome VARCHAR(200),
	carga_horaria INTEGER
);

// Criando tabela Disciplinas
CREATE TABLE disciplinas (
	codigo_disciplina VARCHAR(6) PRIMARY KEY,
	nome VARCHAR(200),
	carga_horaria INTEGER
);

// Inserir cursos na tabela de curso
INSERT INTO cursos (codigo_curso, nome, carga_horaria)
VALUES
("CCO", "Ciências da Computação", 3200),
("SINF", "Sistema de Informação", 3200),
("SI", "Sistemas para Internet", 1800),
("ADS", "Análise e Desenvolvimento de Sistemas", 1800);

// Inserir disciplinas na tabela de disciplina
INSERT INTO disciplinas (codigo_disciplina, nome, carga_horaria)
VALUES
("DLP1", "Linguagem de Programação 1", 80),
("DLP2", "Linguagem de Programação 2", 80),
("DBD1", "Banco de Dados 1", 80),
("DBD2", "Banco de Dados 2", 80),
("DRC0", "Rede de Computadores", 80),
("DEC0", "Engenharia da Computação", 80),
("DIP0", "Introdução a Programação", 80),
("DTF1", "Tecnologias para Front-End 1", 80),
("DAC0", "Arquitetura de Computadores", 80);

// Rodar a tabela de Cursos
SELECT codigo_curso, nome, carga_horaria FROM cursos

// Rodar a tabela de Disciplinas
SELECT codigo_disciplina, nome, carga_horaria FROM disciplinas
