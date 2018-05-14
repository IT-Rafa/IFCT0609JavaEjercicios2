/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo4;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 5 del grupo 4
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Ejercicio16_4 extends Ejercicio{

	//ATRIBUTOS

	//CONSTRUCTOR

	public Ejercicio16_4() {
		super(
				16,
				4,
				"Ej. 16 Buscar y contar palabra",
				"EJERCICIO 16 SWING\n\n"
				+ "Ejercicico gráfico que muestre una lista de palabras,"
						+ " te permita introducir una, y mediante un botón,"
						+ " te indique si la palabra está en la lista y cuantas veces."
				+ "\n\n (Ver carpeta enunciados para ver enunciados originales)");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
        VentanaEj5 inicio = new VentanaEj5();
        inicio.setVisible(true);
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejercicio Swing: Solo de Ventanas");
	}
	
	//METODOS PUBLICOS

	//METODOS PRIVADOS

	//METODOS ESTÁTICOS

}
