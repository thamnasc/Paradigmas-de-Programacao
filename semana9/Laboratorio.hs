module Laboratorio where
calculaReajuste :: Float -> Float
calculaReajuste sal = 1.25 * sal

mediaPonderada :: Float -> Float -> Float -> Float -> Float -> Float -> Float
mediaPonderada n1 n2 n3 p1 p2 p3 = (n1*p1+n2*p2+n3*p3)/(p1+p2+p3)

converteCparaF :: Float -> Float
converteCparaF c = c * 9/5 + 32

calculaIdade2032 :: Int -> Int
calculaIdade2032 anoNasc = 2032 - anoNasc

horaEmMin :: Int -> Int -> Int
horaEmMin h m = h * 60 + m

calculaSomaQuadrados :: Float -> Float -> Float -> Float
calculaSomaQuadrados a b c = a*a + b*b + c*c

calculaSalario :: Float -> Float
calculaSalario sal = 1.05 * sal - 0.07 * sal
--calculaSalario sal = 0.98 * sal


