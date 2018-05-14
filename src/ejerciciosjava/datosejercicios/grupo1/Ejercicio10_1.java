/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo1;

import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 10 del grupo 1
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio10_1 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio10_1() {
		super(10,
				1,
				"Ej. 10 Número primo",
				"EJERCICIO BÁSICO 10\n\n"
				+ "Pide un números por teclado e indica si es un números primo o no.");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		System.out.println("Ejecucion en ventana del ejercicio 10 del grupo 1");
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejecucion en consola del ejercicio 10 del grupo 1");
	}

	//METODOS PUBLICOS
	//METODOS PRIVADOS
	//METODOS ESTÁTICOS
}
