module CasamentoDePadroes where

{-- parecido com switch case, se encontrou padrao que casa, para de verificar
padrao :: Int -> String
padrao 1 = "um"
padrao 2 = "dois"
padrao 3 = "tres"
padrao _ = "nao esta entre 1 e 3" -- como se fosse o default, sempre tem que ficar por último
--}
-- _ indica que a variavel nao está sendo usada para nada (curinga)

padrao1 :: [Int] -> Int
padrao1 [] = 0
padrao1 (_:t) = 1 + padrao1 t --pode ignorar a cabeça, não está usando em nada

--gerador de lista:
--padrao1 [x | x <- [1..100], mod x 2 == 0] --devolve quantos pares tem de um a 100 (50) 

--Funções de Alta Ordem
{--
pode receber uma função como argumento  (vamos ver apenas esta parte)
pode retornar uma função como resultado

mapeamento:
aplica operação sobre todos os elementos da lista

função de alta ordem: devolve lista de inteiros mapeada

mapLista:: (Int -> Int) -> [Int] -> [Int] -- pode ser qualquer função que se encaixe
mapLista _ [] = [] -- pode colocar _ ou outra letra
mapLista f (h:t) = (f h) : (mapLista f t) -- : cria uma lista nova que vai ser inserido no início da outra lista

--mapLista cubo [1,2,3,4] ou mapList quadrado [1,2,3,4]

função de alta ordem Filtro: recebe uma função,
mas seleciona os elementos que satisfazem uma condição desejada

par :: Int -> Bool
par x = (mod x 2 == 0)

filtro :: (Int -> Bool) -> [Int] -> [Int]
filtro _ [] = []
filtro f (h:t) = 
      | (f h) == True = h : (filtro f t)
      | otherwise = filtro f t
      
--}
