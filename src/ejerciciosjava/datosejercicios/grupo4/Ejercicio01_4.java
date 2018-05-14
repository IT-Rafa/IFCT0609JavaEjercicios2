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

public class Ejercicio01_4 extends Ejercicio{

	//ATRIBUTOS

	//CONSTRUCTOR

	public Ejercicio01_4() {
		super(
				1,
				4,
				"Ej. 1 Botones Cambio fondo rojo azul",
				"EJERCICIO 1 SWING\n\n"
						+ "Crear aplicación que muestre dos botones, 'rojo' y 'azul' de manera que "
						+ "cada uno de ellos cambie el color del fondo del panel al indicado en el botón"
+ "\n\n (Ver carpeta enunciados para ver enunciados originales)");
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
