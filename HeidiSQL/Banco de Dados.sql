CREATE DATABASE venda;

CREATE TABLE produto (
    codigo_produto INTEGER PRIMARY KEY,
    descricao VARCHAR(100),
    quantidade INTEGER,
    valor DOUBLE
);

CREATE TABLE cliente (
    cpf VARCHAR(11) PRIMARY KEY,
    cep VARCHAR(8),
    numero_casa INTEGER,
    complemento VARCHAR(20),
    telefone VARCHAR(13),
    nome VARCHAR(200),
    data_nascimento DATE
);

CREATE TABLE carrinho (
    cod_carrinho INTEGER,
    cliente VARCHAR(11),
    produto INTEGER,
    quantidade INTEGER,
    CONSTRAINT fk_cliente FOREIGN KEY (cliente) REFERENCES cliente (cpf),
    CONSTRAINT fk_produto FOREIGN KEY (produto) REFERENCES produto (codigo_produto)
);

INSERT INTO cliente (cpf, cep, numero_casa, complemento, telefone, nome, data_nascimento)
VALUES
("12345678900", "58000123", 123, '', "83988888654", "Chuck Noris", "1950-01-01"),
("98765432100", "58000125", 987, '', "83988880124", "Silverste Stalone", "1957-02-01"),
("12345654445", "58004587", 483, '', "83988785211", "Arnold Schwarzenegger", "1955-05-03"),
("54122654445", "58001287", 921, '', "83988597511", "Jean-Claude Van Damme", "1953-08-07");

INSERT INTO produto (codigo_produto, descricao, quantidade, valor)
VALUES
(240001, "Camiseta", 10, 60.00),
(240002, "Calça", 10, 95.00),
(240003, "Bermuda", 8, 75.00),
(240004, "Tênis", 15, 123.00),
(240005, "Meias", 10, 17.00),
(240006, "Boné", 5, 34.90),
(240007, "Relógio", 10, 250.00);