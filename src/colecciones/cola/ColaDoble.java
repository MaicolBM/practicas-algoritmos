package colecciones.cola;

public interface ColaDoble <T> {
    /**
     * encolarInit : Inserta un elemento al comienzo de la lista 
     * @param elem
     */
    public void encolarInit ( T elem ) ; 
    /**
     * encolarFin : inserta un elemento al final de  la lista 
     * @param elem
     */
    public void encolarFin ( T elem ) ;
    /**
     * desencolarInit : desencola el ultimo elemento de la cola y devuelve el elemento desencolado
     * @return T 
     */
    public void desencolarInit () ; 
    /**
     * desencolarFin : desencola el primer elemento de la cola y lo devuelve 
     * @return T 
     */
    public void desencolarFin () ; 
    /**
     * esVacia : retoran True si la cola esta vacia 
     * @return bool 
     */
    public Boolean esVacia () ; 

    @Override
    public String toString () ; 

}
