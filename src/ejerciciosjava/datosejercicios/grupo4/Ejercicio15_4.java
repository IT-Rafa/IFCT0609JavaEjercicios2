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
public class Ejercicio15_4 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio15_4() {
		super(
				15,
				4,
				"Ej. 15 Buscar palabra",
				"EJERCICIO 15 SWING\n\n"
				+ "Ejercicico gráfico que muestre una lista de palabras,"
						+ " te permita introducir una, y mediante un botón,"
						+ " te indique si la palabra está en la lista."
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
