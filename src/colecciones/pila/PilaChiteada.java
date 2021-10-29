package colecciones.pila;

import java.util.Stack;

public class PilaChiteada<T> implements Pila<T> {

	private Stack<T> pilaInterna;
	
	
	public PilaChiteada() {
		pilaInterna = new Stack<>();
	}


	public T tope() {
		return pilaInterna.peek();
	}
	
	
	public boolean esVacia() {
		return pilaInterna.isEmpty();
	}
	
	public boolean apilar(T elem) {
		pilaInterna.push(elem);
		return true;
	}
	
	public T desapilar() {
		if (esVacia())
			throw new IllegalStateException("la pila está vacía");
		return pilaInterna.pop();
	}
	
	public int elementos() {
		return pilaInterna.size();
	}
	
	public void vaciar() {
		pilaInterna.clear();
	}
	
	public boolean repOK() {
		return true;
	}
	
	
	public String toString() {
		return pilaInterna.toString();
	}
	
	public boolean equals(Object other) {
		if (other == null)
			return false;
		if (!(other instanceof Pila))
			return false;
		return toString().equals(((Pila<?>) other).toString());
	}


}
