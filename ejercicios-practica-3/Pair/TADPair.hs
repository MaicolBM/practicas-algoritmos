--{-# LANGUAGE FlexibleContexts #-}
--{-# LANGUAGE ConstrainedClassMethods #-}
module TADPair where 

class Pair a where 
    -- | First : Devuelve el primer elemento del par 
    first :: a e -> e 
    -- | Second: Devuelve el segundo elemento del par 
    second :: a e -> e
    -- | Sum : Suma dos pares 
    suma :: (Num n) => a n -> a n -> a n
    -- | Product : Dado un Num realiza la multiplicacion del mismo con el par 
    product :: (Num n) => a n -> n -> a n 

data MiPar a = a :/: a 

instance Pair MiPar where 
    
    first x :/: y = x 
    second x :/: y = y 
    suma (a :/: b) (c :/: d) = (a + c) :/: (b + d) 
    product (a :/: b) n = ( a * n) :/: (b * n) 
