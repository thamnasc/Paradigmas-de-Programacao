module Condicionais where

maior :: Int -> Int -> Int -- assinatura do tipo
maior a b =
  if a >= b
    then a
    else b -- não é opcional, tem que ter
    -- colocar parênteses é opcional

-- guardas parece com o switch
-- cases -> cada uma das circunstâncias
-- pode ou não ter otherwise
-- executa só a primeira condição verdadeira
maiorG :: Int -> Int -> Int
maiorG a b -- não coloca igual aqui
      | a >= b = a
      | b > a = b -- mesma identação pertence ao mesmo bloco


      