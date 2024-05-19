CREATE DATABASE faculdade;

CREATE TABLE alunos (
    matricula VARCHAR(20) PRIMARY KEY,
    nome VARCHAR(150),
    telefone VARCHAR(15)
);

CREATE TABLE professores (
    matricula VARCHAR(20) PRIMARY KEY,
    nome VARCHAR(150),
    telefone VARCHAR(15),
    titulacao VARCHAR(50)
);

CREATE TABLE cursos (
    codigo_curso VARCHAR(10) PRIMARY KEY,
    nome VARCHAR(100),
    carga_horaria INTEGER
);

CREATE TABLE disciplinas (
    codigo_disciplina VARCHAR(10) PRIMARY KEY,
    nome VARCHAR(100),
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
("LP1", "Linguagem de Programação I", 80),
("LP2", "Linguagem de Programação II", 80),
("BD1", "Banco de Dados I", 80),
("BD2", "Banco de Dados II", 80),
("RDC", "Redes de Computadores", 60),
("EDC", "Engenharia da Computação", 80),
("IAP", "Introdução a Programação", 80),
("FE1", "Tecnologia para Front-End I", 80),
("ADC", "Arquitetura de Computadores", 60);

CREATE TABLE turma (
	cod_turma INTEGER PRIMARY KEY,
	turno VARCHAR(10),
	disciplina VARCHAR(10),
	professor VARCHAR(20),
	
	CONSTRAINT fk_disciplina_turma FOREIGN KEY (disciplina)
	REFERENCES disciplinas(codigo_disciplina),
	CONSTRAINT fk_professor_turma FOREIGN KEY (professor)
	REFERENCES professores(matricula)
);

/* [prof_disciplina] <---- [professores] + [disciplinas]*/
CREATE TABLE prof_disciplina (
	disciplina VARCHAR(10),
	professor VARCHAR(20),
	CONSTRAINT PRIMARY KEY(disciplina, professor),
	CONSTRAINT fk_disc_prof FOREIGN KEY (disciplina)
	REFERENCES disciplinas(codigo_disciplina),
	CONSTRAINT fk_prof_disc FOREIGN KEY (professor)
	REFERENCES professores(matricula)
);

/* [curso_disciplina] <---- [cursos] + [disciplinas]*/
CREATE TABLE curso_disciplina (
	curso VARCHAR(10),
	disciplina VARCHAR(10),
	CONSTRAINT PRIMARY KEY(curso, disciplina),
	CONSTRAINT fk_curso_disc FOREIGN KEY(curso)
	REFERENCES cursos(codigo_curso),
	CONSTRAINT fk_disc_curso FOREIGN KEY(disciplina)
	REFERENCES disciplinas(codigo_disciplina)
);

/* [aluno_turma] <---- [aluno] + [turma]*/
CREATE TABLE aluno_turma (
	aluno VARCHAR(20),
	turma INTEGER,
	nota1 DECIMAL(2, 2),
	nota2 DECIMAL(2, 2),
	nota3 DECIMAL(2, 2),
	nota4 DECIMAL(2, 2),
	CONSTRAINT PRIMARY KEY (aluno, turma),
	CONSTRAINT fk_aluno_turma FOREIGN KEY (aluno)
	REFERENCES alunos(matricula),
	CONSTRAINT fk_turma_aluno FOREIGN KEY (turma)
	REFERENCES turma(cod_turma)
);

INSERT INTO curso_disciplina (curso, disciplina)
VALUES
("CCO", "IAP"),
("CCO", "BD1"),
("CCO", "FE1"),
("CCO", "ADC"),
("ADS", "IAP"),
("ADS", "EDC"),
("ADS", "FE1"),
("ADS", "ADC");

/* SELECT * FROM curso_disciplina */

INSERT INTO professores (matricula, nome, telefone, titulacao)
VALUES
("PROF2001", "Lucas Barreto", "83988887878", "Mestrado"),
("PROF2002", "Carla Morais", "83995741234", "Mestrado"),
("PROF2003", "Vinicius Soares", "83987651478", "Mestrado"),
("PROF2004", "Gustavo Marinho", "83996547854", "Doutorado"),
("PROF2005", "Maria Amaral", "83988568131", "Mestrado");

/* SELECT * FROM professores */

INSERT INTO prof_disciplina (disciplina, professor)
VALUES
("IAP", "PROF2003"),
("IAP", "PROF2005"),
("BD1", "PROF2001"),
("FE1", "PROF2004"),
("FE1", "PROF2002"),
("ADC", "PROF2005"),
("EDC", "PROF2004");

/* SELECT * FROM prof_disciplina */

INSERT INTO turma (cod_turma, turno, disciplina, professor)
VALUES
(2024100001, "Manhã", "IAP", "PROF2003"),
(2024100002, "Noite", "IAP", "PROF2005"),
(2024100003, "Manhã", "BD1", "PROF2001"),
(2024100004, "Manhã", "FE1", "PROF2004"),
(2024100005, "Noite", "FE1", "PROF2002"),
(2024100006, "Noite", "ADC", "PROF2005"),
(2024100007, "Manhã", "EDC", "PROF2004");

/* SELECT * FROM turma */

/* SELECIONE O NOME DE TODAS AS DISCIPLINAS OFERTADAS NA TABELA TURMA */

/* SELECIONE O NOME E A TITULAÇÃO DOS PROFESSORES QUE IRÃO MINISTRAR 
AS DISCIPLINAS OFERTADAS */

/* ADICIONE 10 ALUNOS NA TABELA ALUNOS */

/* MATRICULE OS ALUNOS EM TURMAS (CADA ALUNO DEVERÁ SER MATRICULADO EM 
PELO MENOS 3 TURMAS DIFERENTES NO MESMO TURNO) */

SELECT disciplina, disciplinas.nome, turno, professores.nome AS professor, titulacao 
FROM turma
INNER JOIN disciplinas ON disciplina = codigo_disciplina
INNER JOIN professores ON professor = matricula

INSERT INTO alunos (matricula, nome, telefone)
VALUES
("ALUNO01", "Daniel", "1111-1111"),
("ALUNO02", "Lucas", "2222-2222"),
("ALUNO03", "Michele", "3333-3333"),
("ALUNO04", "Elaine", "4444-4444"),
("ALUNO05", "Andre", "5555-5555"),
("ALUNO06", "Antony", "6666-6666"),
("ALUNO07", "Tiago", "7777-7777"),
("ALUNO08", "Gabriel", "8888-8888"),
("ALUNO09", "Matheus", "9999-9999"),
("ALUNO10", "Leandro", "0000-0000");

INSERT INTO aluno_turma (aluno, turma)
VALUES
("ALUNO01", 2024100001),
("ALUNO01", 2024100003),
("ALUNO01", 2024100004),

("ALUNO02", 2024100002),
("ALUNO02", 2024100006),
("ALUNO02", 2024100005),

("ALUNO03", 2024100001),
("ALUNO03", 2024100004),
("ALUNO03", 2024100007),

("ALUNO04", 2024100002),
("ALUNO04", 2024100005),
("ALUNO04", 2024100006),

("ALUNO05", 2024100001),
("ALUNO05", 2024100003),
("ALUNO05", 2024100007),

("ALUNO06", 2024100001),
("ALUNO06", 2024100004),
("ALUNO06", 2024100003),

("ALUNO07", 2024100001),
("ALUNO07", 2024100003),
("ALUNO07", 2024100004),

("ALUNO08", 2024100006),
("ALUNO08", 2024100002),
("ALUNO08", 2024100005),

("ALUNO09", 2024100007),
("ALUNO09", 2024100001),
("ALUNO09", 2024100003),

("ALUNO10", 2024100006),
("ALUNO10", 2024100005),
("ALUNO10", 2024100002);


SELECT matricula, alunos.nome AS Aluno, turma, turno
FROM aluno_turma
INNER JOIN alunos ON aluno = matricula
INNER JOIN turma ON turma = cod_turma

