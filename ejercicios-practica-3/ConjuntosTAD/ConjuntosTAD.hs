module ConjuntosTAD where
    -- | Una clase para Conjuntos 
    -- | s es un tipo que toma otro parametro como tipo , por ej : []
class Conjuntos s where
-- |   Vacio  
    vacio :: s a
-- | Pertenece : dado un elemento y una lista me dice si este pertenece a la misma 
    pertenece ::  (Eq a) => a -> s a -> Bool
-- | Union : Realiza la union entre conjuntos 
    union :: (Ord a) => s a ->  s a -> s a
-- | Insercion : Inserta un elemento al conjunto 
    ins ::  (Ord a) => a -> s a -> s a
