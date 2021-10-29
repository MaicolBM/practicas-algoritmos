package datos ;

/**
 * La interface {@code Boolean} representa los Booleanos a traves de enteros
 * Las operaciones ofrecida para la implementacion de esta interface son :
 * <li> verdadero : retorna un Entero que representara el valor true de boolean
 * <li> falso : retorna un Entero que representara el valor false de boolean
 * <li> negacion : niega el entero 
 * <li> conjuncion : realiza la conjuncion logica entre un entero y este 
 * <li> disyuncion : realiza la disyuncion logica entre un entero y este
 * <li> implicacion : realiza la implicacion logica entre un entero y este
 * @author Michael Brian Moreno 
 * @param Int 
 * @version 1.0 
 */
public class Boolean 
{

    private int valor ; 

    /**
     * Constructor de Boolean
     * Por defecto es False 
     */

    public Boolean () 
    {
        valor = 0 ; 
    }

    /**
     * Devuelve el entero que representa True 
     */
    public void verdadero () 
    {
       valor = 1 ;
        
    }   

    /**
     * Devuelve el entero que representa False 
     */

    public void falso () 
    {
        valor = 2 ;

    }

    /**
      * Niega el entero 
      */
      
    public void negacion () 
    {
        valor = (valor + 1) ;  
    }

      /**
       * Realiza la conjuncion logica entre un entero y este 
       * @param otro
       */
      
    public int conjuncion (int otro) 
    {
        valor = valor * otro ; 
        return valor ; 
    }

      /**
       * Realiza la disyuncion logica entre un entero y este 
       * @param otro
       */
    public int disyuncion (int otro) 
    {
        negacion();
        conjuncion(1+otro) ; 
        negacion(); 
        return valor ; 
    }

    /**
     * Realiza la implicacion logica entre un entero y este 
     * @param otro
     */

     public int implicacion (int otro) 
     {
         negacion();
         disyuncion(otro) ; 

         return valor ;
     }

     @Override
     public String toString () 
     {
        if ((valor % 2) == 0) { return "Falso" ; }
        else { return "Verdadero" ; } 
     } 

     @Override
     public boolean equals (Object otro) 
     {
         return false ; 
     }

}