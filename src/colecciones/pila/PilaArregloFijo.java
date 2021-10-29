package colecciones.pila;

import java.util.Collection;
// import java.util.Arrays;

/**
* La clase {@code PilaArregloFijo} implementa la interface {@code Pila} mediante arreglos de tamaño fijo.
* @see colecciones.pila.Pila
* @param T : el tipo de los elementos a almacenar en la Pila.
* @version 1.1
*/
public class PilaArregloFijo<T> implements Pila<T> {

	/**
	* Capacidad máxima por defecto ({@value #CAPACIDAD_POR_DEFECTO})
	*/
	public static final int CAPACIDAD_POR_DEFECTO = 30;
	private Object[] arreglo;
	private int elementos ;

	/**
	* Construye una nueva pila vacía con una capacidad máxima de {@value #CAPACIDAD_POR_DEFECTO}.
	*/
	public PilaArregloFijo() {

		// this (CAPACIDAD_POR_DEFECTO) ;
		elementos = 0 ; 
		arreglo = new Object[CAPACIDAD_POR_DEFECTO] ; 

	}

	/**
	* Construye una nueva pila vacía con una capacidad determinada mayor a 0.
	* @param capacidad la capacidad de la pila
	* @throws IllegalArgumentException si {@code capacidad} es menor o igual a 0 
	*/
	public PilaArregloFijo(int capacidad) {
		if (capacidad <= 0)
			throw new IllegalArgumentException("capacidad debe ser mayor a cero (" + capacidad + ")");
		arreglo = new Object[capacidad];
	}

	/**
	* Construye una pila a partir de elementos en una colección.
	* Los elementos en la colección se apilan de izquierda a derecha.
	* La capacidad de la pila va a ser suficiente para al menos contener todos los elementos de la colección.
	* @param elems los elementos a agregar a la pila
	*/
	public PilaArregloFijo(Collection<T> elems) {


		// TODO: el arreglo debe ser capaz de almacenar al menos todos los elementos de la colección	
	}

	@Override
	public  boolean apilar(T e) {
		// 
		if (elementos == CAPACIDAD_POR_DEFECTO) 
		{
			throw new UnsupportedOperationException("PILA LLENA");
		}

		arreglo[elementos] = e ;
		elementos ++ ; 
		return true ;

	}


	@Override
	public void vaciar() {
		// 
		if (elementos == 0) 
		{
			throw new UnsupportedOperationException("La Pila ya esta vacia ! ");
		}

		elementos = 0 ; 
	}

	@Override
	public boolean esVacia() {
		// throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");
		return (elementos == 0) ;
	}

	@Override
	public T tope() {
		// 
		if (!esVacia()) 
		{
			T elem = elemento(elementos) ;
			return elem ;
		}
		
		throw new UnsupportedOperationException("La Pila esta vacia !! ");
	}

	@Override
	public T desapilar() {
		// throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");
		if (!esVacia())
		{
			T elem = elemento(elementos -1);
			elementos --;
			return elem; 
		}
		throw new IllegalStateException("La Pila esta vacia !! "); 
	}
	
	@Override
	public int elementos() {
		if (elementos < 0 ) 
		{ 
			throw new UnsupportedOperationException("INDICE INVALIDO ");
		} 
		return elementos ;
	}	

	@Override
	public boolean repOK() {
		throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");
		//TODO: completar
		//no debe haber ciclos
		//la cantidad de nodos accesibles desde tope debe ser igual a el valor del atributo elementos	
	}

	@Override
	public String toString() {
		// throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");
		String str ;
		str = "[" ;

		for (int i = 0 ; i < elementos ; i ++)
		{
			T elem = elemento(i) ; 
			str += String.valueOf(elem) ; 
			if(i < elementos - 1)
				str += ", " ;
		}
		str += "]" ; 
		return str ; 
		
			
	}
		 

	@Override
	public boolean equals(Object other) {
		// throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");
		if (other == null)
			return false ;
		if (!(other instanceof PilaArregloFijo)) 
			return false ;
		PilaArregloFijo<?> otraPila = (PilaArregloFijo<?>) other ; 
		if (elementos != otraPila.elementos)
			return false ;
		
		for (int i = 0 ; i < elementos ; i ++) 
		{
			T elem = elemento(i) ; 
			Object elemOtro = otraPila.arreglo[i] ; 
			if (elem == null && elemOtro != null)
				return false; 
			if (!elem.equals(elemOtro))
				return false ;
		}
		return true ;
	}
	

	/**
	* Permite obtener un elemento del arreglo en un indice determinado realizando el casteo necesario.
	* @param index el indice del elemento a obtener
	*/
	@SuppressWarnings("unchecked")
   	private T elemento(int index) {
        	return (T) arreglo[index];
    	}

}
