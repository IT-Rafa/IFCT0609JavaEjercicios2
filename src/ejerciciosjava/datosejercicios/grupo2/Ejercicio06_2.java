/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo2;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejerdcicio 6 del grupo 2
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Ejercicio06_2 extends Ejercicio{

	//ATRIBUTOS

	//CONSTRUCTOR

	public Ejercicio06_2() {
		super(
				6,
				2,
				"Ej. 6 Calcular número de la suerte",
				"Tiene que hacer muchas cosas que corresponden al ejerdcicio 6 del grupo boletin");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		System.out.println("Ejecucion en ventana del ejerdcicio 6 del grupo 2");
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejecucion en consola del ejerdcicio 6 del grupo 2");
	}
	
	//METODOS PUBLICOS

	//METODOS PRIVADOS

	//METODOS ESTÁTICOS

}
