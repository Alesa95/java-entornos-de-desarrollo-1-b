package modelos;

/**
 * Clase que representa una figura geometrica
 * 
 * @version 1.0
 * 
 * @author Alejandra
 */
public abstract class Figura {

	/**
	 * Devuelve el area de la figura, en metros cuadrados
	 * 
	 * @return		el area de la figura, en metros cuadrados
	 */
	public abstract double area();
	
	/**
	 * Devuelve el perimetro de la figura, en metros
	 * 
	 * @return		el perimetro de la figura, en metros
	 */
	public abstract double perimetro();
}
