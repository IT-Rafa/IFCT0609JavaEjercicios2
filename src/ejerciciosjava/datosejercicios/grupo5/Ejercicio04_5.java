/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo5;

import ejerciciosjava.datosejercicios.grupo4.*;
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

public class Ejercicio04_5 extends Ejercicio{

	//ATRIBUTOS

	//CONSTRUCTOR

	public Ejercicio04_5() {
		super(
				4,
				4,
				"Ej. 4 Perímetro dadas tres coordenadas",
				"Tiene que hacer muchas cosas que corresponden al ejercicio 4 del grupo Swing");
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
