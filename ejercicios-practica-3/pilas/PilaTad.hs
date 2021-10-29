module PilaTAD where
-- | Una clase para Pilas:
-- s es un tipo como toma como parametro otro tipo, por ejemplo [] .
class Pila s where
 -- | pila vacia
 vacia :: s a
 -- | desapila un elemento de la pila
 desapilar :: s a -> s a
 -- | apila un elemento en la pila
 apilar :: s a -> a -> s a
 -- | dice si una pila es vacia o no
 esVacia :: s a -> Bool
 -- | retorna el tope de la pila
 tope :: s a -> a

 