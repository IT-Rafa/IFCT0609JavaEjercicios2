/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo4;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 2 del grupo 4
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio02_4 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio02_4() {
		super(
				2,
				4,
				"Ej. 2 Hallar área y volumen de cilindro",
				"EJERCICIO 2 SWING\n\n"
				+ "En entorno gráfico, la aplicación debe pedir radio y altura de un cilindro"
				+ "y calcular y mostrar el área y volumen.\n"
				+ "a. Volumen=PI * RADIO^2 * ALTURA\n"
				+ "b. Área = 2 * PI * RADIO * ALTURA"
				+ "\n\n (Ver carpeta enunciados para ver enunciados originales)");

	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		VentanaEj2 inicio = new VentanaEj2();
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
