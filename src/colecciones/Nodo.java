package colecciones;

public class Nodo<T> {

	private T dato;
	private Nodo<T> siguiente;

	public Nodo() 
	{
		dato = null ;
		siguiente = null ;

	}
	
	public Nodo(T dato) {
		this.dato = dato;
		this.siguiente = null ; 
	}	
	
	
	public T dato() {
		return dato;
	}
	
	public void dato(T nuevoDato) {
		dato = nuevoDato;
	}
	
	
	public Nodo<T> siguiente() {
		return siguiente;
	}
	
	public void siguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;	
	}
	
}
