module Treino where
fat :: Int -> Int
fat 0 = 1
fat n = n * fat (n - 1)

pot :: Int -> Int -> Int
pot x 0 = 1
pot x n = x * pot x (n - 1)

potG :: Int -> Int -> Int
potG x n
  | n == 0 = 1
  | n > 0 = x * potG x (n - 1)

som :: Int -> Int
som 0 = 0
som n = n + som (n - 1)

somG :: Int -> Int
somG n
   | n == 0 = 0
   | n > 0 = n + somG (n - 1)

somABG :: Int -> Int -> Int
somABG a b
   | a == b = b
   | otherwise = a + somABG (a + 1) b

func :: (Int, (Int,Int)) -> Int
func z = if fst z == 1
 then fst (snd z) + snd (snd z)
 else if fst z == 2
 then fst (snd z) - snd (snd z)
 else 0

funcT :: (Int, (Int, Int)) -> Int
funcT (x,y) | x == 1 = fst y + snd y
 | x == 2 = fst y - snd y
 | otherwise = 0

--funcc :: (Int, (Int, Int)) -> Int
--funcc (1,_) =  

f1 :: Int -> Int -> Int -> Int
f1 x y z | x == 1 = 10
 | y == 2 = 20
 | z == 3 = 30
 | otherwise = 0


tam :: [Int] -> Int
tam [] = 0
tam (_:t) = 1 + tam t 

divs :: Int -> [Int]
divs n = [x | x <- [2..n], mod n x == 0]
ehPrimo :: Int -> Bool
ehPrimo n
    | tam (divs n) == 0 = True
    | otherwise = False

ehPos :: Int -> Bool
ehPos n = if n > 0 
 then True
 else False

ehNeg :: Int -> Bool
ehNeg n = if n < 0 
then True
else False

ehZero :: Int -> Bool
ehZero n = if n == 0
 then True
 else False
{-
filtraNum :: (Int -> Bool) -> [Int] -> [Int]
filtraNum _ [] = []
filtraNum f (h:t) = 
 | f h == True = h : (filtraNum f t)
 | otherwise = filtro f t
-}
retornaStr :: Char -> [Char]
retornaStr ch = [ch]

retornaContrario :: Int -> [Char] -> [Char]
retornaContrario 0 _ = []
retornaContrario n (h:t) = retornaContrario (n - 1) t ++ retornaStr h
