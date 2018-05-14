/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo3;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 4 del grupo 3
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Ejercicio04_3 extends Ejercicio{

	//ATRIBUTOS

	//CONSTRUCTOR

	public Ejercicio04_3() {
		super(4, 31, "Ejercicio clases 4", "Tiene que hacer muchas cosas que corresponden al ejercicio 4 del grupo clases");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		System.out.println("Ejecucion en ventana del ejercicio 4 del grupo 3");
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejecucion en consola del ejercicio 4 del grupo 3");
	}
	
	//METODOS PUBLICOS

	//METODOS PRIVADOS

	//METODOS ESTÁTICOS

}
