module PilaLista where
import PilaTAD



instance Pila [] where
    vacia = []
    desapilar [] = error "pop: empty stack"
    desapilar (x:xs) = xs
    apilar xs x = (x:xs)
    esVacia xs = (length xs == 0)
    tope [] = error "top: empty stack"
    tope (x:xs) = x