INSERT INTO carrinho (cod_carrinho, cliente, produto, quantidade)
VALUES 
(1, "12345678900", 240001, 2), 
(1, "12345678900", 240004, 1);

SELECT nome, descricao, carrinho.quantidade, valor,
(valor * carrinho.quantidade) AS subtotal
FROM carrinho 
INNER JOIN cliente ON cliente = cpf /*Faz a conexão da tabela Carrinho com tabela Cliente*/
INNER JOIN produto ON produto = codigo_produto /*Faz a conexão com a tabela Produto*/
WHERE cpf = "12345654445"


DELETE FROM carrinho /*delete do carrinho*/


INSERT INTO carrinho (cod_carrinho, cliente, produto, quantidade) /*Adiciona itens no carrinho*/
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

SELECT descricao, COUNT(carrinho.quantidade) AS vendidos, /*Mostra Descricao, quantidades, valor e valor total dos itens do carrinho*/ 
valor, (valor * COUNT(carrinho.quantidade)) AS subtotal FROM carrinho
INNER JOIN produto ON produto = codigo_produto
GROUP BY descricao, valor

  /* Aula 09/04 */
SELECT SUM(valor) AS Total FROM carrinho /*Faz a soma dos valores dos produtos no carrinho*/
INNER JOIN produto ON produto = codigo_produto

INSERT INTO produto (codigo_produto, descricao, quantidade, valor) /*Adiciona novos itens a tabela produto*/
VALUES
(240008, "Pulseira", 10, 25.00),
(240009, "Colar", 15, 175.00);

SELECT descricao FROM produto /*Mostrar todos os itens no carrinho*/
WHERE codigo_produto IN (SELECT produto FROM carrinho)

SELECT descricao, valor FROM produto /*Mostrar todos os itens que não estão no carrinho*/
WHERE codigo_produto NOT IN (SELECT produto FROM carrinho)

  /*Escreva uma query que reduza em 15% o valor dos produtos não vendidos*/
UPDATE produto /*Produtos que não estejam no carrinho reduzem 15% do valor*/
SET valor = valor - (valor * 0.15)
WHERE codigo_produto NOT IN (SELECT produto FROM carrinho)

UPDATE produto /*Voltar ao valor inicial*/
SET valor = valor + (valor * 0.1764705882352941176470588235294)
WHERE codigo_produto NOT IN (SELECT produto FROM carrinho)

/*Escreva uma query que aumente o valor em 10% dos produtos que o estoque seja menor que 10*/
UPDATE produto /*Aumenta o valor em 10% dos produtos que possuirem a quantidade menor que 10*/
SET valor = valor + (valor * 0.10)
WHERE quantidade < 10

UPDATE produto /*Volta ao valor inicial*/
SET valor = valor - (valor * 0.090909090909090909090909090909091)
WHERE quantidade < 10

SELECT descricao, quantidade, valor FROM produto
