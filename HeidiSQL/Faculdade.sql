CREATE DATABASE faculdade;
  
CREATE TABLE alunos (
	matricula VARCHAR(10) PRIMARY KEY, 
	nome VARCHAR(200), 
	telefone VARCHAR(13)
);
  
CREATE TABLE professores (
	matricula VARCHAR(10) PRIMARY KEY,
	nome VARCHAR(200),
	telefone VARCHAR(13),
	titulacao VARCHAR(20)
);
  
CREATE TABLE cursos (
	codigo_curso VARCHAR(6) PRIMARY KEY,
	nome VARCHAR(200),
	carga_horaria INTEGER
);
  
CREATE TABLE disciplinas (
	codigo_disciplina VARCHAR(6) PRIMARY KEY,
	nome VARCHAR(200),
	carga_horaria INTEGER
);
  
INSERT INTO cursos (codigo_curso, nome, carga_horaria)
VALUES
("CCO", "Ciências da Computação", 3200),
("SINF", "Sistema de Informação", 3200),
("SI", "Sistemas para Internet", 1800),
("ADS", "Análise e Desenvolvimento de Sistemas", 1800);

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

/*SELECT codigo_curso, nome, carga_horaria FROM cursos*/

/*SELECT codigo_disciplina, nome, carga_horaria FROM disciplinas*/

/* [turma] <--- [disciplinas] */
CREATE TABLE turma (
	cod_turma INTEGER PRIMARY KEY,
	turno VARCHAR(10),
	disciplina VARCHAR(6),
	CONSTRAINT fk_disciplina_turma FOREIGN KEY (disciplina) 
	REFERENCES disciplinas(codigo_disciplina)	
);

/* [prof_disciplina] <---- [disciplinas] + [professores] */
CREATE TABLE prof_disciplina(
	disciplina VARCHAR(6),
	professor VARCHAR(10),
	CONSTRAINT PRIMARY KEY (disciplina, professor),
	
	CONSTRAINT fk_disciplina_professor FOREIGN KEY (disciplina)
	REFERENCES disciplinas(codigo_disciplina),
	
	CONSTRAINT fk_professor_disciplina FOREIGN KEY (professor) 
	REFERENCES professores(matricula)
);

/* [curso_disciplina] <---- [disciplinas] + [cursos] */
CREATE TABLE curso_disciplina(
	curso VARCHAR(6),
	disciplina VARCHAR(6),
	CONSTRAINT PRIMARY KEY (curso, disciplina),
	
	CONSTRAINT fk_curso_disciplina FOREIGN KEY (curso)
	REFERENCES cursos(codigo_curso),
	
	CONSTRAINT fk_disciplina_curso FOREIGN KEY (disciplina)
	REFERENCES disciplinas(codigo_disciplina)
)
