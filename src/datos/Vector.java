package datos;

import java.util.Scanner;
// import queue.UnderflowException;

public class Vector 
{
    /**
     * La clase {@code Vector} representa un vector de cualquier dimension a traves de un arreglo
     * @author Michael Brian Moreno
     * Las operaciones ofrecidas para la implementación de esta clase son:
     *  <li> suma                          : suma otro vector a este 
     *  <li> multiplicacion por un escalar : multiplica un escalar por este vector 
     *  <li> producto punto                : realiza el producto punto entre otro vector y este  
     * @version 1.0
     */

    private int dimension ; 
    private float[] vector ; 

    /**
     * Constructor de Vector 
     * @param capacidad 
     */

     public Vector (int capacidad) 
     {
        dimension = capacidad ; 
        // if (capacidad != a.length) { throw new UnderflowException("Argumentos invalidos ") ; }
        vector = new float[dimension] ;
        
        Scanner sc = new Scanner(System.in); 
        for (int i = 0 ; i < dimension ; i ++) 
        {
            System.out.println("Ingrese un numero");
            Float number = sc.nextFloat() ; 
            
            vector[i] = number ;
        }
        // vector = a ; 
     }

    /**
     * Suma otro vector a este , modificando este vector
     * @param otro
     */
    public void suma (Vector otro) 
    {
        if (dimension != otro.dimension) { throw new UnsupportedOperationException(" Los vectores deben tener la misma dimension ") ; }

        for (int i = 0 ; i < dimension ; i ++ ) 
        {
            vector[i] = vector[i] + otro.vector[i] ;
        }
    }

    /**
     * Multiplica este vector por un escalar modificando el mismo 
     * @param otro
     */
    public void escalar (int escalar) 
    {
        for (int i = 0 ; i < dimension ; i ++) 
        {
            vector[i] = vector[i] * escalar ; 
        }

    }

    /**
     * Realiza el producto punto entre otro y este vector 
     * @param otro
     */
    public void productoPunto (Vector otro)
    {
        if (dimension != otro.dimension) { throw new UnsupportedOperationException(" Los vectores deben tener la misma dimension ") ; }

        for (int i = 0 ; i < dimension ; i ++ ) 
        {
            vector[i] = vector[i] * otro.vector[i] ;
        }
    }

    @Override
    public String toString () 
    {
        String str = "(" ;
        int i = 0 ; 
        while (i < dimension) 
        {
            if ( i < dimension - 1) 
                str = str + vector[i] + "," ; 
            str = str + vector[i] ;
            i ++ ; 
        }

        str = str + ")" ; 

        return str ; 


    } 

    /**
	* Compara este elemento con otro del mismo tipo.
	* Es decir, comparar distintas implementaciones de {@code Vector} retorna {@code false}.
	*/
	@Override
	public boolean equals(Object otro)
    {
        return true ; 
    }

    /**
	* El invariante de represantacion
	* @return {@code true} sii este vector satisface su invariante de clase
	*/
    public boolean repOk()
    {
        if (dimension > 2) return true ; 
        return false ; 
    }
}