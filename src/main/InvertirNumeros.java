package main;

import colecciones.pila.Pila;
import colecciones.pila.PilaArregloFijo;
//TODO: importar otras implementaciones de pilas para probar.

/**
* La clase {@code InvertirNumeros} implementa una aplicación simple para mostrar invertir una secuencia de números pasados como parámetro a la aplicación, utilizando el TAD {@code Pila}.
* Esta clase usa parámetros que representan los números a invertir.
* @see colecciones.pila.Pila
* @see colecciones.pila.PilaArregloFijo
* @version 1.0
*/
public class InvertirNumeros {


	/**
	* Dada una secuencia de números, se deben imprimir en orden invertido utilizando el TAD {@code Pila}.
	* Ejemplo de uso: al ejecutar <pre>java main.InvertirNumeros 1 2 3</pre>, se debe imprimir {@code 3 2 1}.
	* @param args : los números a invertir.
	*/
	public static void main(String[] args) {
		Pila<Integer> pilaEnteros = new PilaArregloFijo<>();
		for (String argumento : args) {
			try {
				Integer nro = Integer.valueOf(argumento);
				//TODO: completar
			} catch (NumberFormatException ex) {
				throw new IllegalArgumentException("Se esperaba un número entero", ex);
			}
		}
		//TODO: completar
	} 

}
