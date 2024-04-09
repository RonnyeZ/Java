INSERT INTO carrinho (cod_carrinho, cliente, produto, quantidade)
VALUES 
(1, "12345678900", 240001, 2), 
(1, "12345678900", 240004, 1);

SELECT nome, descricao, carrinho.quantidade, valor,
(valor * carrinho.quantidade) AS subtotal
FROM carrinho 
INNER JOIN cliente ON cliente = cpf
INNER JOIN produto ON produto = codigo_produto
WHERE cpf = "12345654445"


DELETE FROM carrinho


INSERT INTO carrinho (cod_carrinho, cliente, produto, quantidade)
VALUES
(2, "12345654445", 240002, 2),
(2, "12345654445", 240006, 1),
(2, "12345654445", 240003, 3),
(2, "12345654445", 240007, 1),
(3, "54122654445", 240002, 1),
(3, "54122654445", 240005, 2),
(3, "54122654445", 240006, 2),
(4, "98765432100", 240001, 3),
(4, "98765432100", 240002, 2),
(4, "98765432100", 240003, 2),
(4, "98765432100", 240007, 1),
(4, "98765432100", 240006, 1),
(5, "12345678900", 240001, 1);

SELECT descricao, COUNT(carrinho.quantidade) AS vendidos, 
valor, (valor * COUNT(carrinho.quantidade)) AS subtotal FROM carrinho
INNER JOIN produto ON produto = codigo_produto
GROUP BY descricao, valor

SELECT SUM(valor) AS Total FROM carrinho
INNER JOIN produto ON produto = codigo_produto

INSERT INTO produto (codigo_produto, descricao, quantidade, valor)
VALUES
(240008, "Pulseira", 10, 25.00),
(240009, "Colar", 15, 175.00);

SELECT descricao FROM produto
WHERE codigo_produto IN (SELECT produto FROM carrinho)

SELECT descricao FROM produto
WHERE codigo_produto NOT IN (SELECT produto FROM carrinho)