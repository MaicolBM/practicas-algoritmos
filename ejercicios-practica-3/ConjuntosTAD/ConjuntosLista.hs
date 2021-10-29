module ConjuntosLista where
import ConjuntosTAD

instance Conjuntos [] where
    vacio = []
    pertenece x [] = False
    pertenece x xs = x `elem` xs
    union [] [] = []
    union [] xs = xs
    union ys [] = ys
    union (x:xs) (y:ys) |  x == y = x : union xs ys
                        | x < y  = x : union xs (y:ys)
                        | x > y  = y : union (x:xs) ys
    ins  a [] = [a]
    ins  a (x:xs) | a <= x = a : (x:xs)
                  | a > x  = x : ins a xs
                