/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo5;

import ejerciciosjava.datosejercicios.grupo4.*;
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

public class Ejercicio02_5 extends Ejercicio{

	//ATRIBUTOS

	//CONSTRUCTOR

	public Ejercicio02_5() {
        super(
                2,
                5,
                "Ej. 2 Guardar y escribir fichero",
                "EJERCICIO 2\n\n"
                + "Formulario que permite guardar los datos de un textArea en"
                        + "un archivo de texto o cargar los datos de un archivo"
                        + "y mostrar los en un txtArea. \n"
                        + "Mejoras\n"
                        + " - Permitir elegir archivo y ruta para archivo texto"
                        + " - Permitir elegir si se borra el texto anterior o se añade ");
    }

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
        VentanaEj2_5 inicio = new VentanaEj2_5();
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
