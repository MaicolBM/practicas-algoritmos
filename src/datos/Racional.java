package datos;

/**
* La interface {@code Racional} representa un número racional, formado por un numerador y un denominador enteros.
* 
* Las operaciones ofrecidas por cualquier implementación de esta clase son:
* <ul>
*   <li> sumar		: Suma otro racional a este.</li>
*   <li> multiplicar	: Multiplica otro racional a este.</li>
*   <li> negar		: Niega este racional, equivalente a multiplicar por {@code -1}.</li>
*   <li> dividir	: Divide este racional por otro..</li>
*   <li> repOk		: Permite validar si una instancia satisface el invariante de representación.</li>
*   <li> toString	: Retorna una representación en forma de cadena.</li>
*   <li> equals		: Permite evaluar si otro racional es igual a este.</li>
*   <li> compareTo	: Permite comparar este racional a otro para determinar la relación de orden.</li>
* </ul>
* @param Impl : el tipo que implementa Racional.
* @version 1.1
*/
public interface Racional<Impl extends Racional> extends Comparable<Impl> {

	/**
	* Suma otro racional a este, modificando este racional con el resultado.
	* @param otro el racional a sumar
	*/
	public void sumar(Impl otro);

	/**
	* Multiplica otro racional a este, modificando este racional con el resultado.
	* @param otro el racional a multiplicar
	*/
	public void multiplicar(Impl otro);

	/**
	* Niega este racional, equivalente a multiplicar por {@code -1}, modificando este racional con el resultado.
	*/
	public void negar();

	/**
	* Divide este racional por otro, modificando este racional con el resultado.
	* @param otro el racional por el cual dividir a este
	*/
	public void dividir(Impl otro);

	/**
	* El invariante de represantacion
	* @return {@code true} sii este racional satisface su invariante de clase
	*/
    	public boolean repOk();

	@Override
	public String toString();
	
	/**
	* Compara este elemento con otro del mismo tipo.
	* Es decir, comparar distintas implementaciones de {@code Racional} retorna {@code false}.
	*/
	@Override
	public boolean equals(Object otro);
	
	@Override
	public int compareTo(Impl otro);
		
}