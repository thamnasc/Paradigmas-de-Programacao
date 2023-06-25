module Exercicios where
-- 1) Escreva uma função recursiva que some todos os elementos de uma lista de inteiros.
somaElem :: [Int] -> Int
somaElem [] = 0
somaElem (h:t) = h + somaElem t

-- 2) Escreva uma função recursiva que remova todos os números pares de uma lista de inteiros.
removePar :: [Int] -> [Int]
removePar [] = []
removePar (h:t)
   | mod h 2 /= 0 = h : removePar t
   | otherwise = removePar t

-- 3) Escreva uma função recursiva que inverta os elementos de uma lista de números reais
inverteElems :: [Int] -> [Int]
inverteElems [] = []
inverteElems (h:t) = inverteElems t ++ [h]

{-- Escreva uma função recursiva que receba uma lista de nomes e retorne outra lista
apenas com os nomes que começam com a letra A. Dica: utilize a função head do 
módulo Prelude para pegar a primeira letra de um nome.
--}
verificaInicial :: [Char] -> Bool
verificaInicial (h:t) = if h == 'A'
        then True
        else False
nomesComA :: [[Char]] -> [[Char]]
nomesComA [] = []
nomesComA (h:t) = if verificaInicial h
        then h : nomesComA t
        else nomesComA t
{--
1) Defina as seguintes listas por compreensão
a) [0, 3, 6, 9, 12, 15]
b) [[1], [2], [3], [4], [5]]
--}
multTres = [x | x <- [0,3..15]]
multTres2 = [x | x <- [0..15], mod x 3 == 0]

subListas = [[x] | x <- [1..5]]

{--Faça uma função que receba um inteiro e retorne uma tupla, contendo: o dobro deste
número na primeira coordenada, o triplo na segunda, o quádruplo na terceira e o
quíntuplo na quarta.--}
retornaMult :: Int -> (Int, Int, Int, Int)
retornaMult num = (num*2, num*3, num*4, num*5)

{--Faça uma função que receba um número inteiro e retorne uma tupla contendo o
resultado da divisão inteira desse número por dois e uma string indicando se o número
é par ou ímpar.--}
ehPar :: Int -> (Int, String)
ehPar num = if resto == 0
        then (resto, "par")
        else (resto, "impar")
      where 
        resto = mod num 2

{--Faça uma função recursiva que receba uma lista de números inteiros (positivos e
negativos) e retorne uma tupla contendo a soma dos números positivos e o produto
dos números negativos.--}
somaEProduto :: [Int] -> (Int, Int)
somaEProduto [] = (0,1)
somaEProduto (h:t)
      | h >= 0 = (positivos + h, negativos)
      | otherwise = (positivos, negativos * h)
      where
         (positivos, negativos) = somaEProduto t

contar :: [Int] -> (Int, Int)
contar [] = (0, 0)
contar (h:t)
 | mod h 2 == 0 = (pares + 1, impares)
 | otherwise = (pares, impares + 1)
 where
 (pares, impares) = contar t

 {-- Escreva uma função que receba uma lista dos pontos turísticos de Curitiba e uma
avaliação qualquer fornecida no intervalo de 0 a 10. Cada ponto turístico é formado por
um nome, uma nota de avaliação e um tipo (ex.: Barigui, 10, parque). A função deve
retornar uma lista com os nomes e avaliação dos pontos turísticos de Curitiba que
possuem nota acima de um valor de referência fornecido e que sejam parques ou
museus.
a. Implemente uma solução usando lista por compreensão e utilize type para criar
apelidos para os tipos--}

type Nome = String
type Nota = Int
type Tipo = String
type PontoT = (Nome, Nota, Tipo)
type Curitiba = [PontoT]
pontosTuristicos :: Nota -> Curitiba -> [(Nome, Nota)]
pontosTuristicos ref pt = [(nome, nota) | (nome, nota, tipo) <- pt, nota > ref && (tipo == "parque" || tipo == "museu")]