module Main where
import Treino

main :: IO ()
main = do
  putStrLn "Hello, World!"
  let l = [1,-2,0]
  let x = filtraNum ehPos l
  print (x)
