module Exercicios where

{--1) Dada uma tupla do tipo (String, String, Char), escreva três funções diferentes para
retornar cada elemento da tupla.--}
retornaSt :: (String, String, Char) -> String
retornaSt (frase,_,_) = frase
retornaNd (_,frase,_) = frase
retornaRd (_,_,letra) = letra

