CREATE DATABASE Livraria;

CREATE TABLE Editora (
	id INT PRIMARY KEY AUTO_INCREMENT, /*Auto_Increment: Add +1 a cada atualização*/
	nome VARCHAR(100) NOT NULL, /*Not Nyll: Faz com que a variavel obrigatoriamente possua um valor*/
	email VARCHAR(100) NOT NULL
); 