module Main where

import CasamentoDePadroes

multiplica x y = x * y

main :: IO ()
main = do
  let z = multiplica 2 3
  print (z)
  -- nome <- getLine
  -- numero <- readLn :: IO Int 