/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo2;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 5 del grupo 2
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Ejercicio05_2 extends Ejercicio{

	//ATRIBUTOS

	//CONSTRUCTOR

	public Ejercicio05_2() {
		super(
				5,
				2,
				"Ej. 5 Dividir cifras de número y ponerlas al revés",
				"Tiene que hacer muchas cosas que corresponden al ejercicio 5 del grupo boletin");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		System.out.println("Ejecucion en ventana del ejercicio 5 del grupo 2");
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejecucion en consola del ejercicio 5 del grupo 2");
	}
	
	//METODOS PUBLICOS

	//METODOS PRIVADOS

	//METODOS ESTÁTICOS

}
