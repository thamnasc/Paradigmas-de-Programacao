module FuncoesDecisao where

ehPar :: Int -> Bool
ehPar x = if mod x 2 == 0 -- if x `mod`2 == 0
  then True
  else False

ehParG :: Int -> Bool
ehParG x
   | (mod x 2 == 0) = True
   | otherwise = False

ehTriangulo :: Int -> Int -> Int -> Bool
ehTriangulo a b c = if a + b > c && a + c > b && c + b > a 
  then True
  else False

ehTrianguloG :: Int -> Int -> Int -> Bool
ehTrianguloG a b c 
  | (a + b > c && a + c > b && c + b > a) = True
  | otherwise = False

formarTriangulo a b c =
   if somaAB > c && somaAC > b && somaBC > a
    then True
    else False
   where
    somaAB = a + b
    somaAC = a + c
    somaBC = b + c

{--
FormarTri a b c = condicao
   where 
    somaAB = a + b
    somaAC = a + c
    somaBC = b + c

    condicao = if somaAB > c && somaAC > b && somaBC > a
      then True
      else False
--}
mediaArit :: Float -> Float -> Float -> String
mediaArit n1 n2 n3
   | media >= 7 = "Aprovado"
   | otherwise = "Reprovado"
  where     
    media = (n1+n2+n3)/3


-----recursão-----
fatorialG :: Int -> Int
fatorialG n 
   | n == 0 = 1
   | n > 0 = n * fatorialG (n-1)

fatorial :: Int -> Int
fatorial 0 = 1
fatorial n = n * fatorial (n-1)

potencia :: Int -> Int -> Int
potencia x 0 = 1 -- n^0 = 1
potencia x n = x * potencia x (n-1)

potenciaG :: Int -> Int -> Int
potenciaG x n
  | n == 0 = 1
  | n > 0 = x * potenciaG x (n-1)

somatorio :: Int -> Int
somatorio 0 = 0
somatorio y = y + somatorio (y-1)

somaG :: Int -> Int
somaG
  | n == 0 = 0
  | otherwise = n + somaG (n-1)