module Calculadora where
import Operacoes
opSoma x y = soma x y -- cria outra funcao, associa outra funcao a ela, calcula o resultado de soma e depois associa
opMult x y = multiplica x y

-- soma, quadrado', maiorQue, calcula_Area (convenção de nomes, tem que começar com minusc.)
-- param -> sempre minuscula
-- tipo em Haskell tem letra maiuscula, ex: Bool
-- && || not 
-- lista -> todos os elementos tem o mesmo tipo
-- string -> coloca os caracteres dentro de uma lista
-- tupla -> ex: nome e isReadableHandleType


-- assinatura de tipo exp :: t (exp é do tipo t)
-- :type 'A'

-- x = 3 É UMA DEFINIÇÃO! uma função que não recebe um parâmetro e retorna um inteiro

-- x :: Int -> Float -> Bool -> Int
-- o ultimo é o retorno e os tres primeiros são os parametros



-- :l Calculadora.hs