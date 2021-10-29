module ColaPrioridad where 
	-- | TAD Cola de Prioridad 
class ColaP s where 
	-- | ins  / Inserta un elemento a la cola 
	ins ::(Ord a) => a -> s a -> s a 
	-- | remove  / remueve un elemento de la cola 
	rm :: s a -> s a
	-- | empty : Devuelve True si la cola esta vacia , False en caso contrario 
	empty :: s a -> Bool 

instance ColaP [] where 
	ins x [] = [x] 
	ins y (x:xs) |  y <= x = x : ins y xs 
				 |  y > x = y : (x:xs) 
	
	rm [] = error "rm [] : Invalid Operation" 
	rm (x:xs) = xs 

	empty [] = True 
	empty (x:xs) = False 
