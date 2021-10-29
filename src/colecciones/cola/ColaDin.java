package colecciones.cola;
// import queue.UnderflowException; 

/**
* La clase {@code PilaArregloFijo} implementa la interface {@code Pila} mediante arreglos de tamaño fijo.
* @see colecciones.pila.Pila
* @param T : el tipo de los elementos a almacenar en la Pila.
* @version 1.1
*/

public class ColaDin <T> implements Cola<T> {
    
    private Node<T> first ;
    private Node<T> end ;
    private int size ; 

    /**
     * Constructor de Cola 
     * @return void
     */
    public ColaDin() 
    {
        end = null ;
        first = null ; 
        size = 0 ; 
    }

    @Override
    public boolean esVacia() {
        if (size == 0)
            return true;
        return false ;
    }

    @Override
    public boolean encolar(T elem) {
        Node<T> nuevo  = new Node <T>() ; 
        nuevo.info = elem ; 
        nuevo.next = null ;
        if (esVacia()) 
        {
            first = nuevo ; 
            end = nuevo ;
        }
        else {
            end.next = nuevo ; 
            end = nuevo ; 
        }    
        return true;
    }
    @Override
    public T desencolar() {
        if( esVacia( ) )
            throw new UnsupportedOperationException("La Cola esta vacia ! ");
    
        T data =  first.info ;
        first = first.next ; 

        if (first == null )
            end = null ;
        return data;
    }
    @Override
    public T primero() {
    
        return first.info ;
    
    }
    @Override
    public void vaciar() {    
        size = 0 ; 
    }
    @Override
    public int elementos() {
        return size;
    }
    @Override
    public boolean repOK() {
        throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");
    }
    @Override
	public String toString(){
        throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");
    }

	@Override
	public boolean equals(Object other){
        throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");
    }  
    
}
