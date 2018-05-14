/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo4;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 1 del grupo 4
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Ejercicio18_4 extends Ejercicio{

	//ATRIBUTOS

	//CONSTRUCTOR

	public Ejercicio18_4() {
		super(
				18,
				4,
				"Ej. 18 Juego dados",
				"Tiene que hacer muchas cosas que corresponden al ejercicio 1 del grupo Swing");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
        VentanaEj1 inicio = new VentanaEj1();
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
