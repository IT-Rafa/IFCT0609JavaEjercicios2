/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo4;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejerdcicio 6 del grupo 4
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio06_4 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio06_4() {
		super(
				6,
				4,
				"Ej. 6 Práctica botones y checkbox",
				"EJERCICIO 6 SWING\n\n"
				+ "Crear nueva aplicación con:"
				+ "2 botones (hola, bienvenidos)"
				+ "2 checkbox(hola, bienvenidos)\n"
				+ "Al pulsar botón hola se seleccione el check correspondiente"
				+ "y se desmarque el resto y lo mismo con el botón bienvenido"
				+ "\n\n (Ver carpeta enunciados para ver enunciados originales)");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		VentanaEj6 inicio = new VentanaEj6();
		inicio.setVisible(true);
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejecucion en consola del ejerdcicio 6 del grupo 4");
	}

	//METODOS PUBLICOS
	//METODOS PRIVADOS
	//METODOS ESTÁTICOS
}
