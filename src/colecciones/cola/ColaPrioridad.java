package colecciones.cola;



public interface ColaPrioridad <T>  {
    /**
     * Interface que define colas de Prioridad . 
     * Operaciones : 
     *  <li> insertar : Inserta un elemento a la cola 
     *  <li> rm : Remueve un elemento de la cola 
     *  <li> empty : Devuelve True si la cola esta vacia 
     */

     /**
      * insertar : Inserta un elemento a la cola  
      * @param elem 
      */

      public boolean insertar (T elem) ; 

    /**
       * rm : Remueve un elemento de la cola
       */

       public boolean rm () ; 

    /**
     * empty : Devuelve True si la cola esta vacia
     * @return Boolean 
     */
     
     public boolean empty () ; 



}
      
