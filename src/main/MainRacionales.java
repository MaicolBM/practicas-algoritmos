package main;

import datos.Racional;
//TODO: importar implementaciones de Racionales

/**
* La clase {@code MainRacionales} implementa una aplicación simple para mostrar el uso de {@code Racional} y sus implementaciones.
* Esta clase no usa parámetros, el comportamiento está completamente "hardcodeado" requiriendo modificiar y recompilar para hacer pruebas.
* @see datos.Racional
* @version 1.0
*/
public class MainRacionales {

	/**
	* Experimenta con racionales y sus operaciones.
	* @param args argumentos para la aplicación, no se utilizan en esta implementación.
	*/
	public static void main(String[] args) {
		Racional dosTercios = crearRacional(2, 3);
		Racional menosDosTercios = crearRacional(2, 3);
		menosDosTercios.negar();
		Racional unCuarto = crearRacional(1, 4);
		Racional sieteQuintos = crearRacional(7, 5);
		//TODO: crear más racionales
		//TODO: comparar racionales, mostrar racional por terminal, realizar operaciones sobre racionales
	}
	
	
	private static Racional crearRacional(int numerador, int denominador) {
		//TODO: implementar la creación y devolución de un Racional de acuerdo con la implementación deseada
		throw new UnsupportedOperationException("Implementar este método");
	}

}
