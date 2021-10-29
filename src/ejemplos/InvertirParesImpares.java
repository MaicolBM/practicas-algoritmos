package ejemplos;

import colecciones.pila.Pila;
import colecciones.pila.PilaArregloFijo;

public class InvertirParesImpares {


	public static void main(String[] args) {
		Pila<Integer> pilaPares = new PilaArregloFijo<>(args.length); //al menos tengo args.length pares
		Pila<Integer> pilaImpares = new PilaArregloFijo<>(args.length); //al menos tengo args.length impares
		for (String arg : args) {
			try {
				int argumentoComoNumero = Integer.valueOf(arg);
				if (argumentoComoNumero % 2 == 0) //el resto de dividir argumentoComoNumero por 2 es cero
					pilaPares.apilar(argumentoComoNumero);
				else
					pilaImpares.apilar(argumentoComoNumero);
			} catch (NumberFormatException nfe) {
				System.err.println("El argumento " + arg + " no representa un entero válido");
				System.exit(1); //Termina el programa con un código de salida que denota un error
			}
		}
		System.out.println("Números pares invertidos:");
		imprimir(pilaPares);
		System.out.println("Números impares invertidos:");
		imprimir(pilaImpares);
	}
	
	
	private static void imprimir(Pila<Integer> pila) {
		String aImprimir = "";
		while (!pila.esVacia()) {
			Integer valor = pila.desapilar();
			if (aImprimir.isEmpty()) //si aImprimir es vacío (la cadena vacía)
				aImprimir = valor.toString();
			else
				aImprimir = aImprimir + valor; //equivalente a aImprimir += valor;
			if (!pila.esVacia()) //no es el último elemento de la pila
				aImprimir += ", ";
		}
		System.out.println(aImprimir);
	}
	

}
