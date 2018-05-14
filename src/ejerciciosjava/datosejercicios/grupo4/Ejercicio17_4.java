/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo4;

import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 7 del grupo 4
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio17_4 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio17_4() {
		super(
				17,
				4,
				"Ej. 17 Signo zodiaco",
				"EJERCICIO 17 SWING\n\n"
				+ "Aplicación gráfica que, tras introducir el día y mes de nacimiento, "
						+ "te indique el signo y muestre una imagen que lo represente."
				+ "\n\n (Ver carpeta enunciados para ver enunciados originales)");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		VentanaEj7 inicio = new VentanaEj7();
		inicio.setVisible(true);
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejecucion en consola del ejercicio 7 del grupo 4");
	}

	//METODOS PUBLICOS
	//METODOS PRIVADOS
	//METODOS ESTÁTICOS
}
