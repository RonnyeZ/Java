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


/*SELECT DISTINCT(nome) FROM disciplinas
INNER JOIN turma ON turma.disciplina = codigo_disciplina*/

/*SELECT DISTINCT(nome), titulacao FROM professores
INNER JOIN turma ON turma.professor = matricula*/


SELECT disciplina, disciplinas.nome, turno, professores.nome AS professor, titulacao 
FROM turma
INNER JOIN disciplinas ON disciplina = codigo_disciplina
INNER JOIN professores ON professor = matricula

INSERT INTO alunos (matricula, nome, telefone)
VALUES
("AL202400001", "Daniel", "1111-1111"),
("AL202400002", "Lucas", "2222-2222"),
("AL202400003", "Michele", "3333-3333"),
("AL202400004", "Elaine", "4444-4444"),
("AL202400005", "Andre", "5555-5555"),
("AL202400006", "Antony", "6666-6666"),
("AL202400007", "Thiago", "7777-7777"),
("AL202400008", "Gabriel", "8888-8888"),
("AL202400009", "Matheus", "9999-9999"),
("AL202400010", "Leandro", "0000-0000");

INSERT INTO aluno_turma (aluno, turma)
VALUES
("AL202400001", 2024100001),
("AL202400001", 2024100003),
("AL202400001", 2024100004),

("AL202400002", 2024100002),
("AL202400002", 2024100006),
("AL202400002", 2024100005),

("AL202400003", 2024100001),
("AL202400003", 2024100004),
("AL202400003", 2024100007),

("AL202400004", 2024100002),
("AL202400004", 2024100005),
("AL202400004", 2024100006),

("AL202400005", 2024100001),
("AL202400005", 2024100003),
("AL202400005", 2024100007),

("AL202400006", 2024100001),
("AL202400006", 2024100004),
("AL202400006", 2024100003),

("AL202400007", 2024100001),
("AL202400007", 2024100003),
("AL202400007", 2024100004),

("AL202400008", 2024100006),
("AL202400008", 2024100002),
("AL202400008", 2024100005),

("AL202400009", 2024100007),
("AL202400009", 2024100001),
("AL202400009", 2024100003),

("AL202400010", 2024100006),
("AL202400010", 2024100005),
("AL202400010", 2024100002);



SELECT matricula, alunos.nome AS Aluno, turma, turno
FROM aluno_turma
INNER JOIN alunos ON aluno = matricula
INNER JOIN turma ON turma = cod_turma

/* INSIRA 3 NOTAS PARA CADA ALUNO */
/* FAÇA UM SLECT QUE TRAGA A MÉDIA DE CADA UM DOS ALUNOS */

/* EXTRA */
/* FAÇA UM SLECT QUE DIGA SE O ALUNO ESTA APROVADO OU REPROVADO */

