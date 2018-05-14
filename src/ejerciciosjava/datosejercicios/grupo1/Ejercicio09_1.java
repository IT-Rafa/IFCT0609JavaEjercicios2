/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo1;

import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 9 del grupo 1
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio09_1 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio09_1() {
		super(
				9,
				1,
				"Ej. 9 Día laboral",
				"EJERCICIO BÁSICO 9\n\n"
				+ "Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no.\n"
				+ "Usa un switch para ello.");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		System.out.println("Ejecucion en ventana del ejercicio 9 del grupo 1");
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejecucion en consola del ejercicio 9 del grupo 1");
	}

	//METODOS PUBLICOS
	//METODOS PRIVADOS
	//METODOS ESTÁTICOS
}
