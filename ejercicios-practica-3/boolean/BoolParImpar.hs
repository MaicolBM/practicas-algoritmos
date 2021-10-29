module BoolParImpar where 

import TADBooleano


instance Booleano Integer where 
    verdadero = 1 
    falso = 2
    negacion p = mod (p+1) 2 
    conjuncion n m = n * m 
    disyuncion n m = negacion ( conjuncion (negacion n) (negacion m))
    implicacion n m = disyuncion (negacion n) m 
    toString n 
            | mod n 2 == 0 = "Falso"
            | mod n 2 /= 0 = "Verdadero"