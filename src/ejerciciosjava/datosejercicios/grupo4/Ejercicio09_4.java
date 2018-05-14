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
public class Ejercicio09_4 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio09_4() {
		super(
				9,
				4,
				"Ej. 9 Elegir función (ComboBox)",
				"EJERCICIO 9 SWING\n\n"
				+ "Aplicación gráfica que pide un dato tipo entero y de 2 opciones,"
				+ "según las cuales hará una operación u otra.\n"
				+ "Contiene: "
				+ " - 1 textField para entrada dato\n"
				+ " - 1 ComboBox para elegir opción\n"
				+ " - 2 Botones (calcular, reiniciar)\n"
				+ " - 1 textField o similar para mostrar resultado\n"
				+ "Además, si se introduce un número menor de 0 debe mostrar un aviso en otra ventana"
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
