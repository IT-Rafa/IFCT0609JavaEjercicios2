/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo4;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejerdcicio 6 del grupo 4
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio14_4 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio14_4() {
		super(
				14,
				4,
				"Ej. 13-14 Adivina el numero",
				"EJERCICIO 14 SWING\n\n"
				+ "Aplicación gráfica para adivinar un número.\n"
				+ " - Se generará número aleatorio del 0 al 50\n"
				+ " - Escribir un número e indicar si es mayor o menor que el generado.\n"
				+ " - Mostrar los intentos en un textArea"
				+ "\n\n (Ver carpeta enunciados para ver enunciados originales)");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		VentanaEj6 inicio = new VentanaEj6();
		inicio.setVisible(true);
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejecucion en consola del ejerdcicio 6 del grupo 4");
	}

	//METODOS PUBLICOS
	//METODOS PRIVADOS
	//METODOS ESTÁTICOS
}
