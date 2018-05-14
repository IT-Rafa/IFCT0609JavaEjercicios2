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
public class Ejercicio05_4 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio05_4() {
		super(
				5,
				4,
				"Ej. 5 Práctica JTextArea y eventos",
				"EJERCICIO 5 SWING\n\n"
				+ "Aplicación gráfica con los siguientes componentes:\n"
				+ " - 1 jTextArea\n"
				+ " - 2 botones (ocultar, mostrar)=\n"
				+ "Al pulsar el boton ocultar, el texto desaparece y "
				+ "al pulsar mostrar, vuelva a aparecer.\n"
				+ "Ampliaciones:\n"
				+ "1 Al pulsar mostrar, cambia también el color del texto a rojo.\n"
				+ "2 Al pulsar mostrar cambia el fondo del texto a amarillo.\n"
				+ "3 Al pulsar ocultar, deshace todos los cambios"
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
