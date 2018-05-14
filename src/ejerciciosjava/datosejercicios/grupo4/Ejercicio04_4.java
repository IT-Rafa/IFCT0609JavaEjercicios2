/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo4;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 4 del grupo 4
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio04_4 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio04_4() {
		super(
				4,
				4,
				"Ej. 4 Perímetro dadas tres coordenadas",
				"EJERCICIO 4 SWING\n\n"
				+ "Programar aplicación gráfica que reciba las coordenadas de tres"
				+ "puntos que corresponden a los vértices de un triángulo y calcule su perímetro.\n"
				+ "Datos: puntox1,puntox2,puntox3,puntoy1,puntoy2,puntoy3.\n"
				+ "Consideraciones:\n"
				+ "a. Para calcular la distancia de dos puntos dados, aplicar la siguiente formula:\n"
				+ "d = √( ( x1 - x2 )² + ( y1 - y2 )² )"
				+ "\n\n (Ver carpeta enunciados para ver enunciados originales)");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		VentanaEj4 inicio = new VentanaEj4();
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
