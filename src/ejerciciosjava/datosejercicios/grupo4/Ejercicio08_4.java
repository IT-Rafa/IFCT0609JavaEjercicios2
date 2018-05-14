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
public class Ejercicio08_4 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio08_4() {
		super(
				8,
				4,
				"Ej. 8 Calcular salario (radioButton)",
				"EJERCICIO 8 SWING\n\n"
				+ "Calcular salario según siguientes criterios:\n"
				+ " - Licenciatura:	3.5%\n"
				+ " - Especialidad:	4.6%\n"
				+ " - Maestria:		5.3%\n"
				+ " - Doctorado:	6.8%\n"
				+ "La aplicación Pedirá: \n"
				+ " - Un salario base con textField\n"
				+ " - El nivel académico (con cuarto checkbox)\n"
				+ "y mostrará el salario anterior, el salario total y el porcentaje de aumento\n"
				+ "Incluir dos botones (calcular y Reiniciar) con el siguiente comportamiento:\n"
				+ "- Boton Calcular, Halla y muestra el resultado."
				+ "- Boton reinciar, Deja los datos como al inicio"
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
