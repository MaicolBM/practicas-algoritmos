module Tuplas where
import TADPair

instance Pair () where

    first (a,b) = a
    second (a,b) = b
    suma (x,y) (a,b) = (x + a , y+ b) 
    product a (x,y) = (a*x, a*y)

