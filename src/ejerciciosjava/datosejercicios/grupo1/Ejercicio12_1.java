/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo1;

import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 12 del grupo 1
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio12_1 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio12_1() {
		super(12,
				1,
				"Ejercicio basico 12",
				"EJERCICIO BÁSICO 12\n\n"
				+ "Dada una cadena por teclado, indica cuantas vocales contiene.\n "
				+ "Reemplaza todas las a del String anterior por una e.");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		System.out.println("Ejecucion en ventana del ejercicio 12 del grupo 1");
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejecucion en consola del ejercicio 12 del grupo 1");
	}

	//METODOS PUBLICOS
	//METODOS PRIVADOS
	//METODOS ESTÁTICOS
}
